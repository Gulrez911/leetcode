package com.gul.math;

public class MaximumofThreeNumbers {

	public static void main(String[] args) {

		int num1 = 10, num2 = 2, num3 = 15, max;
//		max = (num1<num2)?(num1<num3)?     num2:num3;

		max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("num1: " + num1 + "  num2: " + num2 + "  num3: " + num3 + " max= " + max);
	}

}
