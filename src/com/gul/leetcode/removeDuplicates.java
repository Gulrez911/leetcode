package com.gul.leetcode;

public class removeDuplicates {

	public static void main(String[] args) {
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = nums.length;
		n = removeDuplicates22(nums, n);
		// Print updated array
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
//		 }
	}

	static int removeDuplicates22(int[] arr, int n) {

		if (n == 0 || n == 1)
			return n;

		int[] temp = new int[n];

		// Start traversing elements
		int j = 0;
		for (int i = 0; i < n - 1; i++) {

			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];

		}
		temp[j++] = arr[n - 1];

		// Modify original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

}
