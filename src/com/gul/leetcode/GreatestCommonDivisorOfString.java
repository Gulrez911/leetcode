package com.gul.leetcode;

public class GreatestCommonDivisorOfString {

	public static void main(String[] args) {
//		String str1 = "ABCABC";
//		String str2 = "ABC";

		String str1 = "ABABAB";
		String str2 = "ABAB";

//		String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
//		String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
//		str1 + str2 == str2 + str1) ? str1.substr(0, gcd(size(str1),size(str2))): ""
		String output = gcdOfStrings(str1, str2);
		System.out.println(output);
	}

	public static String gcdOfStrings(String str1, String str2) {

		if ((str1 + str2).equals(str2 + str1)) {
			int l1 = str1.length();
			int l2 = str2.length();
			int gcd = GCD(l1, l2);
			if (str1.length() > 0) {
				return str1.substring(0, gcd);
			} else {
				return str2.substring(0, gcd);
			}
		} else {
			return "";
		}

	}

	static int GCD(int x, int y) {
		// Everything is divisible by 0
		if (x == 0)
			return y;
		if (y == 0)
			return x;

		// Both the numbers are equal
		if (x == y)
			return x;

		// x is greater
		if (x > y)
			return GCD(x - y, y);
		return GCD(x, y - x);
	}
}
