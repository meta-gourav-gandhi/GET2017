package com.metacube.question2.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacube.question2.structure.MyQueue;

public class MyQueueTest {

	@Test
	public void testDequeue() {
		MyQueue test=new MyQueue();
		test.enque(23);
		test.enque(12);
		test.enque(43);
		
		Object actual= test.dequeue();
		Object expected=23;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFront() {
		MyQueue test=new MyQueue();
		test.enque(13);
		test.enque(12);
		test.enque(13);
		
		Object actual= test.getFront();
		Object expected=13;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSize() {
		MyQueue test=new MyQueue();
		test.enque(13);
		test.enque(12);
		test.enque(13);
		
		Object actual= test.getSize();
		Object expected=3;
		assertEquals(expected, actual);
	}

}
