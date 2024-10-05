package com.gul.leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {

//		int nums[] = { 3, 2, 2, 3 }, val = 3;

		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 }, val = 2;

		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (val == nums[i]) {
				count++;
			}
		}
		int[] anotherArray = new int[nums.length - count];
		int k = 0;
		for (int i = 0, m = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			if (val != nums[i]) {

				anotherArray[k++] = nums[i];

			}

		}
//		 Arrays.sort(anotherArray);
//		        return count;
//		return count;
		Arrays.sort(anotherArray);
//		System.out.println(anotherArray.toString());
//		return k;

	}

}
