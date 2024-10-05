package com.gul.hackerrank;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class JavaCurrencyFormatter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();

		// Write your code here.

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + us.format(payment));
		System.out.println("India: " + in.format(payment));
		System.out.println("China: " + china.format(payment));
		System.out.println("France: " + france.format(payment));

		scanner.close();
	}
}
