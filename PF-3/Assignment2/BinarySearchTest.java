package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		
		BinarySearch bs=new BinarySearch();
		int input[]= {2,5,8,9,10,55,77};
		String actual=bs.search(input, 0, input.length-1, 88);
		String expected="not found";
		assertEquals(expected,actual);
	}
	
	@Test
	public void testB() {
		
		BinarySearch bs=new BinarySearch();
		int input[]= {2,5,8,9,10,55,77};
		String actual=bs.search(input, 0, input.length-1, 77);
		String expected="found";
		assertEquals(expected,actual);
	}


}
