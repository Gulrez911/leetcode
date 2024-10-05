package com.gul.leetcode;

public class ValidPalindromSentence {
	public static void main(String[] args) {
//		String s = "A man, a plan, a canal: Panama";
//		String s = "race a car";
		
		String s = "0P";
//		raceacar
//		raceacar

//		racaecar
		boolean check = isPalindrome(s);
		System.out.println("1: " + check);

	}

	public static boolean isPalindrome(String s) {

		 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder builder = new StringBuilder(s);

		StringBuilder sb1 = new StringBuilder("");
		for (int i = builder.length() - 1; i >= 0; i--) {
			sb1.append(builder.charAt(i));
		}

 		// check validation
		if (sb1.toString().equals(s)) {
 			return true;
		}

	 
		return false;
	}
//	raceacar

//	for (int i = 0; i < builder.length() / 2; i++) {
//	int front = i;
//	int back = builder.length() - 1 - i;
//
//	char charFront = builder.charAt(front);
//	char charBack = builder.charAt(back);
//	
//	builder.setCharAt(front, charBack);
//	builder.setCharAt(front, charFront);
//
//}
}
