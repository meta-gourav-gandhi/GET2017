/**
 * 
 */
package com.metacube.shoppingcart.dao;

import java.util.ArrayList;

import com.metacube.shoppingcart.model.Entity;
import com.metacube.shoppingcart.model.ShopingCart;

/**
 * @author gourav gandhi
 *
 */
public class ShopingCartDao implements BaseDao {

	static ArrayList<ShopingCart> cart = new ArrayList<ShopingCart>();

	@Override
	public void create(Entity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Entity retreive(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the cart of the products
	 */
	public static ArrayList<ShopingCart> getCart() {
		return cart;
	}

}
