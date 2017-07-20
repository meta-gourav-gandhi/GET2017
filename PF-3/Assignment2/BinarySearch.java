package Assignment2;

/**
 * @author gourav gandhi
 *program to search the given element in the given array .
 *
 */
public class BinarySearch {

	int center = 0;

	/**
	 * @param input receive input array
	 * @param start is the starting index of the array
	 * @param end is the last index of the array
	 * @param element the element to be searched
	 * @return the string if found else returns not
	 */
	public String search(int input[], int start, int end, int element) {
		center = (start + end) / 2;

		if (start >= end && input[center] != element) {
			return "not found";
		} else if (input[center] == element) {
			return "found";
		} else {
			if (element < input[center]) {
				return search(input, start, center - 1, element);
			} else {
				return search(input, center + 1, end, element);
			}

		}

	}

}
