/**
 * 
 */
package com.metacube.shoppingcart.facade;

import java.util.List;

import com.metacube.shoppingcart.dao.ShopingCartDao;
import com.metacube.shoppingcart.model.ShopingCart;

/**
 * @author gourav gandhi
 *
 */
public class ShopingCartFacade {

	/**
	 * @param code
	 * @return
	 */
	public static boolean checkProduct(String code) {
		// TODO Auto-generated method stub
		
		List<ShopingCart> cart =ShopingCartDao.getCart();
		
		for(ShopingCart item: cart){
			if(code.equals(item.getCode())){
				return true;
			}
		}
		
		
		return false;
	}

	/**
	 * @param code
	 */
	public static void deleteCartProduct(String code) {
		// TODO Auto-generated method stub
		List<ShopingCart> cart =ShopingCartDao.getCart();
		
		for(ShopingCart item: cart){
			if(code.equals(item.getCode())){
				cart.remove(item);
				break;
			}
		}
		
	}

	/**
	 * @param code
	 * @param quantity
	 */
	public static void editCartProduct(String code, int quantity) {
		// TODO Auto-generated method stub
		
		List<ShopingCart> cart =ShopingCartDao.getCart();
		
		for(ShopingCart item: cart){
			if(code.equals(item.getCode())){
				item.setQuantity(quantity);
				break;
			}
		}
		
		
	}
	

}
