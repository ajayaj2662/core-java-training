package com.day6;

public class ExceptionBasic
{
	//Exception basics
	int a = 10;
	public static void main(String[] args)
	{
		System.out.println("Before Exception");
		
		//int a=10/0;							//arithmetic exception
		//int a[] = {10,20,30};
		//System.out.println(a[3]);			//Array index out of bound
		//int a[] = new int[-5];				//Negative array size exception
		
		int a = Integer.parseInt("ab");       //Number format exception
		//ExceptionBasic obj = null;             //Null pointer exception
		//System.out.println(obj.a);
		System.out.println(a);
		System.out.println("After Exception");
	}
}
