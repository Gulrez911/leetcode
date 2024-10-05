package com.gul.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReverseArray {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 4 };
		int n = nums1.length;

//		for (int i = n - 1; i >= 0; i--) {
//			System.out.println(nums1[i]);
//		}

		reverseArray(nums1, n);
	}

	static void reverseArray(int[] nums1, int n) {

		int temp;
		for (int i = 0; i < n / 2; i++) {

			temp = nums1[i];
			nums1[i] = nums1[n - 1 - i];
			nums1[n - 1 - i] = temp;
		}
	}

}
