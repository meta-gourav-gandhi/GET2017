/**
 * 
 */
package metacube.oops3.shoppingterminal;
import java.util.HashMap;
import com.metacube.menudriven.*;
/**
 * @author gourav gandhi
 *
 */
public class Product implements Action {
	
	int productId;
	String productName;
	Double productPrice;
	 
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

	/* (non-Javadoc)
	 * @see com.metacube.menudriven.Action#performAction()
	 */
	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		FileHandling handle=new FileHandling();
		handle.printList("ProductList.csv");
		
	}

	
}
