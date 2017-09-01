/**
 * 
 */
package com.metacube.question2.unittest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.metacube.question2.controller.CollegeController;
import com.metacube.question2.controller.StudentController;
import com.metacube.question2.entity.Student;
import com.metacube.question2.structure.MyQueue;

/**
 * @author gourav gandhi
 *
 */
public class StudentControllerTest {

	
	@Test
	public void testGetStudent() {
		Map<String, Student> actual = StudentController.getStudent();
		Map<String, Student> expected = new HashMap<String, Student>();
		assertEquals(expected, actual);
	}

		
	@Test
	public void testProcess() {
		CollegeController.getAllColleges();
		Student s1=new Student();
		s1.setName("Gourav");
		s1.setRank("1");
		boolean actual = StudentController.process("1", s1);
		boolean expected= true;
		assertEquals(expected, actual);
		
	}

}
