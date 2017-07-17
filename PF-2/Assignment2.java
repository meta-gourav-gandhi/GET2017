package PF2;
/*
 * program to print given pyramid using modular approach
 * the array counting has been done from index 1 instead of 0 
 * currentRow= defines the current row of the pyramid and 
 * n is assumed as max number denoted in the pyramid or the number of row in pyramid
 */

public class Assignment2 {

	// this method returns array of string
	
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
	public String space(int currentRow, int maxNum) {
		String resultSpace = "";
		for (int count = 1; count <= currentRow - 1; count++) {
			resultSpace = resultSpace + " ";
		}
		return resultSpace;

	}

	// this method will send the number string
	public String number(int currentRow, int maxNum) {
		String resultNumber = "";

		for (int count = 1; count <= maxNum - currentRow + 1; count++) {
			resultNumber = resultNumber + String.valueOf(count);
		}
		return resultNumber;

	}

	public static void main(String s[]) {
		Assignment2 a = new Assignment2();
		String result[] = a.printPyramid();

		for (int i = 1; i < result.length; i++)
			System.out.println(result[i]);
	}
}
