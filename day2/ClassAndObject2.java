package com.day2;

class mobile
{
	String brand;
	String model;
	double price;
	
	mobile(String brand, String model,double price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void display()
	{
		System.out.println("Brand name "+brand);
		System.out.println("model "+model);
		System.out.println("price "+price);
	}
}
public class ClassAndObject2 
{
	public static void main(String[] args)
	{
		mobile obj = new mobile("OPPO","A55",25000);
		obj.display();
		
		mobile obj2 = new mobile("REDMI","F15",22000);
		obj2.display();
	}
}
