package com.day2;

public class InstanceAndStaticMethods 
{
	    void display()
	    {
	    	System.out.println("Normal Display Method");
	    }
	    static void display2()
	    {
	    	System.out.println("Static display Method");
	    }
	
		public static void main(String[] args)
		{
			InstanceAndStaticMethods obj = new InstanceAndStaticMethods();
			obj.display();
			
			InstanceAndStaticMethods.display2();
		}
}
