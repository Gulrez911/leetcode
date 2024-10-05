package com.gul.leetcode;

public class AdditionTwoBinary {

	public static void main(String[] args) {
		String x = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String y = "110101011001011101111001100000011011110011";

//		String x = "101101";
//		String y = "10o1011";
		String ss = addBinary(x, y);
		System.out.println("ssssssssssss");
		System.out.println(ss);
	}

	public static String addBinary(String a, String b) {

		StringBuilder builder = new StringBuilder(a);
//		builder.reverse();
		long sum = 0;
		System.out.println(builder.length());
		for (int i = builder.length() - 1, k = 0; i >= 0; i--, k++) {
			long d = (long) Math.pow(2, k);
			char sss = builder.charAt(i);
			long aa = sss - '0';
			sum += aa * d;
		}

		StringBuilder builder2 = new StringBuilder(b);
		builder2.reverse();
		long sum2 = 0;
		for (int i = 0; i < builder2.length(); i++) {
			long d = (long) Math.pow(2, i);
			char sss = builder2.charAt(i);
			long aa = sss - '0';
			sum2 += aa * d;
		}

		long total = sum + sum2;
		if (total == 0) {
			return "0";
		}
		StringBuilder builder3 = new StringBuilder();
		while (total > 0) {
			long ss = total % 2;
			builder3.append(ss);
			total = total / 2;

		}
		System.out.println(builder3.reverse());

		return builder3.toString();

	}
}