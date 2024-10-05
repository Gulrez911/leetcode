package com.gul.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReverseArray2 {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 4 };
		int n = nums1.length;
		int start = 0;
		int end = n - 1;
//		Recussion method
		reverseArray(nums1, n, start, end);
	}

	static void reverseArray(int[] nums1, int n, int start, int end) {

		if (start > end)
			return;
		int temp = nums1[start];
		nums1[start] = nums1[end];
		nums1[end] = temp;

		reverseArray(nums1, n, start + 1, end - 1);
	}

}
