package com.day2;
import java.util.Scanner;
public class ArrayOfArray {
	public static void main(String[] args)
	{
	int a[][] = { {1,2},{8,9,10},{11,23,45}};
	for( int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	System.out.println("Using for each loop");
	for(int x[]:a) {
		for(int y:x)
		{
			System.out.print(y + " ");
		}
		System.out.println();
	}
}
}
