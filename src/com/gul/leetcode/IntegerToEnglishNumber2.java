package com.gul.leetcode;

import java.util.HashMap;

public class IntegerToEnglishNumber2 {

	public static void main(String[] args) {
//		int num = 1234567;
//		int num = 1004567009;
//		int num = 90;
		int num = 909999;
		IntegerToEnglishNumber2 englishNumber2 = new IntegerToEnglishNumber2();
		String word = englishNumber2.numberToWords(num);
		System.out.println("Number in word is: " + word);
	}

	// public String[]
	// belowten={,"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	// public String[]
	// below20={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	public String[] below100 = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	public HashMap<Integer, String> h = new HashMap<>();

	public String numberToWords(int num) {
		h.put(0, "Zero");
		h.put(1, "One");
		h.put(2, "Two");
		h.put(3, "Three");
		h.put(4, "Four");
		h.put(5, "Five");
		h.put(6, "Six");
		h.put(7, "Seven");
		h.put(8, "Eight");
		h.put(9, "Nine");
		h.put(10, "Ten");
		h.put(11, "Eleven");
		h.put(12, "Twelve");
		h.put(13, "Thirteen");
		h.put(14, "Fourteen");
		h.put(15, "Fifteen");
		h.put(16, "Sixteen");
		h.put(17, "Seventeen");
		h.put(18, "Eighteen");
		h.put(19, "Nineteen");
		return helper(num);
	}

	String helper(int n) {
		if (n < 10) {
			return h.get(n);
		}
		if (n < 20) {
			return h.get(n);
		}
		if (n < 100) {
			return below100[n / 10] + (n % 10 != 0 ? " " + helper(n % 10) : "");
		}
		if (n < 1000) {
			return helper(n / 100) + " Hundred" + (n % 100 != 0 ? " " + helper(n % 100) : "");
		}
		if (n < 1000000) {
			return helper(n / 1000) + " Thousand" + (n % 1000 != 0 ? " " + helper(n % 1000) : "");
		}
		if (n < 1000000000) {
			return helper(n / 1000000) + " Million"
					+ (n % 1000000 != 0 ? " " + helper(n % 1000000) : "");
		}
		return helper(n / 1000000000) + " Billion"
				+ (n % 1000000000 != 0 ? " " + helper(n % 1000000000) : "");
	}
}
