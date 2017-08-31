/**
 * 
 */
package main.java.com.metacube.sorting;

/**
 * @author gourav gandhi
 *
 */
public class RadixSort {

	/**
	 * @param input takes the input to sort array
	 * @return the output sorted array
	 */
	public static int[] sort(int[] input) {

		int output[] = new int[input.length];
		int exp = 1;
		int max = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
			}
		}

		while (max / exp > 0) {

			int count[] = new int[10];

			for (int i = 0; i < input.length; i++) {
				count[(input[i] / exp) % 10]++;
			}

			for (int i = 1; i < count.length; i++) {
				count[i] = count[i] + count[i - 1];
			}

			for (int i = input.length - 1; i >= 0; i--) {
				output[--count[(input[i] / exp) % 10]] = input[i];
			}

			for (int i = 0; i < input.length; i++) {
				input[i] = output[i];

			}

			exp *= 10;

		}
		output = input;
		return output;
	}

}
