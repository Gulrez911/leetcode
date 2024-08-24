package com.gul.leetcode;

import java.util.LinkedHashMap;

public class PalindromeNumber {
	public static void main(String[] args) {

		int x = -121;

		boolean str = isPalindrome(x);
		System.out.println("result: " + str);

	}

	public static boolean isPalindrome(int x) {

//		String xx = Integer.toString(x);

		String y = "";
		for (int i = Integer.toString(x).length() - 1; i >= 0; i--) {
			y += Integer.toString(x).charAt(i);

		}
		if (y.equals(Integer.toString(x))) {
			return true;
		}
		return false;

	}

}
