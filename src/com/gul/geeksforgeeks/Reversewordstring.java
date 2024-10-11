package com.gul.geeksforgeeks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversewordstring {

	public static void main(String[] args) {
		String ss = "i.like.this.program.very.much";

//		much.very.program.this.like.i
		String[] ch = ss.split("\\.");
//		char[] ch = ss.toCharArray();

		List<String> list = new ArrayList<>();

		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
		}

		Collections.reverse(list);
		;

		System.out.println(list);

		String s = "";
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				s += list.get(i);
			} else {
				s += list.get(i) + ".";
			}

		}
		System.out.println(s);
		String se = "8955795758";

		long n = Long.parseLong(se);

		if (n % 7 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
