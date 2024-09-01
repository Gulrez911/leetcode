package com.gul.math;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5, factorial = 1;
		int total = 1;
		while (factorial <= num) {
			total = total * factorial;
			factorial++;
		}
		System.out.println(total);
	}

}