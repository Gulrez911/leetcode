package com.gul.leetcode;

import java.util.Arrays;

public class MergeSortedArray2 {

	public static void main(String[] args) {
		int nums1[] = { 1,0, 2,0, 3,0 };
		int nums2[] = { 2, 3, 5 };
		int m = 3;
		int n = 3;
		merge(nums1, m, nums2, n);
		for (int i = 0; i < m + n; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int j = 0, i = m; j < n; j++) {
			nums1[i] = nums2[j];
			i++;
		}
		Arrays.sort(nums1);

	}

}
