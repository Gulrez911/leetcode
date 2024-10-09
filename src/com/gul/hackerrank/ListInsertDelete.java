package com.gul.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListInsertDelete {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			list.add(scanner.nextInt());
		}

		int Q = scanner.nextInt();
		// System.out.println("Queries: " + Integer.toString(Q));

		for (int i = 0; i < Q; i++) {

			String operation = scanner.next();
			// System.out.println("Current operation is: " + operation);

			if (operation.equals("Insert")) {
				int index = scanner.nextInt();
				int value = scanner.nextInt();
				// System.out.println("Inserting element: " + Integer.toString(value) + " into
				// index: " + Integer.toString(index));
				list.add(index, value);
			}

			if (operation.equals("Delete")) {
				int index = scanner.nextInt();
				// System.out.println("Inserting element: " + Integer.toString(value) + " into
				// index: " + Integer.toString(index));
				list.remove(index);
			}
		}
		for (int element : list)

		{
			System.out.print(element + " ");
		}
	}

}
