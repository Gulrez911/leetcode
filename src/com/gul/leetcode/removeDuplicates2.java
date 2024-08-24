package com.gul.leetcode;

import java.util.Arrays;

public class removeDuplicates2 {
	public static void main(String[] args) {
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = nums.length;
		n = removeDuplicates(nums);
		// Print updated array
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
//		 }
	}

	public static int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[++count] = nums[i + 1];
			}
		}
		return ++count;
	}
}
