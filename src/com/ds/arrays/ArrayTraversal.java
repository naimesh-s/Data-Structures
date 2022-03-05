package com.ds.arrays;

import java.util.Scanner;

public class ArrayTraversal {

	static int[] myArr = new int[10];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter numbers - ");  
		for(int i=0; i < myArr.length; i++) {
			myArr[i] = sc.nextInt();
		}
		ArrayTraversal at = new ArrayTraversal();
		at.traverse(myArr);
	}

	private void traverse(int[] myArr2) {
		System.out.println("Array Elements : ");
		for(int i : myArr2) {
			System.out.println(i);
		}
	}
}
