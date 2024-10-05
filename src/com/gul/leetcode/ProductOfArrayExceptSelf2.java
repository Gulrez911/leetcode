package com.gul.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 4 };

//		int nums[] = { -1, 1, 0, -3, 3 };

		nums = productExceptSelf(nums);
//		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] productExceptSelf(int[] nums) {

		int[] left = new int[nums.length];
		// Array to store right multiplication
		int[] right = new int[nums.length];

		left[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		right[nums.length - 1] = 1;
		for (int i = nums.length - 2; i > -1; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}

		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = left[i] * right[i];
		}
		return ans;
	}
}
