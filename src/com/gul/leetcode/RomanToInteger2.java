package com.gul.leetcode;

import java.util.HashMap;

public class RomanToInteger2 {

	public static void main(String[] args) {

//		String s = "DD";
		String s = "MMMDCCXXIV";
		int ss = romanToInt(s);
		System.out.println(ss);
	}

	public static int romanToInt(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int i = 0;
		int len = s.length();
		while (i < len) {
			if (i < len - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
				i += 2;
				continue;
			}

			result += map.get(s.charAt(i));
			i++;
		}
		return result;
	}
}