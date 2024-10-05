package com.gul.leetcode;

import java.util.Scanner;

public class HackerRack2 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		// Write your code here.

		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}

}