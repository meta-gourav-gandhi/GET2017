package com.metacube.linkedlist;

public class Node<E extends Comparable<E>> {

	 E data;
	 Node<E> next;
	
	public Node(E value){
		this.data=value;
		this.next=null;
	}
	
}
