package com.gul.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorganizeTheArray3 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> arr = Arrays.asList(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1);

		List<Integer> arr2 = rearrange(arr);

		System.out.println(arr2);

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime; // Time in milliseconds

		System.out.println("Elapsed time: " + elapsedTime + " ms");
	}

	public static List<Integer> rearrange(List<Integer> arr) {
		// Code here

		for (int i = 0; i < arr.size(); i++) {

			while (arr.get(i) != -1 && arr.get(i) != i) {
				int temp = arr.get(arr.get(i));
				arr.set(arr.get(i), arr.get(i));
				arr.set(i, temp);
			}

		}

		return arr;
	}
}
