package com.gul.hackerrank;

import java.util.regex.Pattern;

public class JavaStringRegexTest {
	public static void main(String[] args) {

//		boolean pa = Pattern.matches("[^A-Za-z]", "Gulrez");
//		if (pa) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int n = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];

			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}
}
