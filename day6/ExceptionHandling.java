package com.day6;

//Here we are not importing package because arithmetic exception comes from java.lang package
// lang in a default package
public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		System.out.println("Before exception");
		try 
		{
		int a=Integer.parseInt("as");
		int b= 10/0;
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("Divided by 0 is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException a)
		{
			System.out.println(a.getMessage());
		}
		finally
		{
			System.out.println("Inside finally");
		}
		
		
		try
		{
			int a[] = new int[-6];
		}
//		catch(NegativeArraySizeException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Next finally block");
		}
		System.out.println("After exception");
	}
}
