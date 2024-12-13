package com.day5;

abstract class Vehicle
{
	void noOfEngine()
	{
		System.out.println("The vehicle has only 1 engine");
	}
	abstract void noOfWheels();
	abstract void vehicleName();
}

class Car extends Vehicle
{
		void noOfWheels()
		{
			System.out.println("The car has 4 wheels");
		}
		void vehicleName()
		{
			System.out.println("The vehicle name = Hundai i20");
		}
}

class Bike extends Vehicle
{
		void noOfWheels()
		{
			System.out.println("The bike has 2 wheels");
		}
		void vehicleName()
		{
			System.out.println("The Vehicle name = hero");
		}
}

public class Abstraction2
{
	public static void main(String[] args)
	{
		Vehicle vel;
		
		vel = new Car();
		vel.noOfEngine();
		vel.noOfWheels();
		vel.vehicleName();
		System.out.println();
		
		vel = new Bike();
		vel.noOfEngine();
		vel.noOfWheels();
		vel.vehicleName();
		System.out.println();
		
		Car car = new Car();
		car.noOfEngine();
		car.noOfWheels();
		car.vehicleName();
	}
}
