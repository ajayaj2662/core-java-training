package com.day5;

//implements multiple implements
interface MyInterface2
{
	void myAbstractMethod1();
}

interface MyInterface3 extends MyInterface2
{
	void myAbstractMethod2();
}

class MyNormalClass2 implements MyInterface3
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

public class InterfaceExtends
{
	public static void main()
	{
		MyInterface3 obj = new MyNormalClass2();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();
	}
}
