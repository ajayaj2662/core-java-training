package com.day3;
//Hierarchical Inheritance
class Shapes
{
	int length;
	int breath;
	int side;
	int height;
	
	public Shapes(int length, int breath) 
	{
		this.length = length;
		this.breath = breath;
	}

	public Shapes(int side) 
	{
		this.side = side;
	}

	public Shapes(int length, int breath, int height) 
	{
		this.length = length;
		this.breath = breath;
		this.height = height;
	}
	
	void area()
	{
		System.out.println("Cannot find area");
	}
	
}
class Rectangle extends Shapes
{
	Rectangle(int length,int breath)
	{
		super(length,breath);
		
	}
	void area()
	{
		System.out.println("Area of rectangle "+(length  * breath));
	}
}

class Square extends Shapes
{
	Square(int side)
	{
		super(side);
	}
	void area()
	{
		System.out.println("Area of square "+(side * side));
	}
}

class Triangle extends Shapes
{
	Triangle(int length, int breath, int height)
	{
		super(length,breath,height);
	}
	void area()
	{
		System.out.println("Area of Triangle "+(length * breath * height));
	}
}


public class AreaCalculation
{
	public static void main(String[] args)
	{
		Rectangle obj = new Rectangle(5,8);
		obj.area();
		
		Square obj1 = new Square(5);
		obj1.area();
		
		Triangle obj2 = new Triangle(2,5,6);
		obj2.area();
	}
}
