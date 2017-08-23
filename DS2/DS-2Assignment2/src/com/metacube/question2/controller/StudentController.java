/**
 * 
 */
package com.metacube.question2.controller;

import java.util.HashMap;
import java.util.Map;

import com.metacube.question2.dao.StudentDao;
import com.metacube.question2.entity.College;
import com.metacube.question2.entity.Student;
import com.metacube.question2.main.FileHandling;
import com.metacube.question2.structure.MyQueue;

/**
 * @author gourav gandhi
 *
 */
public class StudentController {

	/**
	 * to read all the student from the file
	 */
	public static void getAllStudents() {

		String allStudent = FileHandling.read("StudentList.txt");
		StudentDao.setStudent(allStudent);

	}

	/**
	 * @return the map of the student
	 */
	public static Map<String, Student> getStudent() {

		return StudentDao.getStudentMap();
	}

	/**
	 * 
	 */
	public static void getIntoQueue() {

		StudentDao.setIntoQueue();
	}

	/**
	 * @return the queue of the students
	 */
	public static MyQueue getStudentQueue() {
		return StudentDao.getStudentQueue();
	}

	/**
	 * method to allocate the seats to the student
	 * @param rank rank of the college selected by the student
	 * @param currentStudent the student entering the rank
	 * @return
	 */
	public static boolean process(String rank, Student currentStudent) {
		HashMap<String, College> collegeMap = CollegeController.getCollege();
		int vacancy = collegeMap.get(rank).getVacancy();
		if (vacancy > 0) {
			currentStudent.setCollegeName(collegeMap.get(rank).getName());
			collegeMap.get(rank).setVacancy(vacancy - 1);
			return true;
		}

		return false;
	}

}
