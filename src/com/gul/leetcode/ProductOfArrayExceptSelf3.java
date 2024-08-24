package com.gul.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 3, 4 };

//		int nums[] = { -1, 1, 0, -3, 3 };

		nums = productExceptSelf(nums);
//		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] productExceptSelf(int[] nums) {

		int size = nums.length;
		int prod = 1;
		int check = 0;
		for (int i = 0; i < size; i++) {
			if (nums[i] != 0) {
				prod = nums[i] * prod;
			} else {
				check++;
			}

		}

		for (int i = 0; i < size; i++) {
			if (nums[i] == 0 && check == 1) {
				nums[i] = prod;
			} else if (check == 0) {

				nums[i] = prod / nums[i];
			} else if (check != 0) {
				nums[i] = 0;
			}
		}
		return nums;
	}
}
