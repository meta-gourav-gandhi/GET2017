/**
 * 
 */
package com.metacube.webservices;

import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class demo {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ConversionServiceLocator csl=new ConversionServiceLocator();
		csl.setConversionEndpointAddress("http://localhost:8080/WebServices1/services/Conversion");
		try{
			Conversion object=csl.getConversion();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter temperature in Fahrenheit :-");
			double input=scan.nextDouble();
			
			System.out.println(object.convertFtoC(input));
			
		}catch(Exception e){
			
		}
	}

}
