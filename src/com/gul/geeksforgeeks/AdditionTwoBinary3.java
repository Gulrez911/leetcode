package com.gul.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AdditionTwoBinary3 {

	public static void main(String[] args) {
//		ArrayList<Integer> arrr = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3));

//		int[] arr = { 2, 3, 2, 1, 2, 3 };
//		int[] arr = { 2, 3, 2, 1};
		int[] arr = { 11, 12, 70, 37, 30, 63, 49, 12, 32, 63, 12, 51, 64, 45, 8, 67, 34, 1, 17, 67, 55, 23,
				11, 42, 65, 73, 41, 67, 67, 53, 29, 28, 49, 36, 38, 34, 21, 55, 14, 55, 33, 33, 23,
				48, 14, 14, 1, 41, 4, 10, 37, 16, 61, 73, 18, 24, 73, 51, 57, 23, 32, 66, 7, 63, 61,
				24, 18, 9, 67, 53, 47, 17, 72, 69 };
		System.out.println(arr.length);
//		ArrayList<Integer> ss = 
		ArrayList<Integer> ss = duplicates(arr);
		System.out.println(ss);
	}

	public static ArrayList<Integer> duplicates(int[] arr) {
		ArrayList<Integer> arrr = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					if (!arrr.contains(arr[i])) {

						arrr.add(arr[i]);
					}
				}

			}
		}
		Collections.sort(arrr);
		if (arrr.isEmpty()) {
			arrr.add(-1);
		}

		return arrr;
		// code here
	}
}