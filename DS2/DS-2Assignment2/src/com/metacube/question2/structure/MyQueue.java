/**
 * 
 */
package com.metacube.question2.structure;

/**
 * @author gourav gandhi
 *
 */
public class MyQueue {

	Object myarray[];
	final int DEFAULT_SIZE = 5;
	int front, newSize = 5;
	int rear;
	int size = 0;

	public MyQueue() {
		myarray = new Object[DEFAULT_SIZE];
		front = 0;
		rear = -1;
	}

	/**
	 * method to insert the data in the queue
	 * 
	 * @param element
	 *            to enque in the queue
	 */
	public void enque(Object element) {

		if (getSize() == 0) {
			front = 0;
			rear = -1;
			myarray = new Object[DEFAULT_SIZE];
		}

		if (rear == newSize - 1) {
			myarray = resize(myarray);
			newSize += DEFAULT_SIZE;
		}

		myarray[++rear] = element;
		size++;
	}

	/**
	 * method to remove the data from the queue
	 * 
	 * @return element
	 */
	public Object dequeue() {
		if (front > rear) {
			return new Exception();
		} else {
			size--;
			return myarray[front++];
		}

	}

	/**
	 * method to resize the array
	 * 
	 * @param myarray2
	 * @return
	 */
	private Object[] resize(Object[] myarray2) {
		Object temp[] = new Object[myarray2.length + DEFAULT_SIZE];

		for (int i = 0; i < myarray2.length; i++) {
			temp[i] = myarray2[i];

		}

		return temp;
	}

	public Object getFront() {

		return myarray[front];
	}

	/**
	 * @return
	 */
	public int getSize() {

		return size;
	}

}
