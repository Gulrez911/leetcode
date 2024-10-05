package com.gul.leetcode;

import java.util.Scanner;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {

		String string = "This is my house.";
		StringBuilder builder = new StringBuilder(string);
		builder.reverse();
		System.out.println(builder.toString());

//		factorial number

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int fact = scanner.nextInt();
		int result = 1;
		for (int i = 1; i < fact+1; i++) {
			result = i * result;
		}
		System.out.println("Total: " + result);
	}

}
