package com.day9;

import java.util.Date;

public class WrapperExample 
{
	public static void main(String[] args)
	{
		int a =10;
		
		Integer obj = new Integer(a);
		int b = obj.intValue();
		System.out.println(b);
		
		
		Integer obj1 = 30;
		System.out.println(new Date());
		
	}
}
