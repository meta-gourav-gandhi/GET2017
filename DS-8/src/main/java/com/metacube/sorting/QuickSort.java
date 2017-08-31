/**
 * 
 */
package main.java.com.metacube.sorting;

/**
 * @author gourav gandhi
 *
 */
public class QuickSort {
	
	/**
	 * @param input takes the input array 
	 * @param left the initial index of the array
	 * @param right the last index of the array
	 * @return the sorted array
	 */
	public static int[] sort(int input[], int left, int right) {

		if (left < right) {
			int pivot = partition(input, left, right);
			sort(input, left, pivot - 1);
			sort(input, pivot + 1, right);
		}
		return input;
	}

	/**
	 * @param input takes the array that need to be partitioned
	 * @param left the leftmost index of the array
	 * @param right the rightmost index of the array
	 * @return the final position of the pivot or the actual index of the pivot in the sorted array  
	 */
	public static  int partition(int input[], int left, int right) {
		int i = left - 1;
		int pivot = input[right];

		for (int j = left; j <= right - 1; j++) {
			if (input[j] < pivot) {
				
				i++;
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			}
		}
		/*
		 * to bring the pivot to its correct index 
		 */
		int temp = input[right];
		input[right] = input[i + 1];
		input[i + 1] = temp;
		return i + 1;
	}
	
}
