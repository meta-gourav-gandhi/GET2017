/**
 * 
 */
package metacube.oops3.shoppingterminal;

/**
 * @author gourav gandhi
 *
 */
public class OrderPromotion {
	
	String promotionType;
	double discountAmount,discountPercentage;
	double threshold;

	public void setPromotionType(String type){
		
		this.promotionType=type;
	}
	
	public void setDiscountAmount(double amount){
		this.discountAmount=amount;
	}
	
	public void setDiscountPercentage(double amount){
		this.discountPercentage=amount;
	}
	
	public void setThreshold(double amount){
		this.threshold=amount;
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
	
	public double getThreshold(){
		return this.threshold;
	}
}
