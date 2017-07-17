/*
 * program to print diamond pyramid using modular approach
 * the array counting has been done from index 1 instead of 0 
 * currentRow= defines the current row of the pyramid and 
 * n is assumed as max number denoted in the pyramid
 */

package PF2;

public class Assignment1 {

	// this method returns array of string
	public String[] printPyramid() {
		int maxNum = 5;

		String output[] = new String[2 * maxNum];

		for (int index = 1; index <= 2 * maxNum - 1; index++) {

			// this will create the required pattern for each row
			output[index] = spaces(index, maxNum) + number(index, maxNum)
					+ spaces(index, maxNum);

		}

		return output;

	}

	// this method will send the spaces string

	public String spaces(int currentRow, int maxNum) {
		if (currentRow > maxNum) {
			currentRow = 2 * maxNum - 1 - currentRow + 1;
		}

		String resultSpace = "";
		for (int count = 1; count <= (maxNum - currentRow); count++) {
			resultSpace = resultSpace + " ";
		}

		return resultSpace;

	}

	// this method will send the number string

	public String number(int currentRow, int maxNum) {
		String resultNum = "";

		if (currentRow > maxNum) {
			currentRow = 2 * maxNum - 1 - currentRow + 1;
		}

		for (int index = 1; index <= 2 * currentRow - 1; index++) {
			// for upper pyramid
			if (index <= currentRow) {
				resultNum = resultNum + String.valueOf(index);

			}

			// for lower pyramid
			else {
				int temp = 2 * currentRow - index;
				resultNum = resultNum + String.valueOf(temp);
			}
		}

		return resultNum;
	}

	public static void main(String s[]) {
		Assignment1 a = new Assignment1();
		String re[] = a.printPyramid();

		for (int i = 1; i < re.length; i++)
			System.out.println(re[i]);
	}
}
