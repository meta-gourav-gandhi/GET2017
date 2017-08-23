package com.metacube.binarytree;

public class Node<E extends Comparable<E>> {

	E data;
	Node<E> left;
	Node<E> right;

	public Node(E value){
		this.data=value;
		this.left=null;
		this.right=null;
	}
	
}
