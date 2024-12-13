package com.day5;
//abstract interface MyInterface     By default interface itself public
interface MyInterface
{
	void myAbstractMethod1();
	void myAbstractMethod2();
}
class MyNormalClass1 implements MyInterface
{
	public void myAbstractMethod1()
	{
		System.out.println("Abstract method 1");
	}
	public void myAbstractMethod2()
	{
		System.out.println("Abstract method 2");
	}
}
public class Interface 
{
	public static void main(String[] args)
	{
		MyInterface obj = new MyNormalClass1();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();
	}
	
}
