/**
 * 
 */
package metacube.shoppingterminal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author gourav gandhi
 *
 */
public class PrintingList  {

		/**
		 * @param filepath is the file which needs to be printed
		 */
		public void printLists(String filepath){
			
			System.out.println("The selected list :- ");
			System.out.println();
			FileInputStream fstream;
			BufferedReader br = null;
			try {
				fstream = new FileInputStream(filepath);
				br = new BufferedReader(new InputStreamReader(fstream));
				String str = "";
				while ((str = br.readLine()) != null){
						System.out.println(str);
						
				
				} 
			}	catch (Exception e) {
				e.printStackTrace();
				}
		}
	
}
