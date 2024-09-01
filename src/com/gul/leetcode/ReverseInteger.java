package com.gul.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
//		int x = -121;
		int x = 1534236469;
//		int x = 123;

		int sss = reverse(x);
		System.out.println("result: " + sss);
	}

	public static int reverse(int x) {
//		System.out.println(9646324350);
//		System.out.println(Integer.MIN_VALUE);

		int flag = 1;
		if (x < 0) {
			x = x * (-1); // Multiplied by -1 to make it positive
			flag = 0; // Value updated to 0 for negative n
		}

		long dd = x;
		long ss = 0;
		while (dd > 0) {
			long temp = dd % 10;
			ss = ss * 10;
			int maxNumber = Integer.MAX_VALUE;
			if (maxNumber < (long) ss) {
				return 0;
			}
			ss = ss + temp;
			dd = dd / 10;
		}

		if (flag == 0) {
			ss = ss * (-1); // Multiplied by -1 to make it positive

		}

//		while (dd < 0) {
//			long temp = dd % 10;
//			ss = ss * 10;
//			int number1 = Integer.MIN_VALUE - 1;
//			if (Integer.MIN_VALUE > (long) ss) {
////				System.out.println("jjj");
//				return 0;
//			}
//			ss = ss + temp;
//			dd = dd / 10;
//		}

		return (int) ss;

	}
}
