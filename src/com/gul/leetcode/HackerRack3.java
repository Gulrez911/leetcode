package com.gul.leetcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HackerRack3 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.nextLine();

//			sc.nextLine();

			// Complete this line
			StringBuilder builder = new StringBuilder();
//			int ii = builder.length() - 15;
			String newStr="";
			for (int j = 0; j < s1.length(); j++) {
				builder.append(s1.charAt(j));

				if (s1.length() - 1 == j) {
					int rr = 15 - s1.length();
					if (rr > 0) {
						 newStr = String.format(builder.toString(),"%"+rr+"s");
//						builder.append(" ");
//						rr--;
					}
				}

			}

//			System.out.format("%-15s%03d%n", s1);
			System.out.print(newStr);
			String sss = "";
			int x = sc.nextInt();
			if (x <= 99 && 9 < x) {
				sss = "0" + String.valueOf(x);
			} else if (9 >= x) {
				sss = "00" + String.valueOf(x);
			} else {
				sss = String.valueOf(x);
			}

			System.out.print(sss);
			System.out.println();

			String s13 = sc.nextLine();

		}
		sc.close();
//		java           100
		System.out.println("================================");

	}

}