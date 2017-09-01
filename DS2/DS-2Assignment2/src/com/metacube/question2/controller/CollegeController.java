/**
 * 
 */
package com.metacube.question2.controller;

import java.util.HashMap;

import com.metacube.question2.dao.CollegeDao;
import com.metacube.question2.entity.College;
import com.metacube.question2.main.FileHandling;

/**
 * @author gourav gandhi
 *
 */
public class CollegeController {

	/**
	 * method to call the read file so that college file is readed
	 */
	public static void getAllColleges() {
		String allCollege=FileHandling.read("CollegeList.txt");
		CollegeDao.setCollege(allCollege);
	}

	/**
	 * @return the map of all the colleges 
	 */
	public static HashMap<String, College> getCollege() {
		
		return CollegeDao.getCollegeMap();
	}

}
