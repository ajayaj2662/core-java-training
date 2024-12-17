package com.day8;

public class StringComparison2 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		s1 = s1.concat(" world");
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("malayalamajay");
		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
