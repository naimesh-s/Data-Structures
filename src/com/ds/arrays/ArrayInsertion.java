package com.ds.arrays;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to insert : ");
		int element = sc.nextInt();
		System.out.println("Enter the position of element you want to insert : ");
		int pos = sc.nextInt();
		int[] arr = {6, 2, 0, 4, 5};
		insert(element, pos, arr);
	}

	private static void insert(int element, int pos, int[] arr) {
		int size = arr.length;
		for(int i=size-1; i>=pos-1; i++) {
			arr[i+1] = arr[i];
		}
	}

}
