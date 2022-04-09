package com.ds.arrays;

//Question ***: 
/*Given an integer array, find the peak element in it. A peak element is an element that is greater than its neighbors. 
There might be multiple peak elements in an array, and the solution should report any peak element.*/

//Solution ***:
/*We can easily solve this problem in O(log(n)) time by using an idea similar to the binary search algorithm. 
The idea is to calculate the mid-index, and if the middle element is greater than both of its neighbors, return the element as it is a peak. 
If the right neighbor of mid-index is greater than the middle element, recursively find the peak on the array’s right side.
If the left neighbor of mid-index is greater than the middle element, recursively find the peak in the array’s left side.*/

//The time complexity of the above solution is O(log(n)), and the auxiliary space used by the program is O(log(n)).

public class PeakElementProblemInArray {

	public static void main(String[] args) {
		
		int[] nums = { 8, 9, 10,15, 2, 5, 6 };
		System.out.println("The Peak Element of an array is = "+findPeakElements(nums));
	}

	private static int findPeakElements(int[] nums) {
		
		if((nums == null) || (nums.length == 0)) {
			System.exit(-1);
		}
		int index = findPeakElements(nums, 0, nums.length-1);
		return nums[index];
	}

	private static int findPeakElements(int[] nums, int left, int right) {
		
		int mid = (left + right) / 2;
		
		if((mid == 0 || nums[mid-1] <= nums[mid]) && 
				(mid == nums.length-1 || nums[mid+1]<=nums[mid])) {
			return mid;
		}
		
		if(mid-1 >= 0 && nums[mid-1] >= nums[mid]) {
			return findPeakElements(nums, left, mid-1);
		}
		
		return findPeakElements(nums, mid+1, right);
	}
	
	 

}
