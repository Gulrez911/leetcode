package com.gul.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays2 {

	public static void main(String[] args) {

//		List<Integer> nums1 = Arrays.asList(1, 2, 3);
//		List<Integer> nums2 = Arrays.asList(2, 4, 6);
//		long startTime = System.nanoTime();
		long startTime = System.currentTimeMillis();

		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 4, 6 };

		Set<Integer> set1 = new HashSet<>(); // create 2 hashsets
		Set<Integer> set2 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		} // add nums1 elements to set1
		for (int num : nums2) {
			set2.add(num);
		} // add nums2 elements to set2

		List<List<Integer>> resultList = new ArrayList<>(); // Initialize result list with 2 empty sublists
								// that we will return
		resultList.add(new ArrayList<>());
		resultList.add(new ArrayList<>());

		for (int num : set1) { // just iterate to all elements of set1
			if (!set2.contains(num)) {
				resultList.get(0).add(num);
			} // add those elements to first sublist of result list, which are not in set2.
		}
		for (int num : set2) { // just iterate to all elements of set2
			if (!set1.contains(num)) {
				resultList.get(1).add(num);
			} // add those elements to first sublist of result list, which are not in set1
		}
//		return resultList;

//		return lists;
		System.out.println(resultList);

//		long endTime = System.nanoTime();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
