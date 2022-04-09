package com.ds.linkedlist;

public class Node {

	private Object data;
	private Node nextNode;
	
	public Node() {
		this.data = null;
		this.nextNode = null;
	}
	
	public Node(Object data) {
		this.data = data;
		this.nextNode = null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
