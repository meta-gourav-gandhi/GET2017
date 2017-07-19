/*
 * testcases for testing Permutations
 * test cases include checks for base condition, boundary values values or central range inputs.
 */


import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;


public class PermutationsTest {
	Permutation obj;

	// instantiate an object
	@Before
	public void start() {
		obj = new Permutation();
	}

	// testcase when input string has different letters
	@Test
	public void testStringWithDifferentLetters() {
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();
		output = obj.generateP("ABC");
		expected.add("ACB");
		expected.add("ABC");
		expected.add("BCA");
		expected.add("CBA");
		expected.add("CAB");
		expected.add("BAC");
		assertEquals(expected, output);

	}

	// testcase when input string has some same letters
	@Test
	public void testStringWithSameLetters() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.generateP("AAC");
		expected.add("AAC");
		expected.add("ACA");
		expected.add("CAA");
		assertEquals(expected, output);

	}

	// testcase when input string has some same letters
	@Test
	public void testStringWithSingleLetter() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.generateP("A");
		expected.add("A");
		assertEquals(expected, output);

	}

	

}
