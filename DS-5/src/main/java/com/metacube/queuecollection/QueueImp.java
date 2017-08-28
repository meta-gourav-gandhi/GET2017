package main.java.com.metacube.queuecollection;

import java.util.LinkedList;

public class QueueImp<E> {

	LinkedList<E> listObj = new LinkedList<E>();

	/**
	 * @param element to enqueue element in the queue
	 * @return
	 */
	public boolean enqueue(E element) {
		listObj.addLast(element);
		return true;
	}

	/**
	 * @return the front of the queue and remove it
	 */
	public E dequeue() {
		if (listObj.isEmpty()) {
			throw new NullPointerException();
		} else {
			return listObj.removeFirst();
		}

	}

	/**
	 * @return it just return thedata but does not remove it
	 */
	public E peek() {
		if (listObj.isEmpty()) {
			throw new NullPointerException();
		} else {
			return listObj.peek();
		}
	}

}
