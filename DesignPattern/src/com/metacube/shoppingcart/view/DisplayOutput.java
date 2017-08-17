package com.metacube.shoppingcart.view;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.controller.ShopingCartController;
import com.metacube.shoppingcart.dao.FileHandling;
import com.metacube.shoppingcart.model.Product;
import com.metacube.shoppingcart.model.ShopingCart;

public class DisplayOutput {

	static Scanner scan =new Scanner(System.in);
	public static void displayProduct() {
		// TODO Auto-generated method stub
		HashMap<String, Product> productdata = ProductController.displayProduct();
		
		for (String pro: productdata.keySet()){

             System.out.print(productdata.get(pro).getCode() + " "); 
             System.out.print(productdata.get(pro).getName() + " "); 
             System.out.print(productdata.get(pro).getPrice() + " ");
             System.out.println();
			} 
	}

	public static void printBill() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name");
		String name=scan.next();
		String bill="";
		List<ShopingCart> cart =ShopingCartController.getCart(); 
		
		bill +="#########################################"+"\n";
		bill +="           Your bill is "+"\n";
		bill +="#########################################"+"\n";
		
		Double price=0.0;
		for(ShopingCart item : cart){
			
			Product productObject=ProductController.getDetails(item.getCode());
			bill += (productObject.getCode() + " -> " + productObject.getName()) + "\n";
			bill += "Cost :- " + (productObject.getPrice()*item.getQuantity()) + "( "+productObject.getPrice()+ "*" +item.getQuantity()+")" + "\n";
			price += productObject.getPrice()*item.getQuantity();
			bill +="\n";
		}
		bill +="\n" + "your total is :- " + price + "\n";
		
		FileHandling.generateBill(bill,name);
		
		System.out.println("your bill has been generated.");
		
	}

	/**
	 * 
	 */
	public static void printCart() {
		// TODO Auto-generated method stub
		
		List<ShopingCart> cart =ShopingCartController.getCart(); 
		System.out.println("#########################################");
		System.out.println("           Your cart contains:-  ");
		System.out.println("#########################################");
		Double price=0.0;
		
		for(ShopingCart item : cart){
			
			Product productObject=ProductController.getDetails(item.getCode());
			System.out.println(productObject.getCode() + " -> " + productObject.getName());
			System.out.println("Cost :- " + productObject.getPrice()*item.getQuantity() + "( "+productObject.getPrice()+ "*" +item.getQuantity()+")");
			price += productObject.getPrice()*item.getQuantity();
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("#########################################");
		System.out.println("Your total is:-"+ price);
		
	}
	

}
