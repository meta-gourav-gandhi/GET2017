package com.metacube.controller;

import java.sql.SQLException;
import java.util.List;

import com.metacube.dao.BookDetailsDao;
import com.metacube.facade.Facade;
import com.metacube.model.BookDetails;

public class Controller {

	/**
	 * @param author_name name for whom all the books need to be issued
	 * @return boolean if the books are present
	 * @throws SQLException
	 */
	public static boolean findBookByAuthor(String author_name) throws SQLException {
	
		return Facade.findBookByaAuthor(author_name);
	}

	/**
	 * @return the list of the books of the given author
	 */
	public static List<BookDetails> getBookData() {
		
		return BookDetailsDao.getBooksDetails();
	}

	/**
	 * @param book_name to find if it can be issued or not
	 * @return boolean if it can be issued
	 * @throws SQLException
	 */
	public static boolean findBookCanBeIssued(String book_name) throws SQLException {
		
		return Facade.findBookCanBeIssused(book_name);
	}

	/**
	 * @return the number of books that has not been issued for more than a year
	 * @throws SQLException
	 */
	public static int deleteBookNotIssusedForAyear() throws SQLException {
		
		return Facade.deleteBookNotIssusedForAyear();
	}

}
