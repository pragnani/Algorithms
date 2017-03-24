package com.algorithms.dc;

public class StackWithLinkedList {

	Node first = null;

	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String value) {
		Node oldFirst = first;
		first = new Node();
		first.item = value;
		first.next = oldFirst;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;

	}
	
	public static void main(String[] args) {
		StackWithLinkedList stakwithList= new StackWithLinkedList();
		stakwithList.push("Test");
		stakwithList.push("king");
		stakwithList.push("queen");
		String pop = stakwithList.pop();
		System.out.println(pop);
		
	}

}
