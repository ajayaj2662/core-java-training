package com.day6;

public class ThrowKeyWord 
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException("Can Not Found");
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
