package com.metacube.shoppingcart.controller;

import java.util.HashMap;

import com.metacube.shoppingcart.dao.FileHandling;
import com.metacube.shoppingcart.dao.ProductDao;
import com.metacube.shoppingcart.facade.ProductFacade;
import com.metacube.shoppingcart.facade.ProductFactory;
import com.metacube.shoppingcart.main.Constants;
import com.metacube.shoppingcart.model.Product;

public class ProductController {

	/**
	 * This method will create the product list using facade and InMemoryProductDao  
	 */
	public static void createProductList() {
		// TODO Auto-generated method stub
		ProductFacade.create();
	}

	/**
	 * @return this will return the the hashmap of the product
	 */
	public static HashMap<String, Product> displayProduct() {
		// TODO Auto-generated method stub
		ProductDao object = (ProductDao) ProductFactory.getInstance((FileHandling.readType(Constants.FILELOC)));
		return object.getAllProducts();
		
	}

	/**
	 * @param code of the product which we need to find
	 * @return the product to following code
	 */
	public static Product getDetails(String code) {
		// TODO Auto-generated method stub
		
		return ProductFacade.getProduct(code);
	}

}
