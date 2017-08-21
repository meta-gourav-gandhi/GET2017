/**
 * 
 */
package com.metacube.list;

/**
 * @author Sunrise Computer
 *
 */
public interface MyList<E> extends java.lang.Iterable<E>{
	
	public boolean add(E element);
	public boolean addToPosition(int index,E element);
	public E getFromPosition(int index);
	public int getIndex(E element);
	public boolean removeFromPosition(int index);
	public boolean removeItem(E element);
	public boolean clear();
	public boolean reverse();
	public boolean sort();
	
}
