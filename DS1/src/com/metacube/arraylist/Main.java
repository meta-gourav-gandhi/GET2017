package com.metacube.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static <E extends Comparable<E>> void main(String[] args) {

		MyArrayList<E> myarray = new MyArrayList<E>();

		boolean flag = true;
		E element;
		int index;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Please enter your choice :-");
			System.out.println();
			System.out.println("1)Add item");
			System.out.println("2)Add item at particular index");
			System.out.println("3)Get item from a given index");
			System.out.println("4)Get index of the item");
			System.out.println("5)Remove item from an index");
			System.out.println("6)Remove an item");
			System.out.println("7)Clear");
			System.out.println("8)Reverse");
			System.out.println("9)Sort");
			System.out.println("10)Print");
			System.out.println();

			int input = scan.nextInt();
			switch (input) {

			case 1:
				System.out.println("Enter an item to add");
				myarray.add((E) scan.next());
				break;
			case 2:
				System.out.println("Enter item to add");
				element = (E) scan.next();
				System.out.println("Enter the position of the data");
				index = scan.nextInt();

				if (myarray.addToPosition(index, element)) {

				} else {
					System.out.println("Entered index is not valid");
				}
				break;

			case 3:
				System.out
						.println("Enter the index from where you want to retrive the item");
				index = scan.nextInt();
				if (myarray.check(index)) {
					element = myarray.getFromPosition(index);
					System.out.println("Element is " + element);
				} else {
					System.out.println("invalid index");
				}
				break;
			case 4:
				System.out.println("Enter the element you want to find");
				index = myarray.getIndex((E) scan.next());
				if (index != -1) {
					System.out.println("Element is present at index " + index);
				} else {
					System.out.println("Element is not present");
				}

				break;
			case 5:
				System.out.println("Enter the index ");
				index = scan.nextInt();
				if (myarray.check(index)) {
					myarray.removeFromPosition(index);
				} else {
					System.out.println("Invalid index");
				}
				break;
			case 6:
				System.out.println("Enter item to delete");
				element = (E) scan.next();
				if (myarray.removeItem(element)) {

				} else {
					System.out.println("Element not found");
				}
				break;
			case 7:
				myarray.clear();
				System.out.println("List has been cleared");
				break;
			case 8:
				myarray.reverse();
				System.out.println("list has been reversed");
				break;
			case 9:
				myarray.sort();
				System.out.println("list has been sorted");
			case 10:
				Iterator<E> temp = myarray.iterator();
				for (E x : myarray) {

					while (temp.hasNext()) {
						System.out.println(temp.next());

					}
				}

				break;
			}

		} while (flag);

	}

}
