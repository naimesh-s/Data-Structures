package com.ds.stack;

import com.ds.linkedlist.Node;

public class StackUsingSinglyLinkedList {

	private Node top = null;
	private int size;

	/**
	 * Push element into stack using linked list.
	 * 
	 * @param o
	 */
	public void push(Object o) {
		if (o != null) {
			Node newNode = new Node(o);
			newNode.setNextNode(top);
			top = newNode;
			size++;
		}
	}

	/**
	 * Remove and return the top most element from the stack.
	 * 
	 * @return
	 */
	public Object pop() {
		Object item = null;
		if (top == null) {
			System.out.println("Stack is empty");
		} else {
			Node currentNode = this.top;
			item = currentNode.getData();
			this.top = currentNode.getNextNode();
			currentNode = null;
			System.gc();
			size--;
		}
		return item;
	}

	/**
	 * Return the top element from the stack without removing the element from
	 * stack.
	 * 
	 * @return
	 */
	public Object peek() {
		Object item = null;
		if (top == null) {
			System.out.println("Stack is empty");
		} else {
			item = this.top.getData();
		}
		return item;
	}

	/**
	 * Returns the elements of stack.
	 * 
	 * @return
	 */
	public Object[] display() {
		Object[] items = new Object[size];
		if (this.top == null) {
			return null;
		}
		Node temp = this.top;
		int i = 0;
		while (temp != null) {
			items[i++] = temp.getData();
			temp = temp.getNextNode();
		}
		return items;
	}
}
