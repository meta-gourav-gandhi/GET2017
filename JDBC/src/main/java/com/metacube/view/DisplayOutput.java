package com.metacube.view;

import java.util.List;

import com.metacube.controller.Controller;
import com.metacube.model.BookDetails;

public class DisplayOutput {

	public static void diplaybooks() {
		
		List<BookDetails> bookData  = Controller.getBookData();
		System.out.println("Title Name \t Accession_no \t Price");
		
		for(BookDetails booktemp : bookData){
			System.out.print(booktemp.getTitle()+"\t");
			System.out.print(booktemp.getAccession_no()+"\t\t ");
			System.out.print(booktemp.getPrice());
			System.out.println();
			
		}
		bookData.clear();
	}

	public static void displayResult() {
		
		System.out.println("Your book is available for issue");
	}

	public static void displayResult(int count) {
		
		System.out.println("Total number of books not issued for a Year :- " + count);
	}

}
