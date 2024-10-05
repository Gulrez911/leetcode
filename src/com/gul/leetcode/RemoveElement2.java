package com.gul.leetcode;

import java.util.Arrays;

public class RemoveElement2 {

	public static void main(String[] args) {

//		int nums[] = { 3, 2, 2, 3 }, val = 3;

		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 }, val = 2;

		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}

//		return count;

	}

}
