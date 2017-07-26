/**
 * 
 */
package metacube.oops3.shoppingterminal;

/**
 * @author gourav gandhi
 *
 */
public class Product {
	
	int productId;
	String productName;
	Double productPrice;
	 
	Product(){
		
	}
	
	public  void setId(int id){
		this.productId=id;
	}
	
	public void setName(String name){
		this.productName=name;
	}
	public void setPrice(Double price){
		this.productPrice=price;
	}
	
	public int getId(){
		return this.productId;
	}
	
	public String getName(){
		return this.productName;
	}
	public double getPrice(){
		return this.productPrice;
	}
}
