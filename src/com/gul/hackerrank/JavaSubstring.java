package com.gul.hackerrank;

import java.util.Scanner;

public class JavaSubstring {
	public static void main(String[] args) {

		String sss = "Hello World";
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		sss = sss.substring(1, 6);
		System.out.println(sss);
	}

}
