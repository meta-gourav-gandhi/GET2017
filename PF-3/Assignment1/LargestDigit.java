package Assignment1;

/**
 * @author gourav gandhi 
 * program to return the largest digit of the number
 *
 */
public class LargestDigit {

	int preMax = 0;
	int curMax = 0;
	/**
	 * @param num  the input number
	 * @return	the largest digit of the number
	 */
	int largestdigit(int num) {
		if (num == 0) {
			return preMax;
		} else {
			curMax = num % 10;

			if (curMax > preMax) {
				preMax = curMax;
			}
			return largestdigit(num / 10);
		}
	}

}
