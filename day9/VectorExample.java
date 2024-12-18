package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<>(2,3);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		//Enumeration is used, its vector
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
