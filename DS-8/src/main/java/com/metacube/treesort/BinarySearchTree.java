/**
 * 
 */
package main.java.com.metacube.treesort;

/**
 * @author gourav gandhi
 *
 */
public class BinarySearchTree {

	Node root;
	int output[];
	int counter = 0;

	public boolean insert(int element) {

		root = insertElement(element, root);
		return true;

	}

	/**
	 * @param element to be entered in the tree 
	 * @param curroot is the root where node is to be attached
	 * @return the root 
	 */
	private Node insertElement(int element, Node curRoot) {
		if (curRoot == null) {
			curRoot = new Node(element);
		} else {
			if (element >= (curRoot.data)) {
				curRoot.right = insertElement(element, curRoot.right);
			} else {
				curRoot.left = insertElement(element, curRoot.left);
			}
		}
		return curRoot;
	}

	/**
	 * @return the sorted array
	 */
	public int[] inOrder() {

		return printInOrder(root);
	}

	/**
	 * @param curroot takes the root of the tree as a parameter
	 * @returns the sorted array 
	 */
	private int[] printInOrder(Node curroot) {
		if (curroot != null) {
			printInOrder(curroot.left);
			output[counter++] = curroot.data;
			printInOrder(curroot.right);
		}
		return output;

	}

	/**
	 * @param input takes the input array to be sorted
	 * @return the sorted array
	 */
	public int[] sort(int[] input) {

		for (int index = 0; index < input.length; index++) {
			insert(input[index]);
		}
		output = new int[input.length];

		return inOrder();

	}

}
