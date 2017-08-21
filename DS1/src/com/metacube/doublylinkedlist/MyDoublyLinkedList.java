package com.metacube.doublylinkedlist;
import java.util.Iterator;
import com.metacube.list.MyList;

public class MyDoublyLinkedList<E extends Comparable<E>> implements MyList<E> {

	Node<E> start=null;
	Node<E> temp;
	int size=0;
	@Override
	public boolean add(E element) {
		Node<E> node=new Node<E>(element);
		
		
		if(start==null){
			start=node;
		}else{
			temp=start;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
			node.previous=temp;
		}
		size++;
		return true;
	}
	/**
	 * @param index position where element needs to be added
	 * @param element that needs to be added
	 */
	@Override
	public boolean addToPosition(int index, E element) {
		
		Node<E> node=new Node<E>(element);
		if(index==0){
			node.next=start;
			start.previous=node;
			start=node;
		}else{
			temp=start;
			for (int counter = 0; counter < index-1; counter++) {
				temp=temp.next;
				
			}
			temp.next.previous=node;
			node.next=temp.next;
			node.previous=temp;
			temp.next=node;
		}
		size++;
		return true;
	}
	//method to get element from the index
	@Override
	public E getFromPosition(int index) {
		temp=start;
		for (int counter = 0; counter <index; counter++) {
			temp=temp.next;
			
		}
		return temp.data;
	}

	@Override
	public int getIndex(E element) {
		return 0;
	}
	//remove the element from the given index
	@Override
	public boolean removeFromPosition(int index) {
		temp=start;
		if(index==0){
			start=start.next;
		}
		else if(index<size){
			for (int counter = 0; counter < index; counter++) {
				temp=temp.next;
			
			}
			if(temp.next!=null){
				temp.previous.next=temp.next;
				temp.next.previous=temp.previous;
				
			}else{
				temp.previous.next=null;
			}
		}
		size--;
		return true;
	}

	@Override
	public boolean removeItem(E element) {
		boolean flag=false;
		if(start.data.equals(element)){
			start=start.next;
			start.previous=null;
			size--;
			flag = true;
		}
		else{
			temp=start;
			//Node <E> pre=start;
			while(temp.next!=null){
				if(temp.data.equals(element)){
					temp.next.previous=temp.previous;
					temp.previous.next=temp.next;
					size--;
					flag = true;
					break;
				}
				temp=temp.next;
			}
			if(temp.next==null && temp.data.equals(element)){
				temp.previous.next=null;
				size--;
				flag=true;
			}
			
			
		}
		if(flag){
			return true;
		}else{
			return false;
		}
		
		
	}

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverse() {
		temp=start;
		Node<E> start1 = null;
		
		while(start!=null){
			temp=start;
			start=start.next;
			temp.next = start1;
			temp.previous=null;
			start1 = temp;
		}
		start=start1;
		return true;
	}

	@Override
	public boolean sort() {
		Node<E> temp1 = start;
		Node<E> temp2 = null;
		while (temp1 != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.data.toString().compareTo(temp2.data.toString()) > 0) {
					E temp = temp1.data;
					temp1.data = temp2.data;
					temp2.data = temp;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return true;
	}

	public boolean check(int index) {
		if(index<size){
			return true;
		}else{
			return false;
		}
	}
	public int getSize(){
		return size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>() {

			private Node<E> temp = start;

			@Override
			public boolean hasNext() {
				return temp != null;
			}

			@Override
			public E next() {
				Node<E> temp2 = temp;
				temp = temp.next;
				return temp2.data;

			}

			@Override
			public void remove() {

			}

		};
		return iterator;
	
	}

}
