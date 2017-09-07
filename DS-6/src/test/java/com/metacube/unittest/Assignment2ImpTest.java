/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.assignment2.Assignment2Imp;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class Assignment2ImpTest {

	Assignment2Imp testObj = new Assignment2Imp();
	@Test
	public void testAddA() {
		Long actual = testObj.add("gourav");
		Long expected=(long) 6;
		assertEquals(expected, actual);
	}
	@Test
	public void testAddB() {
		Long actual = testObj.add("gandhi");
		Long expected=(long) 6;
		assertEquals(expected, actual);
	}
	@Test
	public void testAddC() {
		Long actual = testObj.add("hello");
		Long expected=(long) 4;
		assertEquals(expected, actual);
	}
	@Test
	public void testAddD() {
		Long actual = testObj.add("hohohohoho");
		Long expected=(long) 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testAddE() {
		Long actual = testObj.add("gourav");
		Long expected=(long) 6;
		assertEquals(expected, actual);
	}
	

}
