package com.day8;

public class StringComparison 
{
	public static void main(String[] args)
	{
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
		System.out.println(s2.hashCode());
		 
		String s3 = new String("Python");
		String s4 = "Python";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}
