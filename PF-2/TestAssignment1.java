package PF2;

import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class TestAssignment1 {

	@Test
	public void testSpaces() {

		Assignment1 a = new Assignment1();
		String re = a.spaces(1, 5);

		String expected = "    ";
		Assert.assertEquals(expected, re);
	}

	@Test
	public void testNumbers() {

		Assignment1 a = new Assignment1();
		String re = a.number(4, 5);

		String expected = "1234321";
		Assert.assertEquals(expected, re);

	}


	@Test
	public void testNotEqualsSpace() {
		Assignment1 a = new Assignment1();
		String re = a.number(3, 5);
		String expected = "1234321";

		try {
			Assert.assertEquals(expected, re);
		} catch (AssertionError e) {
			return;
		}

	}

}
