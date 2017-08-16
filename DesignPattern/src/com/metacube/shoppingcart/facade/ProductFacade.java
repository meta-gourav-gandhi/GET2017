package com.metacube.shoppingcart.facade;

import com.metacube.shoppingcart.dao.FileHandling;
import com.metacube.shoppingcart.dao.InMemoryProductDao;
import com.metacube.shoppingcart.main.Constants;
import com.metacube.shoppingcart.model.Product;

/**
 * @author gourav gandhi this will do the business logic of the product
 */
public class ProductFacade {

	public static void create() {
		// TODO Auto-generated method stub
		FileHandling.readProducts(Constants.PRODUCTS);

	}

	/**
	 * @param code to check if the product is avaliable or not
	 * @return boolean true if found
	 */
	public static boolean checkCode(String code) {
		// TODO Auto-generated method stub
		if (InMemoryProductDao.productmap.containsKey(code)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param code of the product to retrive  particular product
	 * @return the product of the entered code
	 */
	public static Product getProduct(String code) {
		// TODO Auto-generated method stub
		return InMemoryProductDao.getInstance().retreive(code);
	}

}
