package com.day5;

interface VehiclePlan
{
	void noOfWheels();
	void noOfEngine();
	void brandName();
}

abstract class Vehicle3 implements VehiclePlan
{
	public void noOfEngine()
	{
		System.out.println("The vehicle has 1 engine");
	}
}

class Bike5 extends Vehicle3
{
	public void noOfWheels()
	{
		System.out.println("The bike has 2 wheels");
	}
	public void brandName()
	{
		System.out.println("Hero honda");
	}
}
public class Interface3 
{
	public static void main(String[] args)
	{
		Vehicle3 obj;
		obj = new Bike5();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
	}
}
