package com.gul.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOprationsApi2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 54, 3, 2, 11, 23, 1, 221, 2, 3, 2, 4, 1, 5, 6, 5);

		List<Integer> list2 = list.stream().distinct().sorted().toList();
		System.out.println(list2);

		int[] array = { 4, 2, 7, 1, 5, 3, 6 };
		int k = array.length; // Find the 3rd smallest element
		int[] arr = Arrays.stream(array).sorted().toArray();

		System.out.println(Arrays.toString(arr));
//		int kthSmallest = Arrays.stream(array).sorted().skip(k - 1).findFirst().orElse(-1);

		int kthSmallest = Arrays.stream(array).sorted().skip(k - 2).findFirst().orElse(-1);

		System.out.println(kthSmallest);
		
		int arrr  =  Arrays.stream(array).sorted().skip(k - 2).findFirst().orElse(-1);

		System.out.println(arrr);
		
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
		String concatenatedNames = names.stream()
		                               .collect(Collectors.joining(", "));
		
		System.out.println(concatenatedNames);
	}

}
