package com.algorithms.dc;

public class BinarySearchTree {
	Node root;

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (root == null) {
			root = newNode;
		} else {
			Node parent;
			Node current = root;
			while (true) {
				parent = current;
				if (data < current.getData()) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						break;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						break;
					}

				}

			}

		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}

	}
	
	public void preOrder(){
		preOrder(root);
	}

	private void preOrder(Node root2) {
		if (root2 != null) {
			System.out.println(root2.data);
			inOrder(root2.left);
			inOrder(root2.right);
		}
		
	}

}
