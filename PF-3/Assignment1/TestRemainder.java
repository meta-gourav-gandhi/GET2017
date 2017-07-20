package Assignment1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class TestRemainder {

	@Test
	public void testA() {
		Remainder r=new Remainder();
		int actual=r.rem(2, 1);
		int expected=0;
		assertEquals(expected, actual);
	}

	@Test
	public void testB() {
		Remainder r=new Remainder();
		int actual=r.rem(2, 0);
		int expected=-1;
		assertEquals(expected, actual);
	}

	@Test
	public void testC() {
		Remainder r=new Remainder();
		int actual=r.rem(100, 3);
		int expected=1;
		assertEquals(expected, actual);
	}	
	
}
