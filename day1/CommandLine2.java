package com.day1;

public class CommandLine2 
{
		public static void main(String[] args)
		{
			int sum=0,a=0,b=0;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			sum = a+b;
			System.out.println(sum);
		}
}
