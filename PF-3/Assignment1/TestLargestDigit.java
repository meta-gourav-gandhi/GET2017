package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestDigit {

	@Test
	public void testA() {
		LargestDigit ld=new LargestDigit();
		int actual = ld.largestdigit(2);
		int expected=2;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testB() {
		LargestDigit ld=new LargestDigit();
		int actual = ld.largestdigit(125769);
		int expected=9;
		assertEquals(expected,actual);

	}
	@Test
	public void testC() {
		LargestDigit ld=new LargestDigit();
		int actual = ld.largestdigit(444);
		int expected=4;
		assertEquals(expected,actual);
	}

}
