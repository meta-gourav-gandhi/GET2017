/**
 * 
 */
package main.java.com.metacube.assignment1;

/**
 * @author gourav gandhi
 *
 */
public class BinarySearch {
	
	public static int search(int []input,int element){
		int index=searchIndex(input,0,input.length-1,element);
		return index;
	}

	/**
	 * @param input is the input array to be sort
	 * @return the sorted array
	 */
	private static int searchIndex(int[] input,int start,int end,int element) {
		int center=  start+ (end-start)/2;
		if(start>end){
			return -1;
		}else if((center==0 || element>input[center-1]) && input[center]==element){
			return center;
		}else{
			if(input[center]<element){
				return searchIndex(input, center+1, end, element);
			}else{
				return searchIndex(input, start, center-1, element);
			}
		}
	
	}
	
}
