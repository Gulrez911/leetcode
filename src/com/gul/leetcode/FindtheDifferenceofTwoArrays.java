package com.gul.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {

	public static void main(String[] args) {

//		List<Integer> nums1 = Arrays.asList(1, 2, 3);
//		List<Integer> nums2 = Arrays.asList(2, 4, 6);
//		long startTime = System.nanoTime();
		long startTime = System.currentTimeMillis();
 
	
		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 4, 6 };
//		List<Integer> nums2 = Arrays.asList(2, 4, 6);
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> set2 = new HashSet<>();
		List<Integer> set = new ArrayList<>();
		List<Integer> set2 = new ArrayList<>();
		int flag = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					flag = 1;
				}
			}
			if (flag == 0) {
				if (!set.contains(nums1[i])) {
					set.add(nums1[i]);
				}

			}
			flag = 0;
		}

		int flag2 = 0;
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] == nums1[j]) {
					flag2 = 1;
				}
			}
			if (flag2 == 0) {

				if (!set2.contains(nums2[i])) {
					set2.add(nums2[i]);
				}

			}
			flag2 = 0;
		}
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(set);
		lists.add(set2);
//		return lists;
		System.out.println(set);
		System.out.println(set2);
		
//		long endTime   = System.nanoTime();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
