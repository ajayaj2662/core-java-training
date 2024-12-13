package com.day5;

interface One
{
	int a = 10; //public static final
}
interface Two
{
	int b = 20; //public static final   // here in interfaces also ambiguous issue will be happened during inheritance 
	                                    // here the variable are static so the issue is solved
} // Multiple inheritance is possible in interfaces
interface Three extends One,Two
{
	void sum();
}
class NormalClass implements Three
{
	public void sum()
	{
		System.out.println("The sum value is "+ (a+b));
	}
}
public class MultipleInheritance 
{
	public static void main(String[] args)
	{
		Three obj = new NormalClass();
		obj.sum();
	}
}
