package com.ds.arrays;

public class MinMaxElementPair {

	private long min;
	private long max;
	
	public MinMaxElementPair(long resultMin, long resultMax) {
		this.min = resultMin;
		this.max = resultMax;
	}
	
	public void toDisplay() {
		System.out.println("The minimum element of array is : "+this.min);
		System.out.println("The maximum element of array is : "+this.max);
	}
}
