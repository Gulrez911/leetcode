package com.gul.leetcode;

import java.util.LinkedHashMap;

public class InegerToRoman2 {
	public static void main(String[] args) {

//		int num = 3749;
//		int num = 58;
		int num = 3;
//		int num = 449;

		String str = intToRoman(num);
		System.out.println("result: " + str);
	}

	public static String intToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				roman.append(romanNumerals[i]);
			}
		}
		return roman.toString();
	}

}
