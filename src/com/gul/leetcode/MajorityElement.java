package com.gul.leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		int n = nums.length;
		majorityElement(nums);
		System.out.println("Sorted array: ");
	}

	public static int majorityElement(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			
		}
		return 0;

	}

}
