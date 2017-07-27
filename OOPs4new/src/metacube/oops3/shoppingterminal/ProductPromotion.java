/**
 * 
 */
package metacube.oops3.shoppingterminal;
import com.metacube.menudriven.*;
/**
 * @author gourav gandhi
 *
 */
public class ProductPromotion implements Action {
	
	String promotionType;
	Double discountAmount,discountPercentage;
	int applicableProducts[];
	
	public void setPromotionType(String type){
		
		this.promotionType=type;
	}
	
	public void setDiscountAmount(Double amount){
		this.discountAmount=amount;
	}
	
	public void setDiscountPercentage(Double amount){
		this.discountPercentage=amount;
	}
	
	public void setApplicableProducts(String codes){
		 String ids[]=(codes.split(";"));
		 applicableProducts=new int[ids.length];
		 for(int index=0;index<ids.length;index++){
			 applicableProducts[index]=Integer.parseInt(ids[index]);
		 }
		 
	}
	
	public String getPromotionType(){
		
		return	this.promotionType;
	}
		
	public double getDiscountAmount(){
		return this.discountAmount;
	}
	
	public double getDiscountPercentage(){
		return this.discountPercentage;
	}	
	
	public int[] getApplicableProducts(){
		return this.applicableProducts;
	}

	/* (non-Javadoc)
	 * @see com.metacube.menudriven.Action#performAction()
	 */
	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		FileHandling handle=new FileHandling();
		handle.printProductPromo("ProductPromo.csv");
		
	}
	
}
