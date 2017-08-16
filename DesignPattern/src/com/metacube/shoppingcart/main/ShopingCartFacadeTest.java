/**
 * 
 */
package com.metacube.shoppingcart.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacube.shoppingcart.controller.ShopingCartController;
import com.metacube.shoppingcart.facade.ShopingCartFacade;
import com.metacube.shoppingcart.model.ShopingCart;

/**
 * @author gourav gandhi
 *
 */
public class ShopingCartFacadeTest {

	/**
	 * Test method for {@link com.metacube.shoppingcart.facade.ShopingCartFacade#checkProduct(java.lang.String)}.
	 */
	@Test
	public void testCheckProduct() {
		ShopingCartController.getCart().clear();
		boolean actual= ShopingCartFacade.checkProduct("123");
		boolean expected=false;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCheckProductPositive() {
		ShopingCart item=new ShopingCart();
		item.setCode("123");
		ShopingCartController.getCart().add(item);
		boolean actual= ShopingCartFacade.checkProduct("123");
		boolean expected=true;
		assertEquals(expected,actual);
	}

}
