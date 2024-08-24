package com.gul.leetcode;

public class ReverseVowelsTest3 {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		
		 boolean[] vowels = new boolean[128];
		        for (char c : "aeiouAEIOU".toCharArray()) {
		            vowels[c] = true;
		        }
		        char[] cs = s.toCharArray();
		        int i = 0, j = cs.length - 1;
		        while (i < j) {
		            while (i < j && !vowels[cs[i]]) {
		                i++;
		            }
		            while (i < j && !vowels[cs[j]]) {
		                j--;
		            }
		            if (i < j) {
		                char t = cs[i];
		                cs[i] = cs[j];
		                cs[j] = t;
		                i++;
		                j--;
		            }
		        }
		        
//		        return String.valueOf(cs);
		        System.out.println(String.valueOf(cs));
	}

}
