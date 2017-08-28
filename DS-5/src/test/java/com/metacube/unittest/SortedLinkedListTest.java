/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;

import java.util.LinkedList;

import main.java.com.metacube.sortedlinkedlist.SortedLinkedList;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class SortedLinkedListTest {

	
	@Test
	public void testAdd() {
		SortedLinkedList<Integer> sortedtest =new SortedLinkedList<Integer>();
		boolean actual= sortedtest.add(12);
		boolean expected= true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAddA() {
		SortedLinkedList<Integer> sortedtest =new SortedLinkedList<Integer>();
		sortedtest.add(5);
		sortedtest.add(10);
		sortedtest.add(8);
		sortedtest.add(2);
		sortedtest.add(12);
		LinkedList<Integer> actual= sortedtest.getList(); 
		String expected= "[2, 5, 8, 10, 12]";
		assertEquals(expected, actual.toString());
	}
	@Test
	public void testAddAllSame() {
		SortedLinkedList<Integer> sortedtest =new SortedLinkedList<Integer>();
		sortedtest.add(4);
		sortedtest.add(4);
		sortedtest.add(4);
		sortedtest.add(4);
		sortedtest.add(4);
		LinkedList<Integer> actual= sortedtest.getList(); 
		String expected= "[4, 4, 4, 4, 4]";
		assertEquals(expected, actual.toString());
	}
	

}
