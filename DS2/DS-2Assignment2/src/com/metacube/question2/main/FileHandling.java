/**
 * 
 */
package com.metacube.question2.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author gourav gandhi
 *
 */
public class FileHandling {

	/**
	 * @param filepath is the path of the file from where data needs to read
	 */
	@SuppressWarnings("resource")
	public static String read(String filePath) {
		
		FileInputStream fstream;
		BufferedReader br = null;
		StringBuffer outputString = null;
		try {
			fstream = new FileInputStream(filePath);
			br = new BufferedReader(new InputStreamReader(fstream));
			outputString = new StringBuffer();
			String str = "";
			while ((str = br.readLine()) != null){
					outputString.append(str);
					outputString.append("\n");
			
			} 
		}	catch (Exception e) {
			e.printStackTrace();
			}
		
		return outputString.toString();
		
	
		
	}
	
	
	
}
