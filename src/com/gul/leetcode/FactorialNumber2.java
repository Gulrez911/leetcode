package com.gul.leetcode;

public class FactorialNumber2 {

	public static void main(String[] args) {
//		int num = 5, factorial = 1;
//		int total = 1;
//		while (factorial <= num) {
//			total = total * factorial;
//			factorial++;
//		}
//		System.out.println(total);

//		int num = 10, factorial = 1;
//		int total = 1;
//		while (factorial < num) {
//
//			total += factorial * total;
//			factorial++;
//		}

		int n = 6;
		int total = 0;
		for (int i = 5; n / i >= 1; i *= 5)
			total += n / i;

		System.out.println(total);

	}

}