package com.metacube.doublylinkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static <E extends Comparable<E>> void main(String[] args) {
		
		MyDoublyLinkedList<E> myDoublyLinkedList= new MyDoublyLinkedList<E>();
		boolean flag=true;
		E element;
		int index;
		Scanner scan =new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("Please enter your choice :-");
			System.out.println();
			System.out.println("1)Add item");
			System.out.println("2)Add item at particular index");
			System.out.println("3)Get item from a given index");
			System.out.println("4)Remove item from an index");
			System.out.println("5)Remove an item by value");
			System.out.println("6)Reverse");
			System.out.println("7)Sort");
			System.out.println("8)Print");
			System.out.println();
			
			int input= scan.nextInt();
			switch(input){
			
			case 1:
				System.out.println("Enter an item to add");
				myDoublyLinkedList.add((E) scan.next());
				break;
			case 2:
				System.out.println("Enter item to add");
					element=(E) scan.next();
				System.out.println("Enter the position of the data");
					index=scan.nextInt();
				
				if(myDoublyLinkedList.check(index)){
					myDoublyLinkedList.addToPosition(index, element);
				}else{
					System.out.println("Entered index is not valid");
				}
				break;
			
			case 3:
				System.out.println("Enter the index from where you want to retrive the item");
					index=scan.nextInt();
					if(myDoublyLinkedList.check(index)){
						element=myDoublyLinkedList.getFromPosition(index);
						System.out.println("Element is " + element);
					}
					else{
						System.out.println("Invalid index");
					}
				 break;
			case 4:
				System.out.println("Enter the index ");
				index=scan.nextInt();
				if(myDoublyLinkedList.check(index)){
					myDoublyLinkedList.removeFromPosition(index);
				}else{
					System.out.println("Invalid index");
				}
				break;
			case 5:
				System.out.println("Enter item to delete");
				element=(E)scan.next();
				if(myDoublyLinkedList.removeItem(element)){
					
				}else{
					System.out.println("Element not found");
				}
				break;
			case 6:
				myDoublyLinkedList.reverse();
				break;
			case 7:
				myDoublyLinkedList.sort();
				System.out.println("List has been sorted");
				break;
			case 8:
				Iterator<E> temp = myDoublyLinkedList.iterator();
				for (E x : myDoublyLinkedList) {

					while (temp.hasNext()) {
						System.out.println(temp.next());

					}
				}

				break;
				
			
			
			}
			
		}while(flag);

	}

}
