package socialnetwork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author gourav gandhi
 * this class will  read any csv file in general and return a string 
 */
public class FileHandling {
	FileInputStream fstream;
	BufferedReader br;
	String str = "";
	StringBuffer buf;

	public String read(String filepath) {
		try {
			fstream = new FileInputStream(filepath);
			br = new BufferedReader(new InputStreamReader(fstream));
			buf = new StringBuffer();
			while ((str = br.readLine()) != null) {
				buf.append(str);
				buf.append("\n");
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return buf.toString();
	}

}
