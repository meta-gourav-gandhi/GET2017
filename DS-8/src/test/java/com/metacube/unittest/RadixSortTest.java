/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.sorting.RadixSort;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class RadixSortTest {

	@Test
	public void testSortAllDifferent() {
		int a[]={423,721,132,30,880,921,512};
		int [] actual=RadixSort.sort(a);
		int []expected = {30,132,423,512,721,880,921};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortAllSame() {
		int a[]={400,400,400,400,400,400,400};
		int [] actual=RadixSort.sort(a);
		int []expected = {400,400,400,400,400,400,400};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testSortRandom() {
		int a[]={423,612,621,243,143,365,356};
		int [] actual=RadixSort.sort(a);
		int []expected = {143,243,356,365,423,612,621};
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void testSort() {
		int a[]={};
		int [] actual=RadixSort.sort(a);
		int []expected = {};
		assertArrayEquals(expected, actual);
	}

}
