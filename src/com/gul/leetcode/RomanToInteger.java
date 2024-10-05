package com.gul.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

//		String s = "MMMDCCXXIV";
		String s = "DD";
		System.out.println("Sorted array: ");
		int ss = romanToInt(s);
		System.out.println(ss);
//		Input: s = "III"
//		Output: 3
//				
//		Input: s = "LVIII"
//		Output: 58
//		Explanation: L = 50, V= 5, III = 3.
//				
//		Input: s = "MCMXCIV"
//		Output: 1994
//		Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

	}

	// An optimized version of Bubble Sort
	static public int romanToInt(String s) {

//		HashMap<Integer, String> map = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();

		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int num = 0;
		char ss2;
		String part;
//		int num2 = 0;
		int l = s.length();
		for (int i = 0; i < s.length(); i++) {
			char ss = s.charAt(i);
			System.out.println(ss);

			if (ss == 'M') {
				num += map.get("M");
				System.out.println("true: " + num);
			}
			if (ss == 'D') {
				if (s.contains("M")) {
					num += map.get("D");
					System.out.println("true: " + num);
				} else {
					num += map.get("D");
					System.out.println("true: " + num);
				}

			}
			if (ss == 'C') {
				part = s.substring(i, s.length());
				if (i < s.length() && (part.contains("D") || part.contains("M"))) {
					ss2 = s.charAt(i + 1);
					if (ss2 == 'D') {
						num += map.get("D") - 100;
						System.out.println("true: " + num);
						i++;
					} else if (ss2 == 'M') {

						num += map.get("M") - 100;
						System.out.println("true: " + num);
						i++;
					}

				} else {
					num += map.get("C");
					System.out.println("true: " + num);
				}

			}
			if (ss == 'L') {
				num += map.get("L");
				System.out.println("true: " + num);
			}
			if (ss == 'X') {
				part = s.substring(i, s.length());
				if (i < s.length() && (part.contains("L") || part.contains("C"))) {
					ss2 = s.charAt(i + 1);
					if (ss2 == 'L') {
						num += map.get("L") - 10;
						System.out.println("true: " + num);
						i++;
					} else if (ss2 == 'C') {

						num += map.get("C") - 10;
						System.out.println("true: " + num);
						i++;
					}

				} else {
					num += map.get("X");
					System.out.println("true: " + num);
				}

			}
			if (ss == 'V') {
				num += map.get("V");
				System.out.println("true: " + num);
			}
			if (ss == 'I') {
				part = s.substring(i, s.length());
				if (i < s.length() && (part.contains("X") || part.contains("V"))) {
					ss2 = s.charAt(i + 1);
					if (ss2 == 'X') {
						num += map.get("X") - 1;
						System.out.println("true: " + num);
						i++;
					} else if (ss2 == 'V') {

						num += map.get("V") - 1;
						System.out.println("true: " + num);
						i++;
					}

				} else {
					num += map.get("I");
					System.out.println("true: " + num);
				}

			}

		}
		return num;
//		Input: s = "MMMDCCXXIV"

	}

}
