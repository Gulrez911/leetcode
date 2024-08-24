package com.gul.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumberofOccurrences {

	public static void main(String[] args) {

//		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

//		int arr[] = { 1, 2, 2, 1, 1, 3 };

		int arr[] = { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16,
				20, 26, 16 };

//		int arr[] = { 1, 2 };

		int count = 0;
		Set<Integer> check = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			System.out.println("1: " + arr[i]);
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
				if (arr[i] == arr[j]) {
					count++;
					if (count == 2) {
						check.add(arr[j]);
						count = 0;
//						if (!check.contains(arr[j])) {
						break;
//						}
					}
				}

			}
		}
		int check22 = 0;
		Boolean boolean1;
		
		System.out.println(check);
		for (int i = 0; i < arr.length; i++) {

			if (!check.contains(arr[i])) {
				check22++;
			}

		}
		if (check22 == 1) {
			boolean1 = true;
			System.out.println("true");
		} else {
			boolean1 = false;
			System.out.println("false");
		}
//		return boolean1;

//		System.out.println("rep:      " + rep);
	}

}
