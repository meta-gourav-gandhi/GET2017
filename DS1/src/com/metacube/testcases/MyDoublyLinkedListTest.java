package com.metacube.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.arraylist.MyArrayList;
import com.metacube.doublylinkedlist.MyDoublyLinkedList;

public class MyDoublyLinkedListTest {

	static MyDoublyLinkedList<Integer> test;
	@BeforeClass
	public static void initialze(){
		test = new MyDoublyLinkedList<Integer>();
		test.add(12);
		test.add(13);
		test.add(14);
	}
	@Test
	public void testAdd() {
		boolean actual=test.add(15);
		boolean expected=true;
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveItem() {
		boolean actual=test.removeItem(13);
		boolean expected=true;
		assertEquals(expected, actual);
	}
	@Test
	public void testRemoveItemNegative() {
		boolean actual=test.removeItem(23);
		boolean expected=false;
		assertEquals(expected, actual);
	}
}
