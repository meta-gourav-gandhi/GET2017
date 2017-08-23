/**
 * 
 */
package com.metacube.question2.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.metacube.question2.controller.CollegeController;
import com.metacube.question2.controller.StudentController;
import com.metacube.question2.dao.CollegeDao;
import com.metacube.question2.dao.StudentDao;
import com.metacube.question2.entity.College;
import com.metacube.question2.entity.Student;
import com.metacube.question2.structure.MyQueue;

/**
 * @author gourav gandhi
 *
 */
public class DisplayInput {

	static Scanner scan = new Scanner(System.in);

	/**
	 * method is alloacting every student seats according to their rank and the
	 * choices filled by them.
	 */
	public static void startAllocating() {
		System.out
				.println("Candidates should input atleast 1 options as college"
						+ " choice and maximum as number of colleges:- ");

		MyQueue studentQueue = StudentController.getStudentQueue();
		HashMap<String, College> collegeMap = CollegeController.getCollege();
		int input;
		String rank;

		int counter = studentQueue.getSize();

		for (int index = 0; index < counter; index++) {
			boolean flag = true;
			Student currentStudent = (Student) studentQueue.dequeue();
			for (int jindex = 0; jindex < CollegeDao.numOfCollege(); jindex++) {
				System.out.println();
				System.out.println(currentStudent.getName()
						+ " enter the rank of the college :- ");
				rank = scan.next();
				if (collegeMap.containsKey(rank)) {

					if (StudentController.process(rank, currentStudent)) {

						System.out.println("######## "
								+ collegeMap.get(rank).getName()
								+ " has been allocated to you ########");

						DisplayOutput.displayCollege();

						flag = false;
						break;

					} else {
						System.out
								.println("!!!!.....Entered college has no vacant seats....!!!!! ");
					}

				} else {
					System.out.println("Entered college is not present");
					jindex--;
				}

			}
			if (flag) {
				System.out.println("#################################");
				System.out.println("No college has been alloted to you ");
				System.out.println();
				currentStudent.setCollegeName("Not seats alloted");
			}
			studentQueue.enque(currentStudent);

		}

	}

}
