package com.gul.leetcode;

import java.util.Scanner;

public class BubbleSorting2 {

	public static void main(String[] args) {
		int i, n, j, temp;
		System.out.println("Enter array Size: ");
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.print("Enter values in array: ");

		for (i = 0; i < n; ++i) {
			a[i] = scan.nextInt();
		}

		for (i = n; i > 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Result: ");
		for (i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}

	}

}
