package com.ds.linkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(4);
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);
		
		for(Object obj : SinglyLinkedList.displayList(list)) {
			System.out.println(obj);
		}
		
//		list.removeFirst();
//		
//		System.out.println("After removing first element from list");
//		for(Object obj : SinglyLinkedList.displayList(list)) {
//			System.out.println(obj);
//		}
//		
//		list.removeLast();
//		
//		System.out.println("After removing Last element from list");
//		for(Object obj : SinglyLinkedList.displayList(list)) {
//			System.out.println(obj);
//		}
		
		list.remove(20);
		
		System.out.println("After removing element from list");
		for(Object obj : SinglyLinkedList.displayList(list)) {
			System.out.println(obj);
		}
	}

}
