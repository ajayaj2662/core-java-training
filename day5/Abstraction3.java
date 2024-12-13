package com.day5;
//Abstract class with constructor
abstract class Vehicle1
{
	Vehicle1(int a)
	{
		System.out.println("Abstract class constructor");
	}
	void noOfEngine()
	{
		System.out.println("The vehicle has only 1 engine");
	}
	abstract void noOfWheels();
	abstract void vehicleName();
}
class Bike1 extends Vehicle1
{
		Bike1()
		{
			super(10);
			System.out.println("Sub class constructor");
		}
		//Default constructor is created and by the use of super() vehicle constructor is c called.
		void noOfWheels()
		{
			System.out.println("The bike has 2 wheels");
		}
		void vehicleName()
		{
			System.out.println("The Vehicle name = hero");
		}
}
public class Abstraction3 
{
	public static void main(String[] args)
	{
		Vehicle1 vel;
		
		vel = new Bike1();
		vel.noOfEngine();
		vel.noOfWheels();
		vel.vehicleName();
	}
}
