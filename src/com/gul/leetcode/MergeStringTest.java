package com.gul.leetcode;

public class MergeStringTest {

	public static void main(String[] args) {

//		String word1 = "abc", word2 = "pqr";

		String word1 = "abcdef", word2 = "pqr";

//		String word1 = "abc", word2 = "pqrstv";

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		char[] ch1 = word1.toCharArray();
		char[] ch2 = word2.toCharArray();

		String merge = "";
		int flag2 = 0;
		int flag1 = 0;
		int flag = 0;

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (i == j) {

					merge += ch1[i];
					merge += ch2[j];

					int test = ch1.length - ch2.length;
					if (test > 0) {
						if (j == ch2.length - 1) {
							flag = 1;
							break;
						}
					}

				}

				if (flag2 == 1) {
					merge += ch2[j];
				}
				if (ch1.length == i + 1 && i == j) {

					flag2 = 1;

				}

			}
			if (flag == 1) {

				if (flag1 == 0) {
					flag1 = 1;

				} else {
					merge += ch1[i];
				}

			}

		}

//		return merge;

		System.out.println(merge);
	}

}
