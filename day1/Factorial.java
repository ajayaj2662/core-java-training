package com.day1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the factorial number");
			int n = sc.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact = fact *i;
			}
			System.out.println("factorial number is "+fact);
	}

}
