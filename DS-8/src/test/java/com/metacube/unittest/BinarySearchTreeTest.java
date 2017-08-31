/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.treesort.BinarySearchTree;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class BinarySearchTreeTest {

	@Test
	public void testInsertAllDifferent() {
		BinarySearchTree bst = new BinarySearchTree();
		int[] a={3,2,5,6,1,7,4};
		int[]actual= bst.sort(a);
		int[] expected={1,2,3,4,5,6,7};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testInsertAllSame() {
		BinarySearchTree bst = new BinarySearchTree();
		int[] a={4,4,4,4,4};
		int[]actual= bst.sort(a);
		int[] expected={4,4,4,4,4};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testInsertRandom() {
		BinarySearchTree bst = new BinarySearchTree();
		int[] a={3,3,2,2,1,5,6};
		int[]actual= bst.sort(a);
		int[] expected={1,2,2,3,3,5,6};
		assertArrayEquals(expected, actual);
	}


}
