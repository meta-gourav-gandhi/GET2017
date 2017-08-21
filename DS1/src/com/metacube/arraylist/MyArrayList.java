package com.metacube.arraylist;

import java.util.Iterator;

import sun.text.CompactByteArray;

import com.metacube.list.MyList;

public class MyArrayList<E extends Comparable<E>> implements MyList<E> {

	public Comparable<E> myarray[];
	int size;
	final int DEFAULT_SIZE = 5;

	public MyArrayList() {
		myarray = new Comparable[DEFAULT_SIZE];
	}
	/**
	 * @param element to add in the arraylist
	 */
	@Override
	public boolean add(E element) {
		if (check()) {
			myarray[size++] = element;
		}
		return true;
	}
	/**
	 * 
	 * @return true if the new size is greater than array size
	 */
	private boolean check() {
		if (size >= myarray.length) {
			increaseSize();
		}
		return true;
	}
	/**
	 * method to increase the size of the array
	 */
	private void increaseSize() {
		Comparable temparray[] = myarray.clone();
		myarray = new Comparable[DEFAULT_SIZE * 2];
		for (int index = 0; index < temparray.length; index++) {
			myarray[index] = temparray[index];

		}

	}

	/**
	 * @param index of the location where the data needs to be entred
	 * @param element to be entered in the position 
	 */
	@Override
	public boolean addToPosition(int index, E element) {

		if (check(index)) {
			size++;
			check();
			for (int counter = size - 1; counter >= index; counter--) {
				myarray[counter + 1] = myarray[counter];

			}
			myarray[index] = (Comparable<E>) element;
			return true;
		} else {
			return false;
		}
	}
	/**
	 * method to get the item from the position of the given index
	 */
	@Override
	public E getFromPosition(int index) {

		return (E) myarray[index];
	}

	@Override
	public int getIndex(E element) {
		for (int index = 0; index < size; index++) {
			if (element.equals(myarray[index])) {
				return index;
			}

		}
		return -1;
	}

	@Override
	public boolean removeFromPosition(int index) {
		for (int counter = index; counter < size; counter++) {
			myarray[counter] = myarray[counter + 1];

		}
		size--;
		return true;
	}

	@Override
	public boolean removeItem(E element) {
		boolean flag = false;
		for (int counter = 0; counter < size; counter++) {
			if (element.equals(myarray[counter])) {
				removeFromPosition(counter);
				flag = true;
				break;
			}

		}
		if (flag) {
			size--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean clear() {
		myarray = new Comparable[DEFAULT_SIZE];
		return true;
	}
	//method to reveres the arrraylist
	@Override
	public boolean reverse() {
		int tempSize = size - 1;
		Comparable temp[] = new Comparable[myarray.length];
		for (int index = 0; index < size; index++) {
			temp[index] = myarray[tempSize--];

		}
		myarray = temp;
		return true;
	}
	//method to sort the list
	@Override
	public boolean sort() {

		for (int index = 0; index < getSize(); index++) {
			for (int jindex = index + 1; jindex < getSize(); jindex++) {
				if (((Comparable<E>) myarray[index])
						.compareTo((E) myarray[jindex]) > 0) {
					Comparable<E> temp = myarray[jindex];
					myarray[jindex] = myarray[index];
					myarray[index] = temp;
				}
			}
		}
		return true;

	}

	public Comparable[] get() {
		return myarray;
	}

	public boolean check(int index) {
		if (index <= size) {
			return true;
		} else {
			return false;
		}
	}

	public int getSize() {
		return size;
	}
	
	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {

				return currentIndex < getSize();
			}

			@Override
			public E next() {
				return (E) myarray[currentIndex++];

			}

			@Override
			public void remove() {

			}

		};
		return iterator;
	}

}
