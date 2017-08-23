package com.metacube.main;
public class Node<E> {
	 E data;
	 Node<E> next;
	
	public Node(E value){
		this.data=value;
		this.next=null;
	}
}
