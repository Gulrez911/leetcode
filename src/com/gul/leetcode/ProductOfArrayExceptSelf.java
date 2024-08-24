package com.gul.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = { 1, 2, 3, 4 };

		int nums[] = { -1, 1, 0, -3, 3 };

		nums = productExceptSelf(nums);
//		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] productExceptSelf(int[] nums) {

		int result[] = new int[nums.length];
		int temp = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					temp = nums[j] * temp;
					result[i] = temp;
				}
			}
			temp = 1;
		}

		return result;

	}

}
