package com.day5;

interface MyInterface4
{
	void myAbstractMethod1();
}
interface MyInterface5
{
	void myAbstractMethod2();
}

class MyNormalClass3 implements MyInterface4, MyInterface5
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
public class Interface2 
{
	public static void main(String[] args)
	{
		MyNormalClass3 obj = new MyNormalClass3();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();
	}
}
