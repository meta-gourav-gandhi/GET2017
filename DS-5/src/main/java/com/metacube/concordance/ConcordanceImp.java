package main.java.com.metacube.concordance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * program to get the concordance of the input string
 * @author gourav gandhi
 *
 */
public class ConcordanceImp {

	public static HashMap<Character, List<Integer>> concordancemap = new HashMap<Character, List<Integer>>();
	static List<Integer> indexes;

	/**
	 * @param input string to get concordance of the string element
	 */
	public static void getConcordance(String input) {
		input = input.replace(" ", "");
		for (int icounter = 0; icounter < input.length(); icounter++) {

			char data = input.charAt(icounter);
			if (concordancemap.containsKey(data)) {
				concordancemap.get(data).add(icounter);
			} else {
				indexes = new LinkedList<Integer>();
				indexes.add(icounter);
				concordancemap.put(data, indexes);
			}

		}

	}

	/**
	 * @return the concordance map 
	 */
	public static HashMap<Character, List<Integer>> getConcordanceMap() {
		return concordancemap;
	}

}
