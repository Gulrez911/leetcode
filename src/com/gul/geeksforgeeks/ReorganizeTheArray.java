package com.gul.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorganizeTheArray {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1);

		List<Integer> arr2 = rearrange(arr);

		System.out.println(arr2);
	}

	public static List<Integer> rearrange(List<Integer> arr) {
		// Code here

		Collections.sort(arr);
		List<Integer> arr22 = new ArrayList<Integer>();
		int flag = 0;
		for (int i = 0; i < arr.size(); i++) {

			for (int j = 0; j < arr.size(); j++) {

				if (i == arr.get(j)) {
					
					flag = 1;
					arr22.add(arr.get(j));
					break;
				}

			}
			if (flag != 1) {
				arr22.add(-1);
			}
			flag = 0;
		}
		
		return arr22;
	}
}
