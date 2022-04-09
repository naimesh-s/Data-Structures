package com.ds.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
//		SinglyLinkedList list = new SinglyLinkedList();
//		list.insert(4);
//		list.insert(5);
//		list.insert(10);
//		list.insert(15);
//		list.insert(20);
//		
//		for(Object obj : SinglyLinkedList.displayList(list)) {
//			System.out.println(obj);
//		}
//		System.out.println("Size before removing >> "+ list.getSize());
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
		
//		list.remove(200);
//		
//		System.out.println("After removing element from list");
//		for(Object obj : SinglyLinkedList.displayList(list)) {
//			System.out.println(obj);
//		}
//		System.out.println("Size after removing >> "+ list.getSize());
		
//		System.out.println("\nAfter reversing list\n");
//		list.reverse();
//		for(Object obj : SinglyLinkedList.displayList(list)) {
//			System.out.println(obj);
//		}
//		System.out.println("Size after reversing >> "+ list.getSize());
		
//		System.out.println("\n");
		
		SinglyLinkedList strList = new SinglyLinkedList();
		strList.insert("Java");
		strList.insert("Python");
		strList.insert("Scala");
		strList.insert("AI");
		strList.insert("C++");
		
		for(Object obj : SinglyLinkedList.displayList(strList)) {
			System.out.println(obj);
		}
		System.out.println("Size of string list >> "+ strList.getSize());
		
		
		//Test Doubly LinkedList.
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		dll.insert(60);
		dll.insert(70);
		dll.insert(80);
		dll.insert(90);
		dll.insert(100);
		dll.insert(120);
		dll.insert(130);
		dll.insert(140);
		dll.insertAt(110, 10);
		
		for(Object obj : DoublyLinkedList.displayList(dll)) {
			System.out.println(obj);
		}
		System.out.println("Size of doubly linked list >> "+ dll.getSize());
		
		System.out.println("\nRemoving first element : \n");
		dll.removeFirst();
		for(Object obj : DoublyLinkedList.displayList(dll)) {
			System.out.println(obj);
		}
		System.out.println("Size of doubly linked list after removing first element >> "+ dll.getSize());
		
		System.out.println("\nRemoving element from doubly linked list : \n");
		dll.remove(50);
		for(Object obj : DoublyLinkedList.displayList(dll)) {
			System.out.println(obj);
		}
		System.out.println("Size of doubly linked list after removing element >> "+ dll.getSize());
	}

}
