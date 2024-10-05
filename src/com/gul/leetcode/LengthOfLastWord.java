package com.gul.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
//		String s = "   fly me   to   the moon  ";
//		String s = "luffy is still joyboy";
		System.out.println("Sorted array: ");
		int length = lengthOfLastWord(s);
		System.out.println("length of last word: " + length);
	}

	// An optimized version of Bubble Sort
	public static int lengthOfLastWord(String s) {
		String ss = "";
		s = s.trim().replaceAll("\\s+", " ");
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				ss = arr[i];
				System.out.println(ss.length());
				return ss.length();
			}
		}
		System.out.println(arr);
		return ss.length();
	}

}
