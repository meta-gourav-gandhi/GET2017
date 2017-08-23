package com.metacube.main;

public class MyStack<E> {

	Node<E> start = null;
	Node<E> temp;
	int size = 0;


	/**
	 * method to push into the stack
	 * @param element to be pushed in the stack
	 * @return true if element entred
	 */
	public boolean myPush(E element) {
		Node<E> node = new Node<E>(element);

		if (start == null) {
			start = node;
		} else {
			node.next=start;
			start=node;
		}
		size++;
		return true;
	}
	
	/**
	 * remove the top of the stack
	 * @return the top element of the stack
	 */
	public E myPop(){
		if(start==null){
			return null;
		}else{
			size--;
			temp=start;
			start=start.next;
			return temp.data;
		}	
		
	}
	/**
	 * @return the top of the stack
	 */
	public E onTop(){
		if(start==null){
			return null;
		}else{
			return start.data;
		}
	}
	
	public int getSize(){
		return size;
	}
	
	/**
	 * @return true if the stack is empty
	 */
	public boolean isEmpty(){
		if(size==0){
			return true;
		}else{
			return false;
		}
	}
	
	
}
