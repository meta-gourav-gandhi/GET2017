/**
 * 
 */
package com.metacube.shoppingcart.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.facade.ProductFacade;

/**
 * @author gourav gandhi
 *
 */
public class ProductFacadeTest {

	/**
	 * Test method for {@link com.metacube.shoppingcart.facade.ProductFacade#checkCode(java.lang.String)}.
	 */
	@Test
	public void testCheckCode() {
		boolean actual=ProductFacade.checkCode("123");
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCheckCodePositive() {
		ProductController.createProductList();
		boolean actual=ProductFacade.checkCode("123");
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	
	

}
