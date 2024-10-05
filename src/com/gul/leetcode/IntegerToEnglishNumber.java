package com.gul.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishNumber {

	public static void main(String[] args) {

//		int num = 1234567;
//		int num = 1004567009;
//		int num = 90;
		int num = 909999;
		String word = numberToWords(num);
		System.out.println("Number in word is: " + word);
	}

	public static String numberToWords(int num) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		map.put(1, arrayList1);
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(2);
		map.put(2, arrayList2);
		ArrayList<Integer> arrayList3 = new ArrayList<>();
		arrayList3.add(1);
		arrayList3.add(2);
		map.put(3, arrayList3);

		ArrayList<Integer> arrayList4 = new ArrayList<>();
		arrayList4.add(1);
		arrayList4.add(1);
		arrayList4.add(2);
		map.put(4, arrayList4);

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(0, "Zero");
		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Three");
		map2.put(4, "Four");
		map2.put(5, "Five");
		map2.put(6, "Six");
		map2.put(7, "Seven");
		map2.put(8, "Eight");
		map2.put(9, "Nine");
		map2.put(10, "Ten");
		map2.put(11, "Eleven");
		map2.put(12, "Twelve");
		map2.put(13, "Thirteen");
		map2.put(14, "Fourteen");
		map2.put(15, "Fifteen");
		map2.put(16, "Sixteen");
		map2.put(17, "Seventeen");
		map2.put(18, "Eighteen");
		map2.put(19, "Nineteen");
		map2.put(20, "Twenty");
		map2.put(21, "Twenty One");
		map2.put(22, "Twenty Two");
		map2.put(23, "Twenty Three");
		map2.put(24, "Twenty Four");
		map2.put(25, "Twenty Five");
		map2.put(26, "Twenty Six");
		map2.put(27, "Twenty Seven");
		map2.put(28, "Twenty Eight");
		map2.put(29, "Twenty Nine");
		map2.put(30, "Thirty");
		map2.put(31, "Thirty One");
		map2.put(32, "Thirty Two");
		map2.put(33, "Thirty Three");
		map2.put(34, "Thirty Four");
		map2.put(35, "Thirty Five");
		map2.put(36, "Thirty Six");
		map2.put(37, "Thirty Seven");
		map2.put(38, "Thirty Eight");
		map2.put(39, "Thirty Nine");
		map2.put(40, "Forty");
		map2.put(41, "Forty One");
		map2.put(42, "Forty Two");
		map2.put(43, "Forty Three");
		map2.put(44, "Forty Four");
		map2.put(45, "Forty Five");
		map2.put(46, "Forty Six");
		map2.put(47, "Forty Seven");
		map2.put(48, "Forty Eight");
		map2.put(49, "Forty Nine");
		map2.put(50, "Fifty");
		map2.put(51, "Fifty One");
		map2.put(52, "Fifty Two");
		map2.put(53, "Fifty Three");
		map2.put(54, "Fifty Four");
		map2.put(55, "Fifty Five");
		map2.put(56, "Fifty Six");
		map2.put(57, "Fifty Seven");
		map2.put(58, "Fifty Eight");
		map2.put(59, "Fifty Nine");
		map2.put(60, "Sixty");
		map2.put(61, "Sixty One");
		map2.put(62, "Sixty Two");
		map2.put(63, "Sixty Three");
		map2.put(64, "Sixty Four");
		map2.put(65, "Sixty Five");
		map2.put(66, "Sixty Six");
		map2.put(67, "Sixty Seven");
		map2.put(68, "Sixty Eight");
		map2.put(69, "Sixty Nine");
		map2.put(70, "Seventy");
		map2.put(71, "Seventy One");
		map2.put(72, "Seventy Two");
		map2.put(73, "Seventy Three");
		map2.put(74, "Seventy Four");
		map2.put(75, "Seventy Five");
		map2.put(76, "Seventy Six");
		map2.put(77, "Seventy Seven");
		map2.put(78, "Seventy Eight");
		map2.put(79, "Seventy Nine");
		map2.put(80, "Eighty");
		map2.put(81, "Eighty One");
		map2.put(82, "Eighty Two");
		map2.put(83, "Eighty Three");
		map2.put(84, "Eighty Four");
		map2.put(85, "Eighty Five");
		map2.put(86, "Eighty Six");
		map2.put(87, "Eighty Seven");
		map2.put(88, "Eighty Eight");
		map2.put(89, "Eighty Nine");
		map2.put(90, "Ninety");
		map2.put(91, "Ninety One");
		map2.put(92, "Ninety Two");
		map2.put(93, "Ninety Three");
		map2.put(94, "Ninety Four");
		map2.put(95, "Ninety Five");
		map2.put(96, "Ninety Six");
		map2.put(97, "Ninety Seven");
		map2.put(98, "Ninety Eight");
		map2.put(99, "Ninety Nine");

		Map<Integer, String> zero = new HashMap<>();
		zero.put(1, "Hundred");
		zero.put(2, "Thousand");
		zero.put(3, "Million");
		zero.put(4, "Billion");

		zero.put(5, "Trillion");
		zero.put(6, "Quadrillion");
		zero.put(7, "Quintillion");
		zero.put(8, "Sextillion");
		zero.put(9, "Septillion");
		zero.put(10, "Octillion");
		zero.put(11, "Nonillion");
		zero.put(12, "Decillion");

		int rev = 0;

		int ss = num;
		int count = 0;
		int rev2 = 0;
		while (ss > 0) {
			ss /= 1000;
			count++;
		}
		int arr[] = new int[count];

		int i = count - 1;
		String word = "";
		while (num > 0) {
			int rem = num % 1000;
			rev = rev * 10 + rem;
			num /= 1000;
			arr[i] = rem;
			i--;
		}

		if (arr.length == 0) {
			return "Zero";
		}
		for (int j = 0; j < arr.length; j++) {

			int aa = arr[j];
			String s = String.valueOf(aa);
			int len = s.length();

			if (len == 1) {
				if (j == arr.length - 1) {
					if (aa != 0) {

						word += map2.get(aa);
					}

				} else {
					if (aa != 0) {
						word += map2.get(aa);
						word += " " + zero.get(count) + " ";
					}

				}

			}
			if (len == 2) {
				if (j == arr.length - 1) {
					word += map2.get(aa);
				} else {
					word += map2.get(aa);
					word += " " + zero.get(count) + " ";

				}

			}
			if (len == 3) {
//				int arr2[] = new int[3];
				int arr2[] = new int[3];
				int ii = 2;
				while (aa > 0) {
					int rem2 = aa % 10;
					rev2 = rev2 * 10 + rem2;
					aa /= 10;
					arr2[ii] = rem2;
					ii--;
				}

				if (j == arr.length - 1) {

					if (arr2[1] != 0) {
						word += map2.get(arr2[0]);
						word += " " + zero.get(1) + " ";
						String sss = String.valueOf(arr2[1]) + String.valueOf(arr2[2]);
						int bb = Integer.parseInt(sss);
						word += map2.get(bb);
					} else if (arr2[2] != 0) {
						word += map2.get(arr2[0]);
						word += " " + zero.get(1) + " ";
						String sss = String.valueOf(arr2[2]);
						int bb = Integer.parseInt(sss);
						word += map2.get(bb);
					} else {
						word += map2.get(arr2[0]);
						word += " " + zero.get(1);
					}

				} else {

					if (arr2[1] != 0) {

						word += map2.get((arr2[0]));
						word += " " + zero.get(1) + " ";

						String sss = String.valueOf(arr2[1]) + String.valueOf(arr2[2]);
						int bb = Integer.parseInt(sss);
						word += map2.get(bb);
						word += " " + zero.get(count) + " ";
					} else if (arr2[2] != 0) {
						word += map2.get((arr2[0]));
						word += " " + zero.get(1) + " ";

						String sss = String.valueOf(arr2[2]);
						int bb = Integer.parseInt(sss);
						word += map2.get(bb);
						word += " " + zero.get(count) + " ";
					} else {
						word += map2.get((arr2[0]));
						word += " " + zero.get(1) + " ";

						word += " " + zero.get(count) + " ";
					}

				}

			}

			count--;

		}
		word = word.replaceAll("\\s+", " ").trim();

		return word;
	}

}
