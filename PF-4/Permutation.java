import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author gourav gandhi
 * program to print all the permutation of a given string
 *
 */
public class Permutation {

	/**
	 * @param input the input string
	 * @return the arrayList of all the possible permutation
	 */
	ArrayList<String> generateP(String input) {

		Set<String> s1 = new HashSet<String>();

		permute("", input, s1);
		ArrayList<String> s = new ArrayList<String>(s1);
		return s;

	}

	/**
	 * @param temp2 contains some element of the input string
	 * @param input the remaining character from the temp2 string
	 * @param s1 is the set used to store the resultant strings as 
	 * it does not store the redundant values;
	 */
	void permute(String temp2, String input, Set<String> s1) {
		if (input.equals("")) {
			s1.add(temp2);
		} else {

			for (int index = 0; index < input.length(); index++) {

				StringBuilder temp3 = new StringBuilder(input);
				permute(temp2 + input.charAt(index), temp3.deleteCharAt(index).toString(), s1);

			}
		}
	}

}
