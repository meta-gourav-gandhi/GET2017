package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTest {
	@Test
	public void test() {

		LinearSearch ls = new LinearSearch();
		int input[] = { 2, 5, 8, 9, 10, 55, 77 };
		String actual = ls.search(input,88);
		String expected = "not found";
		assertEquals(expected, actual);
	}

	@Test
	public void testB() {

		LinearSearch ls = new LinearSearch();
		int input[] = { 2, 5, 8, 9, 10, 55, 77, 11 };
		String actual = ls.search(input,77);
		String expected = "found";
		assertEquals(expected, actual);
	}

}
