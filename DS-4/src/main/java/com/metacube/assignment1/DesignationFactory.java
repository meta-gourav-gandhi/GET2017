/**
 * 
 */
package com.metacube.assignment1;

/**
 * @author gourav gandhi
 *
 */
public class DesignationFactory {

	/**
	 * @param input
	 * @return
	 */
	public static String getDesignation(int input) {
		
		switch(input){
		case 1:
			return "Chair Person";
		case 2:
			return "Professors";
		case 3:
			return "Graduate students";
		case 4:
			return "Undergraduates students";
			
		}
		return "";
	}
	
	public static int getPriority(char ch) {
		switch (ch) {
		case 'C':
			return 4;
		case 'P':
			return 3;
		case 'G':
			return 2;
		case 'U':
			return 1;
		default:
			return -1;
		}
	}

}
