/**
 * 
 */
package com.metacube.question2.main;

import com.metacube.question2.controller.CollegeController;
import com.metacube.question2.controller.StudentController;
import com.metacube.question2.view.DisplayInput;
import com.metacube.question2.view.DisplayOutput;

/**
 * @author gourav gandhi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CollegeController.getAllColleges();
		DisplayOutput.displayCollege();
		StudentController.getAllStudents();
		StudentController.getIntoQueue();
		DisplayInput.startAllocating();
		DisplayOutput.showResult();
		
	}

}
