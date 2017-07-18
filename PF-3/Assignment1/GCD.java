package Assignment1;

/**
 * @author gourav gandhi 
 * program to find gcd of two number
 *
 */
public class GCD {
	/**
	 * @param x	first input
	 * @param y second input     
	 * @return the greatest common divisor of two number.
	 */
	int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}

	}
}
