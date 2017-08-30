/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.assignment1.BinarySearch;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class BinarySearchTest {

	
	@Test
	public void testSearchAllDifferent() {
		
		int a[]={1,2,3,4,8,9};
		int actual=BinarySearch.search(a, 4);
		int expected=3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchAllSame() {
		
		int a[]={4,4,4,4};
		int actual=BinarySearch.search(a, 4);
		int expected=0;
		assertEquals(expected, actual);
	}

	
	@Test
	public void testSearchRandom() {
		
		int a[]={1,5,9,10};
		int actual=BinarySearch.search(a, 4);
		int expected=-1;
		assertEquals(expected, actual);
	}

	
	@Test
	public void testSearch() {
		
		int a[]={1,4,8,10,11};
		int actual=BinarySearch.search(a,8);
		int expected=2;
		assertEquals(expected, actual);
	}


}
