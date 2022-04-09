package com.ds.linkedlist;

/**
 * Doubly LinkedList
 * 
 * @author naimesh.shah
 *
 */
public class DoublyLinkedList {

	private DoublyNode head;
	private int size;

	public int getSize() {
		return size;
	}

	/**
	 * Insert element to doubly linked list.
	 * 
	 * @param o
	 */
	public void insert(Object o) {
		if (o != null) {
			DoublyNode newNode = new DoublyNode(o);
			if (this.head == null) {
				this.head = newNode;
			} else {
				DoublyNode currentNode = this.head;
				while (currentNode.getNextNode() != null) {
					currentNode = currentNode.getNextNode();
				}
				currentNode.setNextNode(newNode);
				newNode.setPrevNode(currentNode);
			}
		}
		size++;
	}

	/**
	 * Insert element at specific index in doubly linked list.
	 * 
	 * @param o
	 * @param index
	 */
	public void insertAt(Object o, int index) {
		if (o != null) {
			DoublyNode newNode = new DoublyNode(o);
			if (head == null) {
				this.head = newNode;
			} else {
				DoublyNode currentNode = this.head;
				DoublyNode prevNode = null;
				for (int i = 0; i < index; i++) {
					prevNode = currentNode;
					currentNode = currentNode.getNextNode();

				}
				prevNode.setNextNode(newNode);
				currentNode.setPrevNode(newNode);
				newNode.setPrevNode(prevNode);
				newNode.setNextNode(currentNode);
			}
			size++;
		}
	}

	/**
	 * Removing first element from doubly linked list.
	 */
	public void removeFirst() {
		if (this.head != null) {
			if (this.head.getNextNode() == null) {
				this.head = null;
			} else {
				DoublyNode currentNode = this.head;
				this.head = this.head.getNextNode();
				this.head.setPrevNode(null);
				currentNode = null;
				System.gc();
			}
			size--;
		}
	}

	/**
	 * Removing element from the doubly linked list.
	 * 
	 * @param o
	 */
	public void remove(Object o) {
		if (this.head != null) {
			DoublyNode currentNode = this.head;
			DoublyNode prevNode = null;

			if (this.head.getNextNode() == null && o.equals(this.head.getData())) {
				this.head = null;
			}
			while (currentNode.getNextNode() != null) {
				prevNode = currentNode.getPrevNode();
				if (o.equals(currentNode.getData())) {
					prevNode.setNextNode(currentNode.getNextNode());
					currentNode.getNextNode().setPrevNode(prevNode);
					currentNode = null;
					break;
				}
				currentNode = currentNode.getNextNode();
			}
			System.gc();
			size--;
		}
	}

	/**
	 * Display elements of doubly linked list.
	 * 
	 * @param list
	 * @return
	 */
	public static Object[] displayList(DoublyLinkedList list) {
		DoublyNode currentNode = list.head;

		if (currentNode.getNextNode() == null) {
			return null;
		}

		Object[] values = new Object[list.getSize()];
		int i = 0;

		while (currentNode.getNextNode() != null) {
			values[i++] = currentNode.getData();
			currentNode = currentNode.getNextNode();
		}
		values[i++] = currentNode.getData();
		return values;
	}
}
