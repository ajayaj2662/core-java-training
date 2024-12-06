package com.day3;

class Vehicle// super class
{
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler extends Vehicle //sub class //super class
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler //sub class
{
	void brandName()
	{
		System.out.println("Brand name: Royal Enfield");
	}
}

public class SingleInheritance 
{
		public static void main(String[] args)
		{
			Bike obj = new Bike();
			obj.noOfEngine();
			obj.noOfWheels();
			obj.brandName();
			
		}
}
