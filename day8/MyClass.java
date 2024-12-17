package com.day8;

public class MyClass {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		char ch[] = { 'j', 'a', 'v', 'a' };
		String s3 = new String(ch);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.concat("world"));
		System.out.println(s2);
		System.out.println(s2.equals("Java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("va"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(2));
	}
}
