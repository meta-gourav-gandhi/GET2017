package com.metacube.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.arraylist.MyArrayList;

public class MyArrayListTest {

	static MyArrayList<Integer> test;
	@BeforeClass
	public static void initialze(){
		test = new MyArrayList<Integer>();
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
	public void testGetIndex() {
		int actual=test.getIndex(13);
		int expected=1;
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
