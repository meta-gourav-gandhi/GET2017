/**
 * 
 */
package com.metacube.shoppingcart.controller;

import java.util.List;

import com.metacube.shoppingcart.dao.ShopingCartDao;
import com.metacube.shoppingcart.facade.ShopingCartFacade;
import com.metacube.shoppingcart.model.ShopingCart;

/**
 * @author gourav gandhi
 *
 */
public class ShopingCartController {

	/**
	 * @return the list of the cart items
	 */
	public static List<ShopingCart> getCart() {
		// TODO Auto-generated method stub
		return ShopingCartDao.getCart();
	}

	/**
	 * @param code to find if the product is in the cart
	 * @return boolean according to the result
	 */
	public static boolean checkCartProduct(String code) {
		// TODO Auto-generated method stub
		
		return ShopingCartFacade.checkProduct(code);
	}

	/**
	 * @param code to delete the product of this code
	 */
	public static void deleteCartProduct(String code) {
		// TODO Auto-generated method stub
		ShopingCartFacade.deleteCartProduct(code);
	}

	/**
	 * @param code of the product you want to edit the quantity 
	 * @param quantity is the new quantity of the product
	 */
	public static void editCartProduct(String code, int quantity) {
		// TODO Auto-generated method stub
		ShopingCartFacade.editCartProduct(code,quantity);
	}

}
