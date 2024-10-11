package com.gul.geeksforgeeks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPanagram {

	public static void main(String[] args) {

		String s = "Bawds jog, flick quartz, vex nymph";
//		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
//		String s = "sdfs";

		s = s.toLowerCase().replaceAll("\\s+", "");

		char[] s1 = s.toCharArray();
		String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		s2 = s2.toLowerCase();
		char[] s22 = s2.toCharArray();
		int flag = 0;
		for (int i = 0; i < s22.length; i++) {
			for (int j = 0; j < s1.length; j++) {

				if (s1[j] == s22[i]) {
					flag = 1;
				}
			}
			if (flag != 1) {

				break;

			}
			if (i == s22.length - 1) {
				flag = 1;
			} else {
				flag = 0;
			}

		}

		System.out.println(flag);
//		if(flag!=1) {
//			 
//			return false;
//			System.out.println(false);
//		}else {
//			return true;
//			System.out.println(true);
//		}
//		
//		return true;
//		
	}

}
