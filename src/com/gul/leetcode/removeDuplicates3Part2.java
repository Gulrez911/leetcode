package com.gul.leetcode;

public class removeDuplicates3Part2 {

	public static void main(String[] args) {
		int nums[] = { 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = nums.length;
		n = removeDuplicates22(nums);
	}

	static int removeDuplicates22(int[] nums) {

		int i = 0;
		for (int n : nums) {
			if (i < 2 || n != nums[i - 2]) {
				nums[i++] = n;
			}
		}

		return i;
	}

}
