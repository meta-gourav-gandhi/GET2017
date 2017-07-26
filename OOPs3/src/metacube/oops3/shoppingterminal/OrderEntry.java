/**
 * 
 */
package metacube.oops3.shoppingterminal;

/**
 * @author gourav gandhi
 *
 */
public class OrderEntry {
	
	int code;
	int quantity;
	String name;
	double price;
	
	

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrderProductCode(int id){
		this.code=id;
	}
	
	public void setOrderQuantity(int totalQuantity){
		this.quantity=totalQuantity;
	}
	
	public int getOrderProductCode(){
		return this.code;
	}
	
	public int getOrderQuantity(){
		return this.quantity;
	}
	public String getName() {
		return name;
	}

}
