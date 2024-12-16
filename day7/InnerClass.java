package com.day7;

interface Inner4{
	void display();
}

public class InnerClass 
{
	class Inner1
	{
		void display()
		{
			System.out.println("Non-static inner class");
		}
	}
	static class Inner2
	{
		void display2()
		{
			System.out.println("Static inner class");
		}
	}
	public static void main(String[] args)
	{
		InnerClass obj = new InnerClass();
		Inner1 inner = obj.new Inner1();
		inner.display();
		
		
		Inner2 inner2 = new InnerClass.Inner2();
		inner2.display2();
		
		class Inner3
		{
			void display()
			{
				System.out.println("Local Inner Class");
			}
		}
		Inner3 obj3 = new Inner3();
		obj3.display();
		
		Inner4 obj4 = new Inner4()
		{
			public void display()
			{
				System.out.println("Annonymous inner class");
			}
		};
		obj4.display();
	}//anonimous inner = a class without name
}
