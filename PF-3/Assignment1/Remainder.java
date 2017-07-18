package Assignment1;

/**
 * @author gourav gandhi
 * program to give remainder of two number using recursive approach
 *
 */
public class Remainder {
	
	/**
	 * @param x first number
	 * @param y second number
	 * @return returns the remainder of two number
	 */
	int rem(int x, int y) {
		if (y > x) {
			return x;
		}
		else {
			if (y == 0){
				return -1;
			}
			int result = x - y;
			return rem(result, y);
		}
	}
}
