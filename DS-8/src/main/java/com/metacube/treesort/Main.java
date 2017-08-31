/**
 * 
 */
package main.java.com.metacube.treesort;

import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String repeat;
		do {
			BinarySearchTree searchtree = new BinarySearchTree();
			System.out.println();
			System.out.println("Enter number of students");
			int counter = scan.nextInt();
			int students[] = new int[counter];
			System.out.println("Enter roll numbers");
			for (int index = 0; index < counter; index++) {
				students[index] = scan.nextInt();
			}

			int output[] = searchtree.sort(students);
			System.out.println("\nSorted roll numbers are ");
			for (int index = 0; index < students.length; index++) {
				System.out.print(output[index] + " ");
			}

			System.out.println("\nDo you wish to run again : (Y/N)");
			repeat = scan.next();
		} while (repeat.equalsIgnoreCase("Y"));

	}
}