/**
 * 
 */
package com.metacube.question2.unittest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.metacube.question2.controller.CollegeController;
import com.metacube.question2.entity.College;

/**
 * @author gourav gandhi
 *
 */
public class CollegeControllerTest {


	@Test
	public void testGetCollege() {
		HashMap<String, College> actual = CollegeController.getCollege();
		HashMap<String, College> expected = new HashMap<String, College>();
		assertEquals(expected, actual);
	}

}
