package metacube.oops3.shoppingterminal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author gourav gandhi
 *
 */

public class FileHandling {

	/**
	 * @param  filepath string takes the input of the file path from where the 
	 * 		   data needs to be read.
	 * @return the hash map of products which contains  id's as key value and product object as value
	 */
	public HashMap<Integer, Product> printList(String filepath) {

		System.out.println("List of all the products are");
		System.out.println();
		Product product;
		String input[] = null;
		String content[]=null; 
		HashMap<Integer, Product> hashProduct = new HashMap<Integer, Product>();
		try {
			String outputString=initialize(filepath);
			content= outputString.split("#");
				/**
				 * Splitting the content and saving them 
				 * to different field of the objects.
				 * 
				 */
				for(int count=0;count<content.length;count++){
					System.out.println(content[count]);
					input=content[count].split(",");
					product = new Product();
					product.setName(input[1]);
					product.setPrice(Double.parseDouble(input[2]));
					hashProduct.put(Integer.parseInt(input[0]), product);

				}
	
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hashProduct;
	}
   
	/**
	 * @param  filepath string takes the input of the file path from where the 
	 * 		   data needs to be read.
	 * @return the list of the order promotion objects
	 */
	public List<OrderPromotion> printOrderPromo(String filepath) {

		System.out.println("List of all the order promotion are");
		System.out.println();
		List<OrderPromotion> orderPromotionList = new ArrayList<OrderPromotion>();
		OrderPromotion orderpromo;
		String input[] = null;
		String content[]=null; 
		try {
			String outputString=initialize(filepath);
			content= outputString.split("#");
				/**
				 * Splitting the content and saving them 
				 * to different field of the objects.
				 * 
				 */
				for(int count=0;count<content.length;count++){
					System.out.println(content[count]);
					input=content[count].split(",");
					orderpromo = new OrderPromotion();
					orderpromo.setPromotionType(input[0]);
					if ("ProductFixedAmountPromotion".equals(input[0])) {
						orderpromo.setDiscountAmount(Double.parseDouble(input[1]));
					} else {
						orderpromo.setDiscountPercentage(Double
							.parseDouble(input[1]));
					}
					orderpromo.setThreshold(Double.parseDouble(input[2]));
					orderPromotionList.add(orderpromo);
				}

			System.out.println();

		} catch (Exception e) {

			e.printStackTrace();;

		}
		return orderPromotionList;

	}
   

	/**
	 * @param  filepath string takes the input of the file path from where the 
	 * 		   data needs to be read.
	 * @return the hash map of the product promotion list which contain the Integer field as the Id's of the product and 
	 * 		   the Product Promotion object as the value
	 * 
	 * Function print all the Product Promotion
	 */
	public HashMap<Integer, ProductPromotion> printProductPromo(String filepath) {

		System.out.println("List of all the product promotion are");
		System.out.println();
		HashMap<Integer, ProductPromotion> hashProductPromo = new HashMap<Integer, ProductPromotion>();
		ProductPromotion promo;
		String input[] = null;
		String content[]=null;
		try {
			String outputString=initialize(filepath);
			content= outputString.split("#");	
			/**
			 * Splitting the content and saving them 
			 * to different field of the objects.
			 * 
			 */
			for(int count=0;count<content.length;count++){
				System.out.println(content[count]);
				input=content[count].split(",");
				promo = new ProductPromotion();	
				promo.setPromotionType(input[0]);
				if ("ProductFixedAmountPromotion".equals(input[0])) {
					promo.setDiscountAmount(Double.parseDouble(input[1]));
				} else {
					promo.setDiscountPercentage(Double.parseDouble(input[1]));
				}
				promo.setApplicableProducts(input[2]);
				int codes[] = promo.getApplicableProducts();

				for (int index = 0; index < codes.length; index++) {
					hashProductPromo.put(codes[index], promo);
				}
			}
		
			System.out.println();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return hashProductPromo;
	}
	
	/**
	 * Its to read from the file and to return the 
	 * whole file in form of a string
	 */
	public String initialize(String filepath){
		
		FileInputStream fstream;
		BufferedReader br = null;
		StringBuffer outputString = null;
		try {
			fstream = new FileInputStream(filepath);
			br = new BufferedReader(new InputStreamReader(fstream));
			outputString = new StringBuffer();
			String str = "";
			while ((str = br.readLine()) != null){
					outputString.append(str);
					outputString.append("#");
			
			} 
		}	catch (Exception e) {
			e.printStackTrace();
			}
		
		return outputString.toString();
	}
   
}


