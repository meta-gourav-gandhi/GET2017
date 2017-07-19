package PF2;

import org.junit.Assert;
import org.junit.Test;

public class TestAssignment2 {

	@Test
	public void testSpaces() {

		Assignment2 a = new Assignment2();
		String re = a.space(1, 5);

		String expected = "";
		Assert.assertEquals(expected, re);
	}

	@Test
	public void testNumbers() {

		Assignment2 a = new Assignment2();
		String re = a.number(4, 5);

		String expected = "12";
		Assert.assertEquals(expected, re);
	}
}
