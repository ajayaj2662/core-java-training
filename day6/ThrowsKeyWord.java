package com.day6;
import java.io.FileNotFoundException;
import java.io.FileReader;
class myClass
{
	void myMethod() throws FileNotFoundException{
		FileReader fr = new FileReader("Ajay.txt");
	}
	void myMethod1()
	{
		try {
			myMethod();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
		finally{
			System.out.println("Program ended");
		}
	}
}
public class ThrowsKeyWord
{
	public static void main(String[] args) 
	{	
	}
}