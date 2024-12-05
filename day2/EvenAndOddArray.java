package com.day2;
import java.util.Scanner;
public class EvenAndOddArray 
{
	public static void main(String []args)
	{
		int evenCount = 0, oddCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] %2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even numbers count = "+ evenCount);
		System.out.println("Odd numbers count = "+oddCount);
	}
	
}
