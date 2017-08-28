package main.java.com.metacube.sortedlinkedlist;

import java.util.LinkedList;

public class SortedLinkedList<E extends Comparable<E>> {

	LinkedList<E> sortedLinkedList = new LinkedList<E>();

	public boolean add(E element) {
		int n = 0;
		insert(element, n);
		return true;
	}

	/**
	 * @param data to be entered in the list
	 * @param n position where to enter the position
	 * @return boolean value
	 */
	public boolean insert(E data, int n) {

		if (sortedLinkedList.size() == 0) {
			sortedLinkedList.addFirst(data);
			return true;
		} else if (sortedLinkedList.size() == n) {
			sortedLinkedList.addLast(data);
			return true;
		} else {
			if (data.compareTo(sortedLinkedList.get(n)) > 0) {
				insert(data, n + 1);
			} else {
				sortedLinkedList.add(n, data);
				return true;
			}
		}
		return true;
	}

	/**
	 * @return the sorted list
	 */
	public LinkedList<E> getList() {
		
		return sortedLinkedList;
	}

}
