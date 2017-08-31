/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.sorting.QuickSort;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class QuickSortTest {

	
	@Test
	public void testSortAllDifferent() {
		int a[]={4,7,1,3,8,9,5};
		int [] actual=QuickSort.sort(a,0,a.length-1);
		int []expected = {1,3,4,5,7,8,9};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortAllSame() {
		int a[]={4,4,4,4,4,4,4};
		int [] actual=QuickSort.sort(a,0,a.length-1);
		int []expected = {4,4,4,4,4,4,4};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortRandom() {
		int a[]={4,6,6,2,1,3,3};
		int [] actual=QuickSort.sort(a,0,a.length-1);
		int []expected = {1,2,3,3,4,6,6};
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void testSort() {
		int a[]={};
		int [] actual=QuickSort.sort(a,0,a.length-1);
		int []expected = {};
		assertArrayEquals(expected, actual);
	}


}
