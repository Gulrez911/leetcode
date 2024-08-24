package com.gul.math;

public class GreatestCommonDivisorOfTwoNumber {

	public static void main(String[] args) {

		int a = 45, b = 100;
		int result = 1;
		for (int i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		System.out.println("HCF of two number is: " + result);
	}

}
