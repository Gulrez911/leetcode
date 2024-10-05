package com.gul.geeksforgeeks;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 9, 21, 21, 27, 34, 52 };
//		int[] arr = { 2, 3, 2, 1};

//		System.out.println(arr.length);
		int k = 21;
//		ArrayList<Integer> ss = 
		int ss = binarysearch(arr, k);

		System.out.println(ss);
	}

	public static int binarysearch(int[] arr, int k) {
		// Code Here
		int m = 0, flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				m = i;
				flag = 1;
				break;
			}
		}
		if (m == 0 && flag == 1) {

			return 0;
		}
		if (m == 0 && flag == 0) {

			return -1;
		} else {
			return m;

		}

	}
}