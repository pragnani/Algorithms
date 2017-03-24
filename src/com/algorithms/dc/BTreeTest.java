package com.algorithms.dc;

public class BTreeTest {

	public static void main(String[] args) {
		BinarySearchTree tree= new BinarySearchTree();
		tree.insert(8);
		tree.insert(10);
		tree.insert(7);
		tree.insert(3);
		tree.insert(11);
		tree.insert(9);
		tree.insert(5);
//		tree.inOrder();
		
		tree.preOrder();
	}

}
