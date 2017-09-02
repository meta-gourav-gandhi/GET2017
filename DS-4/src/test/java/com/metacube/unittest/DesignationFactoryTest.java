package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.assignment1.DesignationFactory;

import org.junit.Test;

public class DesignationFactoryTest {

	@Test
	public void testGetDesignation() {
		String actual= DesignationFactory.getDesignation(1);
		String expected="Chair Person";
		assertEquals(expected, actual);
	}

}
