package com.gul.leetcode;

public class AdditionTwoBinary2 {

	public static void main(String[] args) {
		String x = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String y = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

//		String x = "101101";
//		String y = "10o1011";
		String ss = addBinary(x, y);
		System.out.println("ssssssssssss");
		System.out.println(ss);
	}

	public static String addBinary(String a, String b) {// initialize the ith index
		int i = a.length() - 1;
		// initialize the jth index
		int j = b.length() - 1;
		// initialize the carry
		int carry = 0;
		// initialize the sum
		int sum = 0;
		StringBuilder result = new StringBuilder();
		while (i >= 0 || j >= 0 || carry == 1) {
			sum = carry;
			if (i >= 0)
				sum = sum + a.charAt(i) - '0';
			if (j >= 0)
				sum = sum + b.charAt(j) - '0';
			result.append((char) (sum % 2 + '0'));
			carry = sum / 2;
			i--;
			j--;
		}
		return result.reverse().toString();
	}
}