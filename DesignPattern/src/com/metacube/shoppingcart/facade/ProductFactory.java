package com.metacube.shoppingcart.facade;

import com.metacube.shoppingcart.dao.BaseDao;
import com.metacube.shoppingcart.dao.InMemoryProductDao;

public class ProductFactory {
	
	public static BaseDao getInstance(String str){
		switch(str){
		case "InMemoryProductDao":
			return InMemoryProductDao.getInstance();
		default:
				return null;
		}
		
	}
}
