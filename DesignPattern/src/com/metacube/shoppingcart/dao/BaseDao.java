package com.metacube.shoppingcart.dao;

import com.metacube.shoppingcart.model.Entity;

public interface BaseDao {

	public void create(Entity entity);
	public void update(Entity entity);
	public void delete(Entity entity);
	public Entity retreive(String code);
}
