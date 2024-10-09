package com.gul.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class StaticBlocks {

	static Scanner input = new Scanner(System.in);
	static boolean flag = true;
	static int B;

	static int H;

	static {
		B = input.nextInt();
		H = input.nextInt();

	}

	public static void main(String[] args) {

		int a = B * H;
		if (B > 0 || H > 0) {
			if (a > 0) {

				System.out.println(a);
			}else {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
//		    System.out.println(a);

	}

	private static boolean test(boolean c) {
		// TODO Auto-generated method stub
		return c;
	}
}
