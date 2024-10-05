package com.gul.leetcode;

public class DivideTwoIneger2 {

	public static void main(String[] args) {
		int x = -2147483648;
		int y = -1;
		int ss = divide(x, y);
		System.out.println(ss);
	}

	public static int divide(int dividend, int divisor) {

		  if(dividend == Integer.MIN_VALUE && divisor==-1)
		             return Integer.MAX_VALUE;

		        int k=dividend/divisor;
		        return k;
	}
}