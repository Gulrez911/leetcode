package com.gul.leetcode;

public class ReverseInteger2 {

	public static void main(String[] args) {
//		int x = -121;
		int x = 1534236469;
//		int x = 123;

		int sss = reverse(x);
		System.out.println("result: " + sss);
	}

	public static int reverse(int x) {
		double n = 0.0;
		while (x != 0) {
			n = n * 10 + x % 10;
			x /= 10;
			if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
				return 0;

		}
		return (int) n;
	}
}
