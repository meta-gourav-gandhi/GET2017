package main.java.com.metacube.concordance;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Concordance {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//StringBuffer inputbuffer= new StringBuffer();
		/*for (int index = 0; index < args.length; index++) {
			inputbuffer.append(args[index]);
		}*/
		
		System.out.println("Enter input");
		String inputbuffer =scan.nextLine();
		ConcordanceImp.getConcordance(inputbuffer);
		
		display();
		
	}

	private static void display() {
		HashMap<Character,List<Integer>> detailmap = ConcordanceImp.getConcordanceMap();
		
		System.out.println(detailmap.toString());
	}
	
	
}
