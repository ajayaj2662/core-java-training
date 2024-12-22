package com.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Java8AdditionalPractice extends Employee {

	public Java8AdditionalPractice(int id, String name, int salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Problem-1
		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?
		List<Integer> list = Arrays.asList(10, 11, 12, 23, 16, 28, 19, 99);
		List<Integer> evenNumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber);
		System.out.println("-----------");

		// problem-2
		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> list1 = Arrays.asList(10, 11, 40, 16, 18, 20, 15);
		List<Integer> oneList = list1.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(oneList);
		System.out.println("-----------");

		// problem-3
		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3);
		List<Integer> duplicate = list3.stream().filter(x -> list3.indexOf(x) != list3.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicate);

		Set<Integer> duplicate2 = list3.stream().filter(x -> list3.indexOf(x) != list3.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println(duplicate2);
		System.out.println("-----------");

		// problem-4
		// 4. Given the list of integers, find the first element of the list using
		// Stream functions?
		List<Integer> list4 = Arrays.asList(2, 3, 4, 5, 6);
		int firstElement = list4.stream().findFirst().get();
		System.out.println(firstElement);
		System.out.println("-----------");

		// problem-5
		// 5. Given a list of integers, find the total number of elements present in the
		// list using Stream functions?
		long count = list4.stream().count();
		System.out.println(count);
		System.out.println("-----------");

		// problem-6
		// 6. Given a list of integers, find the maximum value element present in it
		// using Stream functions?
		int max = list4.stream().max((x, y) -> x - y).get();
		System.out.println(max);
		System.out.println("-----------");

		// problem-7
		// 7. Sort the Employee object using salary
		List<Employee> emplist = Arrays.asList(new Employee(101, "Ajay", 23000), new Employee(102, "Vijay", 25000),
				new Employee(102, "Deepak", 33000));

		List<Employee> sortlist = emplist.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println(sortlist);
		System.out.println("-------------");

		// problem-8
		// 8. Given a list of integers, sort all the values present in it using Stream
		// functions?
		List<Integer> sortList = list4.stream().sorted().collect(Collectors.toList());
		List<Integer> sortList1 = list4.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Ascending order" + sortList);
		System.out.println("Decending order" + sortList1);

		System.out.println("--------------");
		// problem-9
		// 9. Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?
		List<Integer> sortList2 = list4.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println("Decending in different order " + sortList2);

		// 10. Given an integer array nums, return true if any value appears at least
		// twice in the array, and return false if every element is distinct.
		Set<Integer> tempset = new HashSet<>();
		boolean b = list4.stream().filter(x -> tempset.add(x) == false).count() > 0 ? true : false;
		System.out.println(b);

		// 11. Java 8 program to find factorial of given list of integer values
		List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factList = list5.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());
		System.out.println(factList);
		System.out.println("-------------");

		// 12. Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?
		int arr[] = { 3, 5, 1, 2, 3 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("--------------");

		// 13. Convert a List of String into upper case using stream
		List<String> strList = Arrays.asList("Apple", "Orange", "Mango");
		List<String> upperCase = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		System.out.println("---------------");

		// 14. Convert a List of String into a Map key and it's length as Map Value
		// using Java 8 Stream
		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);

		// 15. flatMap
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);
		System.out.println("---------");

		// 16. Java 8 : Consumer

		List<String> string1 = Arrays.asList("Ajay", "Vijay");

		Consumer<String> consumer = str -> System.out.println(str);

		string1.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		};
		list.forEach(evenConsumer);
		System.out.println("------------");
		
		// 17. Java 8 : Predicate
		Predicate<String> predicate = str -> str.contains("p");
		strList.stream().filter(predicate).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);

		
		// 18. Java 8 : Function
		Function<String, Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else
				return "Odd";
		};
		list.stream().map(function1).forEach(System.out::println);

		// 19. Supplier
		Supplier<String[]> supplier = () -> new String[] { "one", "two", "three" };
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);
		
	}
}
