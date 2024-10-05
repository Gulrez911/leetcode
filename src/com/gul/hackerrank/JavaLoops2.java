package com.gul.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		double aa = 30;
//		double bb = 2;
//		System.out.println((int) Math.pow(aa, bb));
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {

				int bb1 = 0;
				for (int k = 0; k <= j; k++) {

					bb1 += (int) Math.pow(2, k) * b;
				}
				System.out.print(a + bb1 + " ");

			}
			System.out.println();
		}

		in.close();
	}

}