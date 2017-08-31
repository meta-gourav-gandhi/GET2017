/**
 * 
 */
package main.java.com.metacube.sorting;

/**
 * @author gourav gandhi
 *
 */
public class CountingSort {

	/**
	 * @param input takes the array as input
	 * @return the sorted array
	 */
	public static int[] sort(int[] input) {

		int[] output = new int[input.length];

		// find the smallest and the largest value
		int min = 0;
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			} else if (input[i] > max) {
				max = input[i];
			}
		}

		// count is to store frequencies of the data
		int[] counts = new int[max - min + 1];

		// storing the frequencies
		for (int i = 0; i < input.length; i++) {
			counts[input[i] - min]++;
		}

		// recalculate the input - create the input of occurences
		counts[0]--;
		for (int i = 1; i < counts.length; i++) {
			counts[i] = counts[i] + counts[i - 1];
		}

		for (int i = input.length - 1; i >= 0; i--) {
			output[counts[input[i] - min]--] = input[i];
		}

		return output;
	}

}
