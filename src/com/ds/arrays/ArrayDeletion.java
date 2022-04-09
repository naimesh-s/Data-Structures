package com.ds.arrays;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length = sc.nextInt();
		int[] arr = new int[length];

		System.out.println("Enter the elements you want to enter in an array : ");
		for (int i = 0; i < length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to delete : ");
		int element = sc.nextInt();
		System.out.println("Enter the position of element you want to delete : ");
		int pos = sc.nextInt();
		
		deleteElementInArray(element, pos, arr);
	}

	public static void deleteElementInArray(int element, int pos, int[] arr) {
		
	}

}
