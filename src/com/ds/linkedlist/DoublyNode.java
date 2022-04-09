package com.ds.linkedlist;

public class DoublyNode {

	private Object data;
	private DoublyNode prevNode;
	private DoublyNode nextNode;
	
	public DoublyNode() {
		this.data = null;
		this.prevNode = null;
		this.nextNode = null;
	}
	
	public DoublyNode(Object data) {
		this.data = data;
		this.prevNode = null;
		this.nextNode = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DoublyNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoublyNode prevNode) {
		this.prevNode = prevNode;
	}

	public DoublyNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}

}
