package com.gul.leetcode;

public class MergeStringTest2 {

	public static void main(String[] args) {

//		  public String mergeAlternately(String word1, String word2) {

//		String word1 = "abc", word2 = "pqr";

		String word1 = "abcdef", word2 = "pqr";

//		String word1 = "abc", word2 = "pqrstv";

		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length() && j >= word2.length()) {
				sb.append(word1.charAt(i));
				i++;
			} else if (i >= word1.length() && j < word2.length()) {
				sb.append(word2.charAt(j));
				j++;
			} else {
				sb.append(word1.charAt(i));
				sb.append(word2.charAt(j));
				i++;
				j++;
			}
		}
		System.out.println(sb);
//			        return sb.toString();
//			    }
	}

}
