/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.sorting.CountingSort;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class CountingSortTest {

	@Test
	public void testSortAllDifferent() {
		int a[]={4,7,1,3,8,9,5};
		int [] actual=CountingSort.sort(a);
		int []expected = {1,3,4,5,7,8,9};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortAllSame() {
		int a[]={4,4,4,4,4,4,4};
		int [] actual=CountingSort.sort(a);
		int []expected = {4,4,4,4,4,4,4};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortRandom() {
		int a[]={4,6,60,2,1,3,3};
		int [] actual=CountingSort.sort(a);
		int []expected = {1,2,3,3,4,6,60};
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void testSort() {
		int a[]={};
		int [] actual=CountingSort.sort(a);
		int []expected = {};
		assertArrayEquals(expected, actual);
	}


}
