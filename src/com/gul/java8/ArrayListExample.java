package com.gul.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] arr = { 2, 12, 54, 67, 2, 1, 4, 67 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				int temp1 = arr[i];
				int temp2 = arr[j];

				if (temp1 > temp2) {
					arr[i] = temp2;
					arr[j] = temp1;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {

//			System.out.print(arr[i] + " ");
		}

		String s = "Gulrez";

		char[] temp = s.toCharArray();
		int n = temp.length;
		for (int i = 0; i < n / 2; i++) {

			char tt = temp[i];
			temp[i] = temp[n - 1 - i];

			temp[n - 1 - i] = tt;
		}

		System.out.println(temp);

		List<Integer> list22 = Arrays.asList(2, 4, 6, 22, 67, 12, 33);

		List<Integer> sss = list22.stream().sorted().toList();

//		System.out.println(sss);

		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		List<String> ss = list.stream().sorted(Collections.reverseOrder()).toList();
//		System.out.println(ss);

		List<Integer> list222 = Arrays.asList(2, 4, 6, 22, 67, 12, 33, 67, 4, 2, 12, 2);

		Set<Integer> set1 = new HashSet<>(list222);
		System.out.println(set1);
		List<Integer> li = new ArrayList<>();
		for (Integer ssss : set1) {
			li.add(ssss);

		}

		li = li.stream().sorted().toList();

//		Collections.sort(li2);
		System.out.println(li);
		int re = 0;
		for (int i = 0; i < li.size(); i++) {

			if (i == li.size() - 2) {
				re = li.get(i);
			}
		}

		System.out.println(re);

//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
//		System.out.println(sb);

	}

}
