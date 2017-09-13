package com.metacube.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.metacube.controller.Controller;

/**
 * @author gourav
 *
 */
public class Display {

	public static void displayMenu() {
		
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		do{
			
			System.out.println("\n1) Fetch all the books published by author.");
			System.out.println("2) Given the name of the book, to be issued by an existing member."
					+ "Return flag to indicate whether the  the book has been issued or not");
			System.out.println("3) Delete all those books which were not issued in last 1 year. "
					+ "Return the number of books deleted.");
			System.out.println("4) exit");
			int input =scan.nextInt();
			switch(input){
				case 1:
					System.out.println("\nEnter the name of the author");
					scan.nextLine();
					String author_name = scan.nextLine();
					try{
						if(Controller.findBookByAuthor(author_name)){
							DisplayOutput.diplaybooks();
						}else{
							System.out.println("No books present for this author.");
						}
					}catch(SQLException exp){
					
						System.out.println(exp);
					}
					break;
				case 2:
					System.out.println("\nEnter the name of the Book ");
					scan.nextLine();
					String book_name = scan.nextLine();
					try{
						if(Controller.findBookCanBeIssued(book_name)){
							DisplayOutput.displayResult();
						}else{
							System.out.println("The book is not available for issuse");
						}
					}catch(SQLException exp){
						System.out.println(exp);
					}
					break;
				case 3:
					
					try{
						int count=Controller.deleteBookNotIssusedForAyear();
						DisplayOutput.displayResult(count);
					}catch(SQLException exp){
						System.out.println(exp);
					}
					
					break;
				case 4:
					flag=false;
			}
			
		}while(flag);
		scan.close();
	}

}
