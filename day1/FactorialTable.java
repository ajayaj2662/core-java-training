package com.day1;
import java.util.Scanner;
public class FactorialTable {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number:");
			int number = sc.nextInt();
			int fact = 1;
			System.out.println("No    Factorial");
			for( int i = 1; i <=number ; i++) 
			{
			fact = fact * i;
			System.out.println(i+"      "+fact);	
			}
			
		}
}
