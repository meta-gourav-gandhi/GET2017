/**
 * 
 */
package main.java.com.metacube.assignment2;

import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		Assignment2Imp objectImp = new Assignment2Imp();
		String input;
		do{
			
			System.out.println("\nEnter the string ");
			String userInput=scan.nextLine();
			Long uniqueChar=objectImp.add(userInput);
			System.out.println("\n" + "Number of unique characters are " + uniqueChar);
			System.out.println("Want to add another string - Y/N");
			input=scan.nextLine();
			
		}while(input.equalsIgnoreCase("Y"));

	}

}
