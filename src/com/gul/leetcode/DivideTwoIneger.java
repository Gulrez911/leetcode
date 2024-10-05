package com.gul.leetcode;

public class DivideTwoIneger {

	public static void main(String[] args) {
		int x = -2147483648;
		int y = -1;
		int ss = divide(x, y);
		System.out.println(ss);
	}

	public static int divide(int dividend, int divisor) {

		int flag = 0;
		int flag2 = 0;
		Long dividendLong = Long.valueOf(dividend);
		Long divisorLong = Long.valueOf(divisor);
		if (dividendLong < 0) {
			dividendLong = dividendLong * -1;
			flag = 1;
		}
		if (divisorLong < 0) {
			divisorLong = divisorLong * -1;
			flag2 = 1;
		}
		Long ss = dividendLong / divisorLong;
		if (flag == 1 && flag2 == 1) {
			if (ss > Integer.MAX_VALUE) {

				return Integer.MAX_VALUE;
			} else {
				return ss.intValue();
			}
//			System.out.println(ss2);
		}
		if (flag == 1 || flag2 == 1) {
			ss = ss * -1;
			return ss.intValue();
		}

		return ss.intValue();
	}
}