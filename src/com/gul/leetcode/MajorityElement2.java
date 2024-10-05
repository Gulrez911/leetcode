package com.gul.leetcode;

public class MajorityElement2 {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 3, 2, 5, 3, 5, 3, 1 };
		System.out.println("The majority element is: " + majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int candidate = 0;
		int count = 0;

		// Finding the candidate using Boyer-Moore Voting Algorithm
		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		// Since the problem guarantees that a majority element exists,
		// we don't need to verify the candidate.
		return candidate;
	}
}
