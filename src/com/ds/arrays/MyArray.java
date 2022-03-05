package com.ds.arrays;

public class MyArray {

	private int length;
	private int capacity;
	private Object[] data;
	
	public MyArray() {
		this.length = 0;
		this.capacity = 1;
		this.data = new Object[1];
	}
	
	public MyArray(int capacity) {
		this.capacity = capacity;
		this.length = capacity - 1;
		this.data = new Object[this.capacity];
	}
	
	public int size() {
		return this.length;
	}
	
	public Object getElement(int index) {
		if(index < this.length) {
			System.out.println(" Index not allowed! ");
		}
		return this.data[index];
	}
	
	public int addElement(Object element) {
		this.data[this.length] = element;
		this.length++;
		return this.length;
	}
	
	
	
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		arr.addElement(10);
		arr.addElement(11);
		arr.addElement(12);
		
		System.out.println(arr.size());
	}
}
