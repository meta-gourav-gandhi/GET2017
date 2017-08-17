package com.metacube.shoppingcart.dao;

import java.util.HashMap;

import com.metacube.shoppingcart.model.Entity;
import com.metacube.shoppingcart.model.Product;

public class InMemoryProductDao implements ProductDao {
	
	public static HashMap<String, Product> productmap=new HashMap<String,Product>();
	
	static InMemoryProductDao object=new InMemoryProductDao();
	private InMemoryProductDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static InMemoryProductDao getInstance(){
		return object;
	}
	
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
	public Product retreive(String code) {
		// TODO Auto-generated method stub
		return productmap.get(code);
	}

	@Override
	public HashMap<String, Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productmap;
	}
	
	
	
	
	
}
