/**
 * This is the main
 */
package metacube.oops3.shoppingterminal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class Shopping {

	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		FileHandling handleFile=new FileHandling();
		
		HashMap<Integer,Product> product =handleFile.printList("ProductList.csv");
		HashMap<Integer,ProductPromotion>hashProductPromotion=handleFile.printProductPromo("ProductPromo.csv");
		List <OrderPromotion> orderPromotionList=handleFile.printOrderPromo("OrderPromo.csv");
		
		System.out.println("Enter the number of production you want to buy");
		int numOfProducts= scan.nextInt();
		
		List <OrderEntry> orderList=new ArrayList<OrderEntry>();
		OrderEntry order = null;
		
		for(int count=0;count<numOfProducts;count++){
			order=new OrderEntry();
			
			System.out.println("Enter code");	
			int id=scan.nextInt();
			order.setOrderProductCode(id);
			if(product.containsKey(id)){
				Product p=product.get(id);
					order.setName(p.getName());
					order.setPrice(p.getPrice());
				}
			else{
				System.out.println("!!...entered product code is invalid...!! ");
				System.out.println("Please enter again ");
				count--;
				continue;
			}
			System.out.println("Enter Quantity");
			int quantity=scan.nextInt();
			order.setOrderQuantity(quantity);
			
				
			orderList.add(order);
		
		}
			
			//to calculate and print the bill
			Bill b=new Bill();
			b.calculate(orderList,hashProductPromotion,orderPromotionList);
	}
	
}
