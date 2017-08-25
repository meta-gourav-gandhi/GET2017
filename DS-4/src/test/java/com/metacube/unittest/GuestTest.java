package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.assignment2.Guest;

import org.junit.BeforeClass;
import org.junit.Test;

public class GuestTest {

	static Guest guesttest;
	@BeforeClass
	public static void initilize(){
		guesttest=new Guest("Gourav", 23);
	}
	@Test
	public void testHashCode() {
		
		int actual=guesttest.hashCode();
		int expected=17;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetName() {
		String actual=guesttest.getName();
		String expected="Gourav";
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAge() {
		int actual=guesttest.getAge();
		int expected=23;
		assertEquals(expected, actual);
	}

}
