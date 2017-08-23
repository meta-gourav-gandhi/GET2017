/**
 * 
 */
package com.metacube.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.binarytree.BinaryTree;

/**
 * @author gourav gandhi
 *
 */
public class BinaryTreeTest {

	static BinaryTree<Integer> test ;
	@BeforeClass
	public static void initialize(){
		test = new BinaryTree<Integer>();
		test.insert(1);
		test.insert(2);
		test.insert(3);
		test.insert(4);
		test.insert(5);
		
	}

	@Test
	public void testInOrder() {
		String actual =test.inOrder();
		String expected = "2 1 4 3 5 ";
		assertEquals(expected, actual);
	}

	
	@Test
	public void testPreOrder() {
		String actual =test.preOrder();
		String expected = "1 2 3 4 5 ";
		assertEquals(expected, actual);
	}

	@Test
	public void testPostOrder() {
		String actual =test.postOrder();
		String expected = "2 4 5 3 1 ";
		assertEquals(expected, actual);
	}

	
	@Test
	public void testCheckMirror() {
		BinaryTree<Integer> test2=new BinaryTree<Integer>();
		test2.mirrorinsert(1);
		test2.mirrorinsert(2);
		test2.mirrorinsert(3);
		test2.mirrorinsert(4);
		test2.mirrorinsert(5);
		
		boolean actual= test.checkMirror(test2);
		boolean expected=true;
		assertEquals(expected, actual);
		
	}
	@Test
	public void testCheckMirrorFalse() {
		BinaryTree<Integer> test2=new BinaryTree<Integer>();
		test2.mirrorinsert(2);
		test2.mirrorinsert(3);
		test2.mirrorinsert(1);
		test2.mirrorinsert(4);
		test2.mirrorinsert(5);
		
		boolean actual= test.checkMirror(test2);
		boolean expected=false;
		assertEquals(expected, actual);
		
	}

}
