package com.metacube.shoppingcart.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import com.metacube.shoppingcart.model.Product;

public class FileHandling {

	/**
	 * 
	 * @param filepath
	 * @return a string having value of type of product dao
	 */
	public static String readType(String filepath) {
		StringBuffer buf=null;
		try {
			String str = "";
			buf = new StringBuffer();
			FileInputStream  fstream = new FileInputStream(filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			while ((str = br.readLine()) != null) {

				buf.append(str);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return buf.toString();
	}

	/**
	 * @param filepath where all the products are stored
	 */
	public static void readProducts(String filepath) {
		// TODO Auto-generated method stub
		try {
			String str = "";
			FileInputStream  fstream = new FileInputStream(filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			while ((str = br.readLine()) != null) {
				String s[] = str.split(",");
				Product prod = new Product();
				prod.setCode(s[0]);
				prod.setName(s[1]);
				prod.setPrice(Double.parseDouble(s[2]));
				InMemoryProductDao.productmap.put(s[0],prod);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @param bill contains all the details to be printed on the file
	 * @param name of the person
	 */
	public static void generateBill(String bill, String name) {
		// TODO Auto-generated method stub
		
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
						name + "'s bill.txt")));
				bw.write(bill);
				bw.close();
			} catch (Exception e) {
			}
		}
	

}


