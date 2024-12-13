package com.day5;

abstract class AbstractClass
{
	abstract void myAbstractMethod();
	abstract void MyAbstractMethod2();
	void normalMethod()
	{
		System.out.println("Normal Method / concrete method");
	}
}

class MyNormalClass extends AbstractClass
{
		void myAbstractMethod()
		{
			System.out.println("Abstract method 1");
		}
		
		void MyAbstractMethod2()
		{
			System.out.println("Abstract method 2");
		}
}
public class Abstraction
{
	public static void main(String[] args)
	{
		//AbstractClass obj = new 
		//we cannot create object for abstract class because abstract class is incomplete class
		
		AbstractClass obj = new MyNormalClass();
		obj.myAbstractMethod();
		obj.MyAbstractMethod2();
		obj.normalMethod();
	}
}
