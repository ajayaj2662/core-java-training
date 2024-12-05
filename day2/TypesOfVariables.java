package com.day2;


class teacher
{
	int abc=10;
}
public class TypesOfVariables 
{	
		int a = 10;// instance variables
		static int c = 5000;
		public static void main(String[] args)
		{
				int b = 20;//local variable
				TypesOfVariables obj = new TypesOfVariables();
				System.out.println(obj.a);
				System.out.println(b);
				System.out.println(TypesOfVariables.c);
				
				teacher obj2 = new teacher();
				System.out.println(obj2.abc);
		}
}
