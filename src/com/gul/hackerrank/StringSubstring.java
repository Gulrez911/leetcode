package com.gul.hackerrank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringSubstring {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		        String s = scan.next();
		        int k = scan.nextInt();
		        scan.close();
		      
		        System.out.println(getSmallestAndLargest(s, k));

	}
	 public static String getSmallestAndLargest(String s, int k) {
		        String smallest = "";
		        String largest = "";
		        
		        // Complete the function
		        // 'smallest' must be the lexicographically smallest substring of length 'k'
		        // 'largest' must be the lexicographically largest substring of length 'k''
		        
		        SortedSet<String> sets = new TreeSet<String>();
		        // http://www.baeldung.com/java-tree-set
		        for (int i = 0; i <= s.length() - k; i++)
		        {
		            sets.add(s.substring(i, i+k));
		        }
		        
		        smallest = sets.first();
		        largest = sets.last();
		        
		        return smallest + "\n" + largest;
		    }
}
