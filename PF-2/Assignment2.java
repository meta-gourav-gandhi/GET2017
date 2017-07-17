package PF2;

/**
 * program to print given pyramid using modular approach the array counting has
 * been done from index 1 instead of 0 currentRow= defines the current row of
 * the pyramid and n is assumed as max number denoted in the pyramid or the
 * number of row in pyramid
 */

public class Assignment2 {

	// this method returns array of string

	/**
	 * @return- the final pattern to be printed
	 */
	public String[] printPyramid() {
		int maxNum = 5;

		String output[] = new String[maxNum + 1];

		// this will create the required pattern for each row

		for (int index = 1; index <= maxNum; index++) {
			output[index] = space(index, maxNum) + number(index, maxNum);

		}

		return output;

	}

	// this method will send the spaces string
	/**
	 * @param currentRow
	 *            - is the current row where the curssor is
	 * @param maxNum
	 *            -is the max number to print
	 * @return- string of spaces required in current row
	 */
	public String space(int currentRow, int maxNum) {
		String resultSpace = "";
		for (int count = 1; count <= currentRow - 1; count++) {
			resultSpace = resultSpace + " ";
		}
		return resultSpace;

	}

	/**
	 * @param currentRow
	 *            - is the current row where the curssor is
	 * @param maxNum
	 *            -is the max number to print
	 * @return- string of number required in current row
	 */
	// this method will send the number string
	public String number(int currentRow, int maxNum) {
		String resultNumber = "";

		for (int count = 1; count <= maxNum - currentRow + 1; count++) {
			resultNumber = resultNumber + String.valueOf(count);
		}
		return resultNumber;

	}

}
