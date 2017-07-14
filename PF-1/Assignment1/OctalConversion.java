/*
 * program to convert binary to octal
 */

public class OctalConversion {
	
	

	public int convertBinaryToOctal(int n) {
		
		//checkBinary will check if input number is binary or not
		
		int checkBinary = n, remainder;
		while (checkBinary!=0) {
			remainder = checkBinary % 10;
			if ((remainder == 0) || (remainder == 1)) {
				checkBinary = checkBinary / 10;
			} else {
				break;
			}
		}
		
		if (checkBinary != 0) {
			return -1;
		}
		
		//decimalnum to store the decimal value
		
		int decimalnum = 0, j = 1;

		while (n > 0) {
			remainder = n % 10;
			decimalnum += (remainder * j);
			j = j * 2;
			n = n / 10;
		}
        
		
		//octal will store the result
		//converting decimal into octal
		int mul=1,octal=0;
		while (decimalnum != 0) {
			 octal += (decimalnum % 8) * mul ;
			mul = mul*10;
			decimalnum = decimalnum / 8;
		
		}
		
		
		return octal;
	}

}
