package com.gul.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences2 {

	public static void main(String[] args) {


//		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

//		int arr[] = { 1, 2, 2, 1, 1, 3 };

		int arr[] = { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16,
				20, 26, 16 };

//		int arr[] = { 1, 2 };

		
		
		int[] ca = new int[2001];
		for (int i : arr) {
			ca[i + 1000]++;
		}
		Boolean boolean1 = true;
		Arrays.sort(ca);
		for (int i = 0; i < 2000; i++) {
			if (ca[i] != 0 && ca[i] == ca[i + 1]) {
				boolean1 = false;
//				return false;
			} 
			else {
				boolean1 = true;
			}
		}
		
//		return true;
		System.out.println(boolean1);

	}

}
