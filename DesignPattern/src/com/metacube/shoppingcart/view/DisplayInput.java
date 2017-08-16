package com.metacube.shoppingcart.view;

import java.util.Scanner;

import com.metacube.shoppingcart.controller.ShopingCartController;
import com.metacube.shoppingcart.facade.ProductFacade;
import com.metacube.shoppingcart.model.ShopingCart;

public class DisplayInput {

	static Scanner scan =new Scanner(System.in);
	
	/**
	 * Method to take input from the user 
	 */
	public static void takeInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Product to buy");
		int num=scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			ShopingCart items=new ShopingCart();
			System.out.println("Enter the code of the product");
			String code=scan.next();
			
			while(!ProductFacade.checkCode(code)){
				System.out.println("Entered product is not available");
				System.out.println("Enter the code of the product");
				code=scan.next();
			}
			items.setCode(code);
			System.out.println("Enter the quantity of the product");
			items.setQuantity(scan.nextInt());
			
			ShopingCartController.getCart().add(items);
			
		}
	}

	/**
	 * options to edit cart like delete the product from the cart and 
	 * and edit the quantity from the cart
	 */
	public static void editCart() {
		// TODO Auto-generated method stub
		
		
		
		boolean flag=true;
		do{
		System.out.println();	
		System.out.println("1) Buy new Products");	
		System.out.println("2) Edit the quantity of the products in the cart.");
		System.out.println("3) Delete the product in the cart");	
		System.out.println("4) exit to main menu");	
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		switch(input){
		case 1:
			DisplayInput.takeInput();
			break;
		case 2:
			DisplayInput.editProduct();
			break;
		case 3:
			DisplayInput.deleteCartProduct();
			break;
			
		case 4:
			flag=false;
			break;
		}
			
			
		}while(flag);
		
		
		
		
	}

	/**
	 * method to dalete product from the cart
	 */
	private static void deleteCartProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the code of the product you want to delete :- ");
		String code= scan.next();
		if(ShopingCartController.checkCartProduct(code)){
			
			ShopingCartController.deleteCartProduct(code);
			System.out.println("Selected product has been deleted");
		}else{
			System.out.println("Entered product is not in yout cart");
		}
		
		
	}

	/**
	 * method to edit the quantity of the product
	 */
	private static void editProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the code of the product you want to edit the quantity :- ");
		String code= scan.next();
		if(ShopingCartController.checkCartProduct(code)){
			System.out.println("Enter the new quantity:-");
			
			int quantity=scan.nextInt();
			while(quantity<1){
				System.out.println("Please enter a valid quantity : - ");
				 quantity=scan.nextInt();
			}
			ShopingCartController.editCartProduct(code,quantity);
			
			
			System.out.println("Product quantity has been updated");
		}else{
			System.out.println("Entered product is not in yout cart");
		}
		
	}

}
