package com.day8;

public class StringMethods {
	public static void main(String[] args) {
		String s = "java";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}

		String s2 = "Hello to the new world";
		String temp[] = s2.split(" ");
		for (String a : temp) {
			System.out.println(a);
		}
	}
}
