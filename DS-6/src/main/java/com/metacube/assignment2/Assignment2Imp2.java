/**
 * 
 */
package main.java.com.metacube.assignment2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author gourav gandhi
 *
 */
public class Assignment2Imp2 {
	static LinkedHashMap<String, Long> previousresult = new LinkedHashMap<String, Long>(5, (float) 0.75, true);

	public Long add(String input) {
		input = input.replace(" ", "");
		long size;
		if (!(previousresult.containsKey(input))) {
			
			Set<Character> data = new HashSet<>();
			for(int index =0;index<input.length();index++){
				data.add(input.charAt(index));
			}
			size=data.size();
			previousresult.put(input, size);
		} else {
			size = previousresult.get(input);
		}
		return size;
	}
}
