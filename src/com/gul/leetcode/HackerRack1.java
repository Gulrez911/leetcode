package com.gul.leetcode;

import java.util.Scanner;

public class HackerRack1 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		int N = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int N = 24;

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			}
			if (N > 20) {
				System.out.println("Not Weird");
			} else if (6 <= N && N <= 20) {
				System.out.println("Weird");
			} else if (N > 20) {
				System.out.println("Not Weird");
			}

		}

//		scanner.close();
	}

}