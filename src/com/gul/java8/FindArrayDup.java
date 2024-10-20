package com.gul.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindArrayDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 20, 30, 10, 11, 23, 45, 23, 76, 54, 30, 35, 76);

//		Set<Integer> items = new HashSet<>(list);
		List<Integer> list2 = list.stream().filter(i -> Collections.frequency(list, i) > 1).distinct()
				.toList();
		System.out.println(list2);

		Set<Integer> seen = new HashSet<>();
		List<Integer> duplicates = list.stream().filter(num -> !seen.add(num)).distinct()
				.collect(Collectors.toList());

		System.out.println("Duplicate numbers: " + duplicates);

		List<String> list4 = Arrays.asList("code", "code", "quiz", "code", "code", "quiz", "abc");

		// count the frequency of the word "code"
		System.out.println("The frequency of the word code is: " + Collections.frequency(list4, "abc"));

		List<String> list5 = Arrays.asList("apple", "banana", "cherry");
		List<String> upperCaseList = list5.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseList);

		List<String> upperCaseList2 = list5.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseList2);

		// Filter Even Numbers from List
		List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).toList();
		System.out.println(evenList);

//		Find the First Element in a Stream
		Optional<Integer> firstElement = list.stream().findFirst();
		System.out.println(firstElement.get());

//		Sum of All Elements in a List

		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

//		Sort a List of Integers

		List<Integer> sort = list.stream().sorted().toList();
		System.out.println(sort);

//		Convert List of Integers to a Single String
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		String str = numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(str);

//		Find Maximum Element in a List

		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println(max.get());
		max.ifPresent(System.out::print);

//		Group List of Strings by Length

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

		Map<Integer, List<String>> groupedByLength = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(groupedByLength);

//		Count Elements Matching a Condition
		List<String> words2 = Arrays.asList("apple", "banana", "avocado", "apricot");

		long count = words2.stream().filter(word -> word.startsWith("a")).count();
		System.out.println("Count: " + count);

//		        FlatMap Example with Lists of Lists

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		List<Integer> list444 = listOfLists.stream().flatMap(List::stream)
				.sorted(Collections.reverseOrder()).toList();

		System.out.println(list444);

//		 Remove Duplicates from a List using Stream API

		List<Integer> numbers3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

		List<Integer> list55 = numbers3.stream().distinct().toList();

		System.out.println(list55);

//		Convert List of Strings to Their Lengths
		List<String> words22 = Arrays.asList("apple", "banana", "cherry");
		List<Integer> lengths = words22.stream().map(String::length).toList();
		System.out.println(lengths);

//		Sort a List of Strings in Reverse Order

		List<String> words33 = Arrays.asList("apple", "banana", "cherry");
		List<String> lengths3 = words33.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println(lengths3);

		// another method
		List<String> lengths33 = words33.stream().sorted((a, b) -> b.compareTo(a)).toList();
		System.out.println(lengths33);

//		Find the Sum of Even Numbers

		List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum3 = numbers5.stream().filter(i -> i % 2 == 0).mapToInt(Integer::valueOf).sum();
		System.out.println(sum3);

//		 Find the Minimum Element in a List

		Optional<Integer> min = numbers5.stream().min(Integer::compareTo);
		System.out.println(min.get());

//		Partition a List into Odd and Even Numbers
		Map<Boolean, List<Integer>> numbers7 = numbers5.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even numbers" + numbers7.get(true));
		System.out.println("Odd numbers" + numbers7.get(false));

//		Create an Infinite Stream of Even Numbers

		Stream.iterate(0, n -> n + 2).limit(10) // Limit the infinite stream to 10 numbers
				.forEach(System.out::println);

//		Count Words Starting with a Specific Letter

		List<String> words5 = Arrays.asList("banana", "apple", "blueberry", "cherry", "blackberry");
		long count33 = words5.stream().filter(n -> n.startsWith("b")).count();
		System.out.println(count33);

		List<Integer> wordss5 = words5.stream().filter(n -> n.startsWith("b")).map(String::length).toList();
		System.out.println(wordss5);

