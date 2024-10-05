package com.gul.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray2 {

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

		k %= nums.length;

		int n = nums.length;

		reverseNum(nums, 0, n - 1);
		reverseNum(nums, 0, k - 1);
		reverseNum(nums, k, n - 1);

		System.out.println(Arrays.toString(nums));

	}

	public static void reverseNum(int[] nums, int start, int end) {

		while (start <= end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
