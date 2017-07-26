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

		Product product;
		String input[] = null;
		HashMap<Integer, Product> hashProduct = new HashMap<Integer, Product>();
		try {
			FileInputStream fstream = new FileInputStream(filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));
			String str = "";
			System.out.println();
			while ((str = br.readLine()) != null) {

				product = new Product();
				System.out.println(str);
				input = str.split(",");
				product.setName(input[1]);
				product.setPrice(Double.parseDouble(input[2]));

				hashProduct.put(Integer.parseInt(input[0]), product);

			}
			br.close();
			System.out.println();
		} catch (Exception e) {

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
		List<OrderPromotion> orderPromotionList = new ArrayList<OrderPromotion>();
		OrderPromotion orderpromo;
		String input[] = null;
		try {
			FileInputStream fstream = new FileInputStream(filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));
			String str = "";
			System.out.println();

			while ((str = br.readLine()) != null) {
				orderpromo = new OrderPromotion();
				System.out.println(str);
				input = str.split(",");

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
			br.close();

			System.out.println();

		} catch (Exception e) {

			System.out.print("catch in order prmomo");

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

		List<ProductPromotion> productPromotionList = new ArrayList<ProductPromotion>();
		HashMap<Integer, ProductPromotion> hashProductPromo = new HashMap<Integer, ProductPromotion>();
		ProductPromotion promo;
		String input[] = null;
		try {

			FileInputStream fstream = new FileInputStream(filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));
			String str = "";
			System.out.println();

			while ((str = br.readLine()) != null) {

				promo = new ProductPromotion();
				System.out.println(str);
				input = str.split(",");

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

				productPromotionList.add(promo);

			}
			br.close();
			System.out.println();
		} catch (Exception e) {

			e.printStackTrace();

		}
		return hashProductPromo;

	}
   
}


