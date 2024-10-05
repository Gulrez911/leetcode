package com.gul.hackerrank;

import java.util.Scanner;

public class JavaLoops3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		if (n <= 100 && n >= -100) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		String s = String.valueOf(n);
		if(n==Integer.parseInt(s)){
		    System.out.println("Good job");
		} 
		in.close();

	}
}
