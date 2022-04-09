package com.ds.arrays;

import java.util.ArrayList;
import java.util.List;

//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
//In case of multiple subarrays, return the subarray which comes first on moving from left to right.
	
	//Input:
		//N = 5, S = 12
		//A[] = {1,2,3,7,5}

	//Output: 2 4
		//Explanation: The sum of elements from 2nd position to 4th position is 12.

//	Expected Time Complexity: O(N)
//	Expected Auxiliary Space: O(1)

public class SumOfGivenSubArray {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 7, 1, 3, 3, 1, 4 };
		int target = 1;
		
		List<Integer> subArray = findSubarrays(nums, target);
		System.out.println(subArray);
	}

	private static List<Integer> findSubarrays(int[] nums, int target) {
		List<Integer> l = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<=nums.length-1; i++) {
			if(sum <= target) {
				sum = sum + nums[i];
				l.add(nums[i]);
			}
		}
		return l;
	}

}
