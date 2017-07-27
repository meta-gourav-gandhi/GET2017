package metacube.menudriven;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import metacube.shoppingterminal.OrderPromotion;
import metacube.shoppingterminal.Product;
import metacube.shoppingterminal.ProductPromotion;
import metacube.shoppingterminal.Shopping;

/**
 * @author gourav gandhi
 * 
 */
public class Main {

	/**
	 * this funtion will create a menu list for the user
	 * @return will return the object of menu class 
	 */
	public static Menu createMenu() {
		
		Menu mainMenu = new Menu();
		MenuItem menuitem = new ActionableMenuItem(new Product());
		List<MenuItem> subMenu = mainMenu.getSubMenu();				//creating 1st menuitem 
		menuitem.setDisplayName("1.Display Product List");
		subMenu.add(menuitem);

		menuitem = new Menu();
		menuitem.setDisplayName("2.Display Promotion List");		//creating 2nd menuitem
		subMenu.add(menuitem);
		
		List<MenuItem> subPromoMenu = ((Menu) menuitem).getSubMenu();
		menuitem = new ActionableMenuItem(new ProductPromotion());	//creating sub-menu for 2nd menuitem
		menuitem.setDisplayName("1: Product Promotion");
		subPromoMenu.add(menuitem);

		menuitem = new ActionableMenuItem(new OrderPromotion());
		menuitem.setDisplayName("2: Order Promotion");
		subPromoMenu.add(menuitem);

		menuitem = new ActionableMenuItem(new Shopping());			//creating 3rd menuitem
		menuitem.setDisplayName("3.Order");
		subMenu.add(menuitem);

		menuitem = new ActionableMenuItem(new Exit());				//creating 4th menu 
		menuitem.setDisplayName("4.Exit");
		subMenu.add(menuitem);

		return mainMenu;

	}

	/**
	 * @param menu take the menu object to display its list
	 * 
	 */
	public static void display(Menu menu) {

		Iterator<MenuItem> itr = menu.getSubMenu().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().getDisplayName());
		}

	}

	public static int getInput() {
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		return choice - 1;
	}

	/**
	 * will display the list and will trigger action
	 * @param menu contains the list to display 
	 */
	public static void displayAndPerformAction(Menu menu) {

		display(menu);

		int choice = getInput();

		MenuItem menuItem = menu.getSelection(choice);

		if (menuItem == null) {
			displayAndPerformAction(menu);
		} else if (menuItem instanceof ActionableMenuItem) {

			((ActionableMenuItem) menuItem).triggerAction();

		} else {
			displayAndPerformAction((Menu) menuItem);
		}
	}

	public static void main(String args[]) {
		Menu menu = createMenu();

		while (true) {
			displayAndPerformAction(menu);
			System.out.println();
		}

	}
}
