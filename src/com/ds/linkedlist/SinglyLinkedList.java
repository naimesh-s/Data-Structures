package com.ds.linkedlist;

/**
 * Singly LinkedList
 * 
 * @author naimesh.shah
 *
 */
public class SinglyLinkedList {

	private Node head;
	private int size;

	/**
	 * Get size of LinkedList.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Insert Data to Singly LinkedList.
	 * 
	 * @param data
	 */
	public void insert(Object data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(node);
		}
		size++;
	}

	/**
	 * Insert data to Singly LinkedList at specific location/position.
	 * 
	 * @param data
	 * @param location
	 */
	public void insertAt(Object data, int location) {
		if (location > 0 && location <= size) {
			Node node = new Node(data);
			Node currentNode = this.head;
			for (int i = 0; i < location; i++) {
				currentNode = currentNode.getNextNode();
			}
			if (currentNode.getNextNode() != null) {
				node.setNextNode(currentNode.getNextNode());
				currentNode.setNextNode(node);
			}
		} else {
			System.out.println("Invalid location, please check the location you want to enter the element");
		}
		size++;
	}

	/**
	 * Remove element from Singly LinkedList.
	 * 
	 * @param o
	 */
	public void remove(Object o) {
		if (o != null) {
			Node prev = null;
			Node next = null;
			Node currentNode = this.head;

			while (currentNode.getNextNode() != null) {
				next = currentNode.getNextNode();
				if (o.equals(currentNode.getData())) {
					if (currentNode == this.head) {
						currentNode.setNextNode(null);
						this.head = next;
						break;
					}
					prev.setNextNode(next);
					break;
				}
				prev = currentNode;
				currentNode = currentNode.getNextNode();
			}
			currentNode = null;
			prev.setNextNode(null);
			System.gc();
			size--;
		}
	}

	/**
	 * Remove first element from the Singly LinkedList.
	 */
	public void removeFirst() {
		if (this.head == null) {
			System.out.println(
					"List is empty. Please insert element to remove. Use insert(Object obj) method to insert!");
			return;
		}
		Node temp;
		temp = this.head;
		this.head = head.getNextNode();
		temp = null;
		System.gc();
		size--;
	}

	/**
	 * Remove last element from Singly LinkedList.
	 */
	public void removeLast() {
		if (this.head == null) {
			System.out.println(
					"List is empty. Please insert element to remove. Use insert(Object obj) method to insert!");
			return;
		}
		Node prev = null;
		Node currentNode = this.head;
		while (currentNode.getNextNode() != null) {
			prev = currentNode;
			currentNode = currentNode.getNextNode();
		}

		prev.setNextNode(null);
		currentNode = null;
		System.gc();
		size--;
	}

	/**
	 * Reverse Singly LinkedList.
	 */
	public void reverse() {
		Node prevNode = null;
		Node nextNode = this.head;
		Node currentNode = this.head;

		while (nextNode != null) {
			nextNode = nextNode.getNextNode();
			currentNode.setNextNode(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		this.head = prevNode;
	}

	/**
	 * Display elements of Singly LinkedList.
	 * 
	 * @param list
	 * @return
	 */
	public static Object[] displayList(SinglyLinkedList list) {
		Node currentNode = list.head;

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
