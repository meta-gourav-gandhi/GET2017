package com.metacube.facade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.metacube.dao.BookDetailsDao;
import com.metacube.dao.CreateConnection;
import com.metacube.model.BookDetails;

public class Facade {

	static Connection connection; 
	static PreparedStatement preparedStatement;
	/**
	 * @param author_name to find the books by the author
	 * @return boolean
	 * @throws SQLException
	 */
	public static boolean findBookByaAuthor(String author_name)
			throws SQLException {

		connection = CreateConnection.getConnection();
		String query = "Select title_name,accession_no,price from books AS B JOIN title_author AS TA ON B.title_id = TA.title_id "
				+ "JOIN titles AS T ON T.title_id = TA.title_id "
				+ "WHERE TA.author_id = (Select author_id FROM authors WHERE author_name = ?)";

		 preparedStatement = connection
				.prepareStatement(query);
		preparedStatement.setString(1, author_name);
		ResultSet rs = preparedStatement.executeQuery();
		boolean flag = true;
		if (!rs.isBeforeFirst()) {
			flag = false;
		} else {
			List<BookDetails> bookData = BookDetailsDao.getBooksDetails();
			while (rs.next()) {
				BookDetails book = new BookDetails();
				book.setTitle(rs.getString(1));
				book.setAccession_no(rs.getInt(2));
				book.setPrice(rs.getDouble(3));
				bookData.add(book);
			}
		}
		return flag;
	}

	/**
	 * @param book_name that can be issued 
	 * @return boolean
	 * @throws SQLException
	 */
	public static boolean findBookCanBeIssused(String book_name)
			throws SQLException {

		boolean flag = true;
		connection = CreateConnection.getConnection();
		String query = "Select title_id from titles where title_name=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, book_name);
		ResultSet rs = preparedStatement.executeQuery();

		if (!rs.isBeforeFirst()) {
			flag = false;
		} else {

			String query2 = "Select Count(*) From titles as T join books AS B on T.title_id=B.title_id "
					+ "Where ((B.accession_no IN (select BI.accession_no from  book_issue AS BI inner Join book_return AS BR on "
					+ "BI.accession_no=BR.accession_no AND BI.member_id=BR.member_id)) or "
					+ " ( B.accession_no IN (SELECT accession_no FROM books) AND accession_no NOT IN (select accession_no from book_issue) )) "
					+ "AND title_name = ?";
			preparedStatement = connection.prepareStatement(query2);
			preparedStatement.setString(1, book_name);
			ResultSet rs1 = preparedStatement.executeQuery();

			while (rs1.next()) {
				int count = rs1.getInt(1);
				if (!(count > 0)) {
					flag = false;
					break;
				}
			}

		}
		return flag;
	}

	/**
	 * @return the count of books that has not been issused for a year
	 * @throws SQLException
	 */
	public static int deleteBookNotIssusedForAyear() throws SQLException {
		connection = CreateConnection.getConnection();
		String query = "select count(*) from books "
				+ "where (accession_no Not in (Select accession_no from book_issue where timestampdiff(year,issue_date,now())<1) "
				+ "AND accession_no Not in (select accession_no from books where timestampdiff(year,purchase_date,now())<1 ))";

		preparedStatement = connection.prepareStatement(query);
		ResultSet rs = preparedStatement.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

}
