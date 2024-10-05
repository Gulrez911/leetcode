package com.gul.hackerrank;

public class PalindromeString {
	public static void main(String[] args) {

		String A = "madam";
//		String A = "gulrez";
//		StringBuffer buffer = new StringBuffer(A);
//		buffer.reverse();
//		System.out.println(buffer.toString());
//		if (A.equals(buffer.toString())) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		String temp = "";
		char c1;
		for (int i = 0; i < A.length(); i++) {
			c1 = A.charAt(i);
			temp = c1 + temp;

		}
		System.out.println(temp);

	}
}
