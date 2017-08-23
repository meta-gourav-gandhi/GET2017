package com.metacube.binarytree;

public class BinaryTree<E extends Comparable<E>> {

	Node<E> root;
	String result="";
	public void insert(E element) {
		root = insertElement(element, root);
	}

	/**
	 * method to insert the element in the root
	 * @param element to be entered 
	 * @param roottemp the base root of the tree
	 * @return the root 
	 */
	private Node<E> insertElement(E element, Node<E> roottemp) {

		if (roottemp == null) {
			roottemp = new Node<E>(element);
		} else {
			if (roottemp.left == null) {
				roottemp.left = insertElement(element, roottemp.left);
			} else {
				roottemp.right = insertElement(element, roottemp.right);
			}
		}
		return roottemp;
	}
	
	public String inOrder() {
		result="";
		printInOrder(root);
		return result;
	}

	/**
	 * method to print the inorder pattern
	 * @param root
	 */
	private void printInOrder(Node<E> root) {
		if (root != null) {
			printInOrder(root.left);
			result += root.data + " ";
			printInOrder(root.right);
		}

	}

	public String preOrder() {
		result="";
		printPreOrder(root);
		return result;
	}
	/**
	 * method to print in the preorder pattern
	 * @param root
	 */
	private void printPreOrder(Node<E> root) {

		if (root != null) {
			result += root.data + " ";
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
	}

	public String postOrder() {
		result="";
		printPostOrder(root);
		return result;
	}
	/**
	 * method to print in the postorder pattern pattern
	 * @param root
	 */
	private void printPostOrder(Node<E> root) {
		if (root != null) {

			printPostOrder(root.left);
			printPostOrder(root.right);
			result += root.data + " ";
		}

	}

	/**
	 * @param nextInt
	 */
	public void mirrorinsert(E element) {

		root = insertMirrorElement(element, root);

	}

	/**
	 * method to insert element in the mirrored format
	 * @param element to be enetred
	 * @param root2
	 * @return
	 */
	private Node<E> insertMirrorElement(E element, Node<E> roottemp) {
		if (roottemp == null) {
			roottemp = new Node<E>(element);
		} else {
			if (roottemp.right == null) {
				roottemp.right = insertMirrorElement(element, roottemp.right);
			} else {
				roottemp.left = insertMirrorElement(element, roottemp.left);
			}
		}
		return roottemp;
	}

	/**
	 * method check if the trees are mirrored or not
	 * @param btmirror
	 * @return
	 */
	public boolean checkMirror(BinaryTree<E> btmirror) {

		return checkTreeMirror(this.root, btmirror.root);
	}

	/**
	 * @param rootold is the root of the calling method  
	 * @param rootnew is the root of thee which is passed as a argument
	 * @return true if the trees are mirrored
	 */
	private boolean checkTreeMirror(Node<E> rootold, Node<E> rootnew) {

		if (rootold == null && rootnew == null) {
			return true;
		}

		if (rootold == null || rootnew == null) {
			return false;
		}

		return rootold.data.equals(rootnew.data)
				&& checkTreeMirror(rootold.right, rootnew.left)
				&& checkTreeMirror(rootold.left, rootnew.right);
	}

}
