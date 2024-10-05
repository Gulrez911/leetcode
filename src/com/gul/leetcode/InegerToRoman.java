package com.gul.leetcode;

import java.util.LinkedHashMap;

public class InegerToRoman {
	public static void main(String[] args) {

//		int num = 3749;
//		int num = 58;
		int num = 3;
//		int num = 449;

		String str = intToRoman(num);
		System.out.println("result: " + str);
	}

	public static String intToRoman(int num) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");

		int list[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000, 3999 };

		int base = 10;
		String sss = "";
		String sssj;
		String number = String.valueOf(num);
		int le = number.length() - 1;
		for (int k = 0; k < number.length(); k++) {
			int y = Character.digit(number.charAt(k), 10);
			System.out.println("digit: " + y);

			int exponent = le;

			if (k + 1 != number.length()) {

				y = (int) Math.pow(base, exponent) * y;
			}
			System.out.println("digit: power: " + y);

			for (int i = 0; i < list.length - 1; i++) {

				sssj = map.get(y);

				if (y == 1000) {
					sss += map.get(1000);
					break;
				} else if (y == 2000) {
					sss += map.get(1000) + map.get(1000);
					break;
				} else if (y == 3000) {
					sss += map.get(1000) + map.get(1000) + map.get(1000);
					break;
				}

				if (list[i] <= y && y < list[i + 1]) {
					if (sssj == null) {
//						y = list[i] + list[i - 2] + list[i - 2];

						if (list[i] + list[i] == y) {
							sss += map.get(list[i]) + map.get(list[i]);
							break;
						}
						if (list[i] + list[i] + list[i] == y) {
							sss += map.get(list[i]) + map.get(list[i])
									+ map.get(list[i]);
							break;
						}

						if (list[i] + list[i - 2] == y) {
							sss += map.get(list[i]) + map.get(list[i - 2]);
							break;
						}
						if (list[i] + list[i - 2] + list[i - 2] == y) {
							sss += map.get(list[i]) + map.get(list[i - 2])
									+ map.get(list[i - 2]);
							break;
						}
						if (list[i] + list[i - 2] + list[i - 2] + list[i - 2] == y) {
							sss += map.get(list[i]) + map.get(list[i - 2])
									+ map.get(list[i - 2])
									+ map.get(list[i - 2]);
							break;
						}

					} else {
						sss += map.get(y);
						break;
					}
					System.out.println(sss);
				}
			}

			le--;
		}

		return sss;

	}

}
