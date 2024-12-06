package com.day1;
import java.util.Scanner;
public class UserInput 
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		//id,name,salary
		System.out.println("Enter ID ");
		int id = sc.nextInt();
		System.out.println("Enter name ");
		String s = sc.next();
		System.out.println("Enter salary ");
		int salary = sc.nextInt();
		
		System.out.println("The ID "+id);
		System.out.println("The name "+s);
		System.out.println("The salary "+salary);
		
	}
}
