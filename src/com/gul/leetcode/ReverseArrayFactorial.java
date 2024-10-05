package com.gul.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReverseArrayFactorial {

	public static void main(String[] args) {

		ReverseArrayFactorial f = new ReverseArrayFactorial();

		System.out.println("Factorial of 3 is " + fact(3));
		System.out.println("Factorial of 4 is " + fact(4));
		System.out.println("Factorial of 5 is " + fact(5));

	}

//3
//1*2*3
	static int fact(int i) {

		int result;
		if (i == 1) {
			return 1;
		}

		result = fact(i - 1) * i;

		return result;

	}

}
