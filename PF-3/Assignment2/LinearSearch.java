package Assignment2;

/**
 * @author gourav gandhi
 * program to find element in the given array using recursion 
 *and linear search strategy
 *
 */
public class LinearSearch {
	int index = 0;

	/**
	 * @param input the input array
	 * @param element element to be searched
	 * @return found is returned if element is found else "not found"
	 */
	public String search(int input[], int element) {
		if (index == input.length) {
			return "not found";
		} else if (input[index++] == element) {
			return "found";
		} else {
			return search(input, element);
		}
	}
}
