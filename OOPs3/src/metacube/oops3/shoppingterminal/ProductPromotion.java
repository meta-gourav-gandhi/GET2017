/**
 * 
 */
package metacube.oops3.shoppingterminal;

/**
 * @author gourav gandhi
 *
 */
public class ProductPromotion {
	
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
	
}
