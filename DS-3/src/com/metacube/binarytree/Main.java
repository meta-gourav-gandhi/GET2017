package com.metacube.binarytree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		BinaryTree<Integer> bst = new BinaryTree<Integer>(); 
		String result;
		do{
			System.out.println();
			System.out.println("1) Add element");
			System.out.println("2) Print Inorder");
			System.out.println("3) Print PostOrder");
			System.out.println("4) Print PreOrder");
			System.out.println("5) Check for mirror");
			System.out.println("Enter your choice");
			int input =scan.nextInt();
			switch(input){
			case 1:
				System.out.println("Enter number of element in your tree ");
				int counter=scan.nextInt();
				System.out.println("enter elements");
				for (int index = 0; index < counter; index++){
					bst.insert(scan.nextInt());
				}
				break;
			case 2:
				result=bst.inOrder();
				System.out.println(result);
				break;
			case 3:
				result=bst.postOrder();
				System.out.println(result);
				break;
			case 4:
				result=bst.preOrder();
				System.out.println(result);
				break;
			case 5:
				System.out.println("Enter number of element in your new tree ");
				 counter=scan.nextInt();
				System.out.println("enter elements");
				BinaryTree<Integer> btmirror = new BinaryTree<Integer>(); 
				for (int index = 0; index < counter; index++) {
					btmirror.mirrorinsert(scan.nextInt());	
				}
				if(bst.checkMirror(btmirror)){
					System.out.println("Trees are mirrored");
				}
				else{
					System.out.println("Trees are not mirrored");
				}
				
				
				break;
			}
			
			
		}while(true);

	}

}
