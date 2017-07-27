package com.metacube.menudriven;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import metacube.oops3.shoppingterminal.OrderPromotion;
import metacube.oops3.shoppingterminal.Product;
import metacube.oops3.shoppingterminal.ProductPromotion;


public class Main {

	public  static Menu createMenu(){
		Menu mainMenu=new Menu();
		
		MenuItem menuitem=new ActionableMenuItem(new Product());
		List<MenuItem> subMenu=mainMenu.getSubMenu();
		menuitem.setDisplayName("1.Display Product List");
		subMenu.add(menuitem);
		
		menuitem=new Menu();
		menuitem.setDisplayName("2.Display Promotion List");
		
		subMenu.add(menuitem);
		List<MenuItem> subPromoMenu=((Menu) menuitem).getSubMenu();
		
		menuitem=new ActionableMenuItem(new ProductPromotion());
        menuitem.setDisplayName("A:Product Promotion");
        subPromoMenu.add(menuitem);
        
        menuitem=new ActionableMenuItem(new OrderPromotion());
        menuitem.setDisplayName("B:Order Promotion");
        subPromoMenu.add(menuitem);

		
		
		
        menuitem=new ActionableMenuItem(new DisplayProductList());
		menuitem.setDisplayName("3.Order");
		subMenu.add(menuitem);
		
		menuitem=new ActionableMenuItem(new DisplayProductList());
		menuitem.setDisplayName("4.Exit");
		subMenu.add(menuitem);
		
		return mainMenu;
		
	}
	
	public static void display(Menu menu){
		
		Iterator<MenuItem> itr=menu.getSubMenu().iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next().getDisplayName());
		}
		
		
	}
	
	public static int getInput(){
		Scanner scan= new Scanner(System.in);
		int choice=scan.nextInt();

		return choice-1;
	}
	
	public static void displayAndPerformAction(Menu menu){
		
		display(menu);
		
		int choice=getInput();
		
		MenuItem menuItem= menu.getSelection(choice);
	
		
		if(menuItem==null){
			displayAndPerformAction(menu);
		}
		else if(menuItem instanceof ActionableMenuItem){
			
			((ActionableMenuItem)menuItem).triggerAction();
			
		}
		else{
			displayAndPerformAction((Menu)menuItem);
		}
	}
	public static void main(String args[]){
		Menu menu=createMenu();
		
		while(true){
		displayAndPerformAction(menu);
		}
		
		
	}
}
