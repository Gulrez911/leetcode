package com.gul.java8;

public class Demo {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
