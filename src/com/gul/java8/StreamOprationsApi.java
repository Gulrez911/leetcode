package com.gul.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOprationsApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = employeesList();

		Stream<Employee> stream = list.stream();

		List<String> list2 = stream.map(emp -> emp.getName()).toList();
		System.out.println(list2);

		List<Integer> ageList = list.stream().filter(em -> em.getAge() > 30).map(emp -> emp.getAge())
				.sorted().toList();
		System.out.println(ageList);

		long count = list.stream().filter(m -> m.getSalary() > 30000).count();
		System.out.println(count);

		long count2 = list.stream().count();
		System.out.println(count2);

		List<String> List4 = list.stream().map(m -> m.getGender()).distinct().sorted().toList();
		System.out.println(List4);

		List<Integer> numbers = Arrays.asList(1, 2, 3);

//		List<Integer> integers = numbers.stream().map(n -> n * n).toList();
		List<Integer> integers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

		System.out.println(integers);

		boolean b = list.stream().anyMatch(e -> e.getAge() > 30);
		System.out.println(b);

		boolean bb = list.stream().allMatch(e -> e.getAge() > 30);
		System.out.println(bb);

		boolean bbb = list.stream().noneMatch(e -> e.getAge() > 30);
		System.out.println(bbb);

//		Employee emp = list.stream().findAny().get();
//		System.out.println(emp);

//		List<Employee> sortedEmpObjects = list.stream().sorted((e1, e2) -> {
//			return e1.getId() - e2.getId();
//		}).toList();
//
//		System.out.println(sortedEmpObjects);

		List<Employee> sortedEmpObjects2 = list.stream().sorted((e1, e2) -> {
			String s1 = e1.getName().toLowerCase();
			String s2 = e2.getName().toLowerCase();
			return s1.compareTo(s2);
		}).toList();

		System.out.println(sortedEmpObjects2);

		list.stream().sorted((e1, e2) -> {
			String s1 = e1.getName().toLowerCase();
			String s2 = e2.getName().toLowerCase();
			return s1.compareTo(s2);
		}).toList();

	}

	public static List<Employee> employeesList() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(6, "Six", 43, "Male", "Security", 2016, 9500.0, "Pune"));
		employeeList.add(new Employee(7, "Seven", 35, "Male", "Finance", 2010, 27000.0, "Pune"));
		employeeList.add(new Employee(3, "Three", 29, "Male", "Infrastructure", 2012, 18000.0,
				"Hyderabad"));
		employeeList.add(new Employee(8, "Eight", 31, "Male", "Development", 2015, 34500.0, "Pune"));
		employeeList.add(new Employee(9, "Nine", 24, "Female", "Sales", 2016, 11500.0, "Hyderabad"));
		employeeList.add(new Employee(10, "Ten", 25, "Female", "Sales", 2009, 22500.0, "Pune"));
		employeeList.add(new Employee(2, "Two", 25, "Male", "Sales", 2015, 13500.0, "Hyderabad"));
		employeeList.add(new Employee(4, "Four", 28, "Female", "Development", 2014, 32500.0, "Pune"));
		employeeList.add(new Employee(5, "Five", 27, "Female", "HR", 2013, 22700.0, "Pune"));
		employeeList.add(new Employee(1, "One", 32, "Female", "HR", 2011, 25000.0, "Hyderabad"));

		return employeeList;
	}
}
