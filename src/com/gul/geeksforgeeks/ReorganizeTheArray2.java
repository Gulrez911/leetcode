package com.gul.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorganizeTheArray2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> arr = Arrays.asList(1, 4, 3, -1, 2, 5);

		List<Integer> arr2 = rearrange(arr);

		System.out.println(arr2);

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime; // Time in milliseconds

		System.out.println("Elapsed time: " + elapsedTime + " ms");
	}

	public static List<Integer> rearrange(List<Integer> arr) {
		// Code here

		Collections.sort(arr);
		System.out.println(arr);
		List<Integer> arr22 = new ArrayList<Integer>();
		int flag = 0;
		for (int i = 0; i < arr.size(); i++) {

			if (arr.contains(i)) {
				arr22.add(i);
			} else {
				arr22.add(-1);
			}

		}

//		System.out.println(arr22);
		return arr22;
	}
}
