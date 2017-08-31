/**
 * 
 */
package main.java.com.metacube.sorting;

/**
 * @author gourav gandhi
 *
 */
public class BubbleSort {

	/**
	 * @param input is the array to be sorted
	 * @return the sorted array	is returned
	 */
	public static int[] sort(int[] input) {

		for (int icount = 0; icount < input.length; icount++) {
			for (int jcount = 1; jcount < input.length - icount; jcount++) {
				if (input[jcount - 1] > input[jcount]) {
					int temp = input[jcount];
					input[jcount] = input[jcount - 1];
					input[jcount - 1] = temp;
				}
			}
		}

		return input;
	}

}
