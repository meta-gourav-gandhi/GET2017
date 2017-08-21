package com.metacube.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.linkedlist.MyLinkedList;

public class MyLinkedListTest {

	static MyLinkedList<Integer> test;
	@BeforeClass
	public static void initialze(){
		test = new MyLinkedList<Integer>();
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
