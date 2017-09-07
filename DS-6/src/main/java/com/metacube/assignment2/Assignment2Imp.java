/**
 * 
 */
package main.java.com.metacube.assignment2;

import java.util.LinkedHashMap;

/**
 * @author gourav gandhi
 *
 */
public class Assignment2Imp {
	
	static LinkedHashMap<String, Long> previousresult = new LinkedHashMap<String, Long>(5,(float) 0.75,true);
	
	public  Long add(String input){
		input= input.replace(" ", "");
		long size;
		if(!(previousresult.containsKey(input))){
			size=input.chars().distinct().count();
			previousresult.put(input, size);
		}else{
			size=previousresult.get(input);
		}
		return size;
	}
}
