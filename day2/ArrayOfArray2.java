package com.day2;
import java.util.Scanner;
public class ArrayOfArray2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] { 5,6,7};
		arr[2] = new int[] {7,8,9,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//using enhanced for loop
		for(int i[] : arr)
		{
			for(int j : i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
