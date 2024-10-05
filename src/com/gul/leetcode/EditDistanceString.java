package com.gul.leetcode;

public class EditDistanceString {

	public static void main(String[] args) {
		String x = "horse";
		String y = "ros";

		int ss = minDistance(x, y);
		System.out.println("ssssssssssss");
		System.out.println(ss);
	}

	public static int minDistance(String word1, String word2) {

		StringBuilder word11 = new StringBuilder(word1);
		StringBuilder word22 = new StringBuilder(word2);

//		char ch = 'A';
//		char ssss = Character.isLetter(ch);
//		int ii = word11.length() - 1;
//		int jj = word22.length() - 1;
//		int iiii = 0;
//		while (ii >= 0) {
//
//			ii--;
//		}

		int count = 0;
		int total = word11.length() + word22.length();
		int i = 0;
		while (total > i) {
			char aa = word11.charAt(i);
//			if (i == word22.length() - 1) {
//				word11.deleteCharAt(i);
//				count++;
//				break;
//			}

			char aa2 = word11.charAt(i + 1);
			char bb = word22.charAt(i);
			char bb2 = word22.charAt(i);

//			if (aa2 == bb) {
//
//				word11.deleteCharAt(i);
//				continue;
//			}
			if (aa2 == bb) {

				word11.deleteCharAt(i);
				count++;
				continue;
			}
			if (aa != bb) {

				word11.setCharAt(i, bb);
				count++;
//					break;
			}
			i++;
		}

		System.out.println("Count: " + count);
		System.out.println(word11);
		System.out.println(word22);
//		for (int i = 0; i < word11.length() + word22.length(); i++) {
//			for (int j = i; j < word22.length() +word11.length(); j++) {
//			char aa = word11.charAt(i);
//			char aa2 = word11.charAt(i + 1);
//			char bb = word22.charAt(i);
//			char bb2 = word22.charAt(i);
//
//			// remove character
//
//			if (aa2 == bb) {
//
//				word11.deleteCharAt(i);
//				continue;
//			}
//			if (aa != bb) {
//
//				word11.setCharAt(i, bb);
////					break;
//			}
//
//			
////			}
//		}

		return 3;
	}
}