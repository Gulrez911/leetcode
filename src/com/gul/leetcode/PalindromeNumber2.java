package com.gul.leetcode;

import java.util.LinkedHashMap;

public class PalindromeNumber2 {
	public static void main(String[] args) {

//		int x = -121;
		int x = 121;
//		int x = 124;
//		int x = 12421;

		boolean str = isPalindrome(x);
		System.out.println("result: " + str);
	}

	public static boolean isPalindrome(int x) {
//		int ss ;

		int num = 0;
		int check = x;
		while (x > 0) {
			int rem = x % 10;

			num = num * 10 + rem;
			x /= 10;
		}
		if (check == num) {
			return true;
		}
		return false;

	}

}
