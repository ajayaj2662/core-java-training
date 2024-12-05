package com.day2;

class Hello
{
	static int xyz=250;
	int a=76;
}

public class InstanceVsStatic 
{
	int x=100;
	public static void main(String[] args)
	{	
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
		obj1.x=200;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
		System.out.println(Hello.xyz);
		
	}
} 
