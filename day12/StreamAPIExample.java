package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(100,12,13,14,15);
		
		//For each
		list.stream().filter(x -> x % 2 ==0).forEach(System.out::println);
		
		//using count
		long count = list.stream().filter(x -> x % 2 ==0).count();
		System.out.println(count);
		
		//using collect
		List<Integer> evenNumber = list.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumber);
		
		//after filter adding one more function
		List<Integer> evenNumber2 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(evenNumber2);
		
		//to sort in a manner
		List<Integer> evenNumber3 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)  	
				.sorted()   //using to sort in arranging order
				.collect(Collectors.toList());
		System.out.println(evenNumber3);
	}
}