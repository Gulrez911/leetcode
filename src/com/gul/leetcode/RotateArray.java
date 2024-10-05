package com.gul.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		Output: [5,6,7,1,2,3,4]
		int k = 3;
		rotate(nums, k);

		System.out.println("Rotate array: ");
//		printArray(arr, k);
	}

	// An optimized version of Bubble Sort
	public static void rotate(int[] nums, int k) {

		int temp;
		int n = nums.length;
		for (int i = 0; i < n / 2; i++) {
			temp = nums[i];
			nums[i] = nums[n - 1 - i];
			nums[n - 1 - i] = temp;
		}

		for (int i = 0; i < k / 2; i++) {
			temp = nums[i];
			nums[i] = nums[k - 1 - i];
			nums[k - 1 - i] = temp;
		}
//		for (int i = k, j = 0; i < n - k - 1 / 2; i++, j++) {
//			temp = nums[i];
//			nums[i] = nums[n - 1 - j];
//			nums[n - 1 - j] = temp;
//		}
		for (int i = k; i < n / 2; i++) {
			temp = nums[i];
			nums[i] = nums[n - 1 - i];
			nums[n - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(nums));

	}
}
