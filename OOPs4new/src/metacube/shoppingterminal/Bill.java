/**
 * 
 */
package metacube.shoppingterminal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author gourav gandhi
 *
 */
public class Bill {

	/**
	 * @param orderList contains all the orders of the user in form of object of class OrderEntry
	 * @param hashProductPromotion contains the product Promotion objects with the id's of product  
	 * @param orderPromotionList contains list of order Promotion Object 
	 */
	public void calculate(List<OrderEntry> orderList,
			HashMap<Integer, ProductPromotion> hashProductPromotion,
			List<OrderPromotion> orderPromotionList) {

		Iterator<OrderEntry> itr = orderList.iterator();

		System.out.println("############################################");
		System.out.println("Your Order");
		System.out.println("############################################");
		System.out.println();
		System.out.println("Purchase product and Promotion");
		System.out.println();
		double subtotal = 0;
		double productLevelDiscount = 0;
		while (itr.hasNext()) {

			OrderEntry order = itr.next();
			int id = order.getOrderProductCode();
			
			System.out.println("Product : [" + order.getOrderProductCode()+ "] - " + order.getName());
			double price = order.getOrderQuantity() * order.getPrice();

			System.out.println("Cost : Rs" + price + "( "
					+ order.getOrderQuantity() + " * Rs" + order.getPrice()+ " )");
			subtotal += price;
			
			/**
			 * checking if the ordered product is eligible of any product 
			 * promotion.
			 * 
			 */
			if (hashProductPromotion.containsKey(id)) {
				ProductPromotion promo = hashProductPromotion.get(id);

				double finalAmountOfProduct=0;
				if ("ProductFixedAmountPromotion".equals(promo.getPromotionType())) {				//checking type of the product promotion
					
					System.out.println("Promotion Applied : Rs"+ promo.getDiscountAmount() + " off");
					
					finalAmountOfProduct = (order.getPrice() - promo.getDiscountAmount())			//finding the final amount of the product 
							* order.getOrderQuantity();	 
					productLevelDiscount += (promo.getDiscountAmount())* order.getOrderQuantity();  //adding up the total product level discount; 

				} else {

					System.out.println("Promotion Applied : "+ promo.getDiscountPercentage() + "% off");
					
					double percentDiscount = ((promo.getDiscountPercentage() / 100) * order.getPrice());
					productLevelDiscount += percentDiscount* order.getOrderQuantity();
					finalAmountOfProduct = (order.getPrice() - percentDiscount)* order.getOrderQuantity();
				
				}

				System.out.println("Discounted cost : Rs" + finalAmountOfProduct);

				System.out.println();
				System.out.println();
				System.out.println();
			}

		}
		System.out.println();
		System.out.println();

		double totalOrder = subtotal - productLevelDiscount;
		double orderLevelDiscount = getOrderDiscount(totalOrder,
				orderPromotionList);
		System.out.println();
		System.out.println("Subtotal : " + subtotal);
		System.out.println("Product Level Discount : " + productLevelDiscount);
		System.out.println("Order Level Discount : " + orderLevelDiscount);
		System.out.println("Total Bill : "
				+ (subtotal - productLevelDiscount - orderLevelDiscount));
		System.out.println("#######################################################################");

	}

	/**
	 * @param totalOrder is the amount after getting the product Level discount
	 * @param list contains all the order promotion object
	 * @return the order level discount on the remaining amount
	 */
	double getOrderDiscount(double totalOrder, List<OrderPromotion> list) {
		Iterator<OrderPromotion> itr = list.iterator();

		double maxDiscount = 0, currentDiscount = 0;
		int index = 0;
		OrderPromotion temp;
		while (itr.hasNext()) {

			temp = itr.next();
			if (totalOrder >= temp.getThreshold()) {

				if (temp.getPromotionType().equals("OrderFixedAmountPromotion")) {
					currentDiscount = temp.getDiscountAmount();

				} else {
					currentDiscount = (temp.getDiscountPercentage() / 100)
							* totalOrder;
				}
				if (currentDiscount >= maxDiscount) {
					maxDiscount = currentDiscount;
					index = list.indexOf(temp);

				}
			}
		}
		temp = list.get(index);
		if (maxDiscount != 0) {
			if (temp.getPromotionType().equals("OrderFixedAmountPromotion")) {
				System.out.println("Order level Promotion : Rs"
						+ temp.getDiscountAmount() + " off on order above "
						+ temp.getThreshold());
			} else if (temp.getPromotionType().equals(
					"OrderFixedPercentPromotion")) {
				System.out.println("Order Level Promotion : "
						+ temp.getDiscountPercentage()
						+ "% off on order above " + temp.getThreshold());
			}
		}

		return maxDiscount;
	}

}
