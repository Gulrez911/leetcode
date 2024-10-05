package com.gul.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseVowelsTest {

	public static void main(String[] args) {

//		String s = "leetcode";
//		String s = "aA";
		String s = "A man, a plan, a canal: Panama";
		System.out.println(s.length());
//		OUTPUT = "a man, a plan, A canal: Panama"

		char[] charArray = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

//		char[] ch3 = s.toCharArray();
		int flag = 0;
//		System.out.println(ch3);
		Map<Integer, Character> myMap = new LinkedHashMap<>();
		Map<Integer, Character> myMap2 = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < charArray.length; j++) {
				if (s.charAt(i) == charArray[j]) {
					myMap.put(i, s.charAt(i));
					flag = 1;
				}

			}

			if (flag == 0) {
				myMap2.put(i, s.charAt(i));
				flag = 0;
			}
			flag = 0;
		}
		System.out.println(myMap);
		System.out.println(myMap2);
		String sss = "";
		for (Map.Entry<Integer, Character> entry : myMap.entrySet()) {
			sss += entry.getValue();
		}
		System.out.println(sss);

		String nstr = "";
		char ch;

		Map<Integer, Character> myNewHashMap = new LinkedHashMap<>();

		for (int i = 0; i < sss.length(); i++) {
			ch = sss.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);
		int count = 0;

		for (Map.Entry<Integer, Character> entry : myMap.entrySet()) {

			for (int i = 0; i < nstr.length(); i++) {
				if (count == i) {
					myNewHashMap.put(entry.getKey(), nstr.charAt(i));

					count++;
					break;
				}

			}
		}

		String newS = "";
		for (int i = 0; i < s.length(); i++) {

			if (myMap2.get(i) != null) {

				newS += myMap2.get(i);
			} else {
				newS += myNewHashMap.get(i);
			}

		}

//		return newS;
		System.out.println(myNewHashMap);
		System.out.println(myMap2);
		System.out.println(newS);
	}

}
