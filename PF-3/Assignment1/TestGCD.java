package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCD {

	@Test
	public void test() {
		GCD r=new GCD();
		int actual=r.gcd(2, 1);
		int expected=1;
		assertEquals(expected, actual);
	}

	@Test
	public void testB() {
		GCD r=new GCD();
		int actual=r.gcd(12, 18);
		int expected=6;
		assertEquals(expected, actual);
	}

	@Test
	public void testC() {
		GCD r=new GCD();
		int actual=r.gcd(100, 3);
		int expected=1;
		assertEquals(expected, actual);
		
	}

}
