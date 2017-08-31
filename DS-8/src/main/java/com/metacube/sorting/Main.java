/**
 * 
 */
package main.java.com.metacube.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static int input;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		do{
			
			System.out.println("\nEnter number of elements ");
			while(!Validateinput()){
				Validateinput();
			}
			int inputArray[]=new int[input];
			int outputArray[]=new int[input];
			System.out.println("\nEnter numbers");
			
			for (int i = 0; i < inputArray.length; i++) {
				
				while(!Validateinput()){
					Validateinput();
				}
				inputArray[i]=input;
			}
			
			System.out.println("\nChose the type of sorting ");
			System.out.println("1) Comparison Sorting");
			System.out.println("2) Linear Sorting");
			while(!Validateinput()){
				Validateinput();
			}
			switch(input){
			case 1:
				if(inputArray.length<=10){
					outputArray = BubbleSort.sort(inputArray);
					System.out.println("\nUsing Bubble sort..!");
				}else{
					outputArray = QuickSort.sort(inputArray, 0, inputArray.length-1);
					System.out.println("\nUsing Quick Sort..!");
				}
				
				System.out.println(Arrays.toString(outputArray));
				break;
			case 2:
				int max=inputArray[0];
				for (int i = 0; i < inputArray.length; i++) {
					if(inputArray[i]>max){
						max= inputArray[i];
					}					
				}
				if(max<100){
					outputArray=CountingSort.sort(inputArray);
					System.out.println("\nUsing Counting Sort..");
				}else{
					outputArray = RadixSort.sort(inputArray);
					System.out.println("\nUsing Radix Sort..");
				}
				System.out.println(Arrays.toString(outputArray));
			}
			
			System.out.println("Do you want to run again : (Y/N)");
		}while(scan.next().equalsIgnoreCase("Y"));

	}

	/**
	 * 
	 */
	private static boolean Validateinput() {
		try{
			input=Integer.parseInt(scan.next());
			
		}catch(Exception exc){
			
			System.out.println("Enter numbers only");
			return false;
		}
		
		return true;
	}

}
