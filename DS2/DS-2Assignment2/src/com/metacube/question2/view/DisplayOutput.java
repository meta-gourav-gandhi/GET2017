/**
 * 
 */
package com.metacube.question2.view;

import java.util.HashMap;
import java.util.Map;

import com.metacube.question2.controller.CollegeController;
import com.metacube.question2.controller.StudentController;
import com.metacube.question2.entity.College;
import com.metacube.question2.entity.Student;
import com.metacube.question2.structure.MyQueue;

/**
 * @author gourav gandhi
 *
 */
public class DisplayOutput {

	/**
	 * display the list of the college
	 */
	public static void displayCollege() {
		System.out.println("List of college are : -");
		System.out.println();
		HashMap<String, College> collegeMap = CollegeController.getCollege();

		for (String college : collegeMap.keySet()) {

			System.out.print(collegeMap.get(college).getRank() + " ");
			System.out.print(collegeMap.get(college).getName() + " ");
			System.out.print("Vacancys are:- "
					+ collegeMap.get(college).getVacancy() + " ");
			System.out.println();
		}

	}

	/**
	 * Displaying the final allocated seats
	 */
	public static void showResult() {
		System.out.println();
		System.out.println("Allocated seats are : -");
		System.out.println();

		MyQueue studentQueue = StudentController.getStudentQueue();
		int counter = studentQueue.getSize();
		for (int index = 0; index < counter; index++) {
			Student currentStudent = (Student) studentQueue.dequeue();

			System.out.println(currentStudent.getName() + " you have been alloted :- "
					+ currentStudent.getCollegeName());

		}

	}

}
