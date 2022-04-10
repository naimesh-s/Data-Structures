package com.ds.stack;

public class StackUsingArrays {

	private Object[] stack;
	private int top;
	private int size;

	public StackUsingArrays(int size) {
		this.stack = new Object[size];
		this.top = -1;
		this.size = size;
	}

	/**
	 * Push elements to stack.
	 * 
	 * @param o
	 */
	public void push(Object o) {
		if (top == size - 1) {
			System.out.println("Stack is full, cannot insert new element.");
		} else {
			top++;
			this.stack[top] = o;
		}
	}

	/**
	 * Pop elements from stack i.e. it return the item and remove from the stack.
	 * 
	 * @return
	 */
	public Object pop() {
		Object item = null;
		if (top == -1) {
			System.out.println("Stack is empty!!");
		} else {
			item = stack[top];
			top--;
		}
		return item;
	}

	/**
	 * Peek elements from stack i.e. it will return the item from stack without
	 * deleting the element.
	 * 
	 * @return
	 */
	public Object peek() {
		Object item = null;
		if (this.top == -1) {
			System.out.println("Stack is empty!!");
		} else {
			item = stack[top];
		}
		return item;
	}

	/**
	 * Return the stack items.
	 * 
	 * @return
	 */
	public Object[] getStackItems() {
		Object[] items = new Object[size];
		int i = 0;
		for (int x = top; x >= 0; x--) {
			items[i++] = stack[x];
		}
		return items;
	}
}
