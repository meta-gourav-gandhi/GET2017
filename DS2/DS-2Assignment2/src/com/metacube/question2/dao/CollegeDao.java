/**
 * 
 */
package com.metacube.question2.dao;

import java.util.HashMap;
import com.metacube.question2.entity.College;

/**
 * @author gourav gandhi
 *
 */
public class CollegeDao {

	static HashMap<String,College> collegeMap = new HashMap<String,College>();
	/**
	 * @param allCollege
	 */
	public static void setCollege(String allCollege) {
		
		College collegeObj;
		String input[] = null;
		String content[]=null;
		try {
			content= allCollege.split("\n");	
			/**
			 * Splitting the content and saving them 
			 * to different field of the objects.
			 * 
			 */
			for(int count=0;count<content.length;count++){
				input=content[count].split(",");
				collegeObj = new College();	
				collegeObj.setRank(input[0]);
				collegeObj.setName(input[1]);
				collegeObj.setVacancy(Integer.parseInt(input[2]));
				collegeMap.put(input[0], collegeObj);
			}
		
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	/**
	 * @return the collegeMap
	 */
	public static HashMap<String, College> getCollegeMap() {
		return collegeMap;
	}
	
	public static int numOfCollege(){
		return collegeMap.size();
	}
	

}
