package com.metacube.dao;

import java.util.ArrayList;
import java.util.List;

import com.metacube.model.BookDetails;

public class BookDetailsDao {
	
	static List<BookDetails> booksDetails = new ArrayList<BookDetails>();

	/**
	 * @return the data of the book
	 */
	public static List<BookDetails> getBooksDetails() {
		return booksDetails;
	
	}
}
