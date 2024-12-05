package com.day2;
import java.util.Scanner;
public class DuplicateElementsArray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int duplicateValues=0;
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i] >0)
				{
					count++;
					arr[j] = 0;
				}
			}			if(count>0)
			{
				duplicateValues++;
			}
		}
		System.out.println(duplicateValues);
		
	}
}
