/**
 * 
 */
package com.metacube.webservices;

import java.text.DecimalFormat;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author gourav gandhi
 *
 */
@WebService
public class Conversion {
	
	@WebMethod
	public double convertFtoC(double degree){
		
		degree=((degree - 32) * 0.5556);
		DecimalFormat formator = new DecimalFormat("#.##");
		return Double.parseDouble(formator.format(degree));
		
	}
}
