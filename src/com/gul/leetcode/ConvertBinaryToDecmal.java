package com.gul.leetcode;

public class ConvertBinaryToDecmal {
	public static void main(String[] args) {
		String r = "10101";
		StringBuilder builder = new StringBuilder(r);
		builder.reverse();
		System.out.println(builder.length());
		int sum = 0;
		for (int i = 0; i < builder.length(); i++) {
			int d = (int) Math.pow(2, i);
			char sss = builder.charAt(i);
			int a = sss - '0';
			sum += a * d;
		}
	}
}
