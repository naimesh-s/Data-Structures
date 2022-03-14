package com.ds.arrays;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length = sc.nextInt();
		int[] arr = new int[length+1];

		System.out.println("Enter the elements you want to enter in an array : ");
		for (int i = 0; i < length ; i++) {
			arr[i] = sc.nextInt();
		}
			
		System.out.println("Enter the element you want to insert : ");
		int element = sc.nextInt();
		System.out.println("Enter the position of element you want to insert : ");
		int pos = sc.nextInt();

		int[] newArr = insert(element, pos, arr);
		printArray(newArr);
	}

	private static void printArray(int[] arr) {
		System.out.println("Array elements are : ");
		for(int element : arr) {
			System.out.println(element);
		}
	}

	private static int[] insert(int element, int pos, int[] arr) {
		int size = arr.length-1;
		if(pos <= 0 || pos > size-1) {
			System.out.println("Invalid Index..");
		}else {
			for(int i=(size-1); i>=(pos-1); i--) {
				arr[i+1] = arr[i];
			}
			arr[pos-1] = element;
		}
		return arr;
	}
}
