package com.day2;

class mobile1
{
	String brand;
	String model;
	double price;
	
	mobile1()
	{
		this("OPPO","IQOO",12000);
		
		//this.display();
	}
	mobile1(String brand, String model,double price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		
		this.display();
	}
	void display()
	{
		System.out.println("Brand name "+brand);
		System.out.println("model "+model);
		System.out.println("price "+price);
	}
}

public class ThisKeyword
{
		public static void main(String[] args)
		{
			mobile1 obj = new mobile1();
		}
}