//		Skip the First N Elements of a Stream
		List<Integer> numbers67 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> sk = numbers67.stream().skip(3).toList();
		System.out.println(sk);

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).limit(2)
				.forEach(i -> System.out.print(i + " "));

		Stream.iterate(0, i -> i + 1).filter(i -> i % 2 == 0).limit(10).forEach(System.out::println);

		List<Integer> numbe2rs = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> sss = numbe2rs.stream().skip(4).limit(1).toList();
		System.out.println(sss);

//		Find the Second Highest Number in a List
		List<Integer> numbe2rs3 = Arrays.asList(1, 2, 3, 4, 2, 5, 4, 5, 6);

		List<Integer> ssss = numbe2rs3.stream().distinct().sorted(Collections.reverseOrder()).skip(1)
				.limit(1).toList();
		System.out.println(ssss);

		Optional<Integer> ma = numbe2rs3.stream().distinct().sorted(Collections.reverseOrder()).skip(1)
				.findFirst();

//		Optional<Integer> ma = numbe2rs3.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
		System.out.println(ma.get());
//		0 1 1 2 3 5 8
		int n1 = 0, n2 = 1, n3 = 0;
		int nn = 0;
		while (nn <= 10) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			nn++;
			System.out.print(" " + n3);

		}

//		Generate Fibonacci Sequence Using Stream API

		Stream.iterate(new int[] { 0, 1 }, fib -> new int[] { fib[1], fib[0] + fib[1] }).limit(10)
				.map(fib -> fib[0]).forEach(System.out::println);

//		 Remove Duplicates from a List using Stream API
		List<Integer> numbers77 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List<Integer> li = numbers77.stream().distinct().toList();
		System.out.println(li);

//		 Remove Duplicates from a List using Stream API
		List<Integer> numbers778 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		Set<Integer> set = new HashSet<>();
//		List<Integer> li2 = numbers778.stream().filter(i -> !set.add(i)).toList();
//		System.out.println(li2);

		List<Integer> li2 = numbers778.stream().filter(i -> Collections.frequency(numbers778, i) > 1)
				.distinct().toList();
		System.out.println(li2);

//		Convert a List of Strings to a Set
		Set<Integer> li3 = numbers778.stream().collect(Collectors.toSet());
		System.out.println(li3);

//		Find the Average of a List of Numbers
		OptionalDouble li4 = numbers778.stream().mapToInt(Integer::valueOf).average();
		if (li4.isPresent()) {

			System.out.println(li4.getAsDouble());
		}

//		Find the Product of All Numbers in a List
		List<Integer> numbers78 = Arrays.asList(1, 2, 3, 4, 5);
		int li5 = numbers78.stream().reduce(1, (a, b) -> a * b);
		System.out.println(li5);

//		Find the Longest String in a List
		List<String> words6 = Arrays.asList("apple", "banana", "cherry", "blueberry");
		Optional<String> li44 = words6.stream()
				.max((word1, word2) -> Integer.compare(word1.length(), word2.length()));
		System.out.println(li44.get());

//		Convert a List of Strings to a Set
		List<String> words677 = Arrays.asList("apple", "banana", "apple", "cherry");
		Set<String> li454 = words677.stream().collect(Collectors.toSet());

		System.out.println(li454);

//		Find the Average of a List of Numbers
		List<Integer> numbers88 = Arrays.asList(1, 2, 3, 4, 5, 6);
		OptionalDouble av = numbers88.stream().mapToInt(Integer::valueOf).average();
		System.out.println(av.getAsDouble());

//		Remove Elements Matching a Condition
		List<String> words88 = Arrays.asList("apple", "banana", "avocado", "cherry");
		List<String> words8338 = words88.stream().filter(i -> !i.startsWith("a"))
				.collect(Collectors.toList());

		System.out.println(words8338);

//		Find the Product of All Numbers in a List
		Optional<Integer> ss = numbers88.stream().reduce((a, b) -> a * b);
		System.out.println(ss.get());

//  *		Count the Occurrences of Each Character in a String
		String input = "banana";
		Map<Character, Long> characterCount = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(characterCount);

//		 Convert a Map to a List of Key-Value Strings
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);

		List<String> sds = map.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue())
				.toList();
		System.out.println(sds);
	}

}
