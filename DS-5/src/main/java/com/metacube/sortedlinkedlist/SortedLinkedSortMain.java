package main.java.com.metacube.sortedlinkedlist;

import java.util.Scanner;

public class SortedLinkedSortMain {

	public static void main(String[] args) {

		SortedLinkedList<Integer> sortedObj = new SortedLinkedList<Integer>();

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("1) add element");
			System.out.println("2) print");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter data");
				int element = 0;
				try {
					element = scan.nextInt();
					sortedObj.add(element);
				} catch (Exception e) {
					System.out.println("Enter numbers only");
				}
				break;
			case 2:
				System.out.println(sortedObj.sortedLinkedList.toString());
			default:
				System.out.println("Please enter only valid data");
			}

		} while (true);

	}

}
