package com.day3;

class Doctor
{
	Doctor()
	{
		System.out.println("Doctor default parameter");
	}
	Doctor(int a)
	{
		System.out.println("Doctor parametarized constructor");
	}
}

class Patient extends Doctor
{
	Patient()
	{
		super(10);
		//this(20);
		System.out.println("Patient");
	}
	Patient(int a)
	{
		//super();
		System.out.println("Patient parameter");
	}
}

class Warden extends Patient
{
	Warden()
	{
		System.out.println("Warden class Default constructor");
	}
}
public class ConstructorInvocationOrder
{
	public static void main(String[] args)
	{
		Warden obj = new Warden();
	}
}
