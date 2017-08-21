package com.metacube.doublylinkedlist;



public class Node<E extends Comparable<E>> {

	E data;
	Node<E> next;
	Node<E> previous;

	public Node(E value){
		this.data=value;
		this.next=null;
		this.previous=null;
	}
	
}
