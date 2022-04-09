package com.ds.arrays;

public class MinMaxElementProblemInArray {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 10, 15, 2, 5, 6 };
		int minElement = getMin(arr);
		System.out.println("The minimum element in array is : "+minElement);
		int maxElement = getMax(arr);
		System.out.println("The maximum element in array is : "+maxElement);
		
		MinMaxElementPair elementPair = getMinMax(arr);
		elementPair.toDisplay();
	}
	
	static int getMin(int[] arr) {
		int result = arr[0];
		for(int i=0; i<arr.length-1; i++)  {
			result = Math.min(result, arr[i]);
		}
		return result;
	}
	
	static int getMax(int[] arr) {
		int result = arr[0];

		for(int i=0; i<arr.length-1; i++) {
			result = Math.max(result, arr[i]);
		}
		return result;
	}
	
	static MinMaxElementPair getMinMax(int[] arr) {
		long resultMin = arr[0];
		long resultMax = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			resultMin = Math.min(resultMin, arr[i]);
			resultMax = Math.max(resultMax, arr[i]);
		}
		return new MinMaxElementPair(resultMin, resultMax);
	}
}
