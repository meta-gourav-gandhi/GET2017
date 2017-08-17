package com.metacube.shoppingcart.main;

import java.util.Scanner;

import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.view.DisplayInput;
import com.metacube.shoppingcart.view.DisplayOutput;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductController.createProductList();
		DisplayOutput.displayProduct();		
		
		boolean flag=true;
		do{
		System.out.println();	
		System.out.println("1) Buy Products");	
		System.out.println("2) See my cart ");
		System.out.println("3) Edit my cart");	
		System.out.println("4) Print bill and exit");	
		System.out.println();
		System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		switch(input){
		case 1:
			DisplayInput.takeInput();
			break;
		case 2:
			DisplayOutput.printCart();
			break;
		case 3:
			DisplayInput.editCart();
			break;
			
		case 4:
			DisplayOutput.printBill();
			flag=false;
			break;
		default:
			System.out.println("Please select from the given options");
		}
			
			
		}while(flag);
		
		
		
	}

}
