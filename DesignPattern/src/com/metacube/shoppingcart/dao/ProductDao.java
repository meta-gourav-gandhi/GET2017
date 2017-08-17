/**
 * 
 */
package com.metacube.shoppingcart.dao;

import java.util.HashMap;
import com.metacube.shoppingcart.model.Product;

/**
 * @author Sunrise Computer
 *
 */
public interface ProductDao extends BaseDao {

	public HashMap<String,Product> getAllProducts();
}
