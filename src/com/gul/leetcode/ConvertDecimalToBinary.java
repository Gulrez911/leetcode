package com.gul.leetcode;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {

		int xx = 190;
		StringBuilder builder = new StringBuilder();
		while (xx > 0) {
			int ss = xx % 2;
			builder.append(ss);
			xx = xx / 2;

		}
		System.out.println(builder.reverse());

	}

}