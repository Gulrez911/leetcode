package com.gul.leetcode;

public class ReverseWordsTest {

	public static void main(String[] args) {

//		Input: s = "the sky is blue"
//				Output: "blue is sky the"

//		String s = "hello";
//		char[] charArray = { 'a', 'e', 'i', 'o', 'u' };

//		System.out.println(s);
//		String s = "   the sky is blue       ";
		String s = "a good   example";
		s = s.trim();

//		String[] arrOfStr = s.split(" ");
		String[] arrOfStr = s.split("\\s+");
		String newSs = "";
		for (int i = 0; i < arrOfStr.length; i++) {

			if (newSs != "") {
				newSs = arrOfStr[i] + " " + newSs;
			} else {
				newSs = arrOfStr[i] + newSs;
			}

		}
//		return newSs;
//		newSs = newSs.replaceAll("\\s+", " ");

//		return newSs;
		System.out.println(newSs);

	}

}
