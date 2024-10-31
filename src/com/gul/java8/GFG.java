package com.gul.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GFG {

	public static void main(String[] args) {

		// Creating an empty ArrayList of string type
		// By default, non - synchronized List
		List<String> sal = new ArrayList<String>();

		// Adding elements to above List
		// using add() method
		sal.add("Geeks");
		sal.add("for");
		sal.add("Geeks");
		sal.add("Computer");
		sal.add("Science");
		sal.add("Portal");

		// Printing the above non-synchronised List
		System.out.println(sal);

		// Synchronizing above List
		// using SynchronizedList() method
		Collections.synchronizedList(sal);

		// Synchronized block to
		// avoid non-deterministic behavior
		synchronized (sal) {

			// Using iterators to iterate over elements
			Iterator<String> itrobj = sal.iterator();

			// Holds true till there is single element remaining
			while (itrobj.hasNext()) {
				// Printing elements
				// using next() method
				System.out.println(itrobj.next());
			}
		}
	}

}
