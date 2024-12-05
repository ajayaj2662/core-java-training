package com.day2;

class Employee
{
	int eid;
	String ename;
	double salary;
	
	Employee(int eid, String ename,double salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Employee id " + eid);
		System.out.println("Employee id " + ename);
		System.out.println("Employee id " + salary);
	}
	
	
}
public class ClassAndObject {
		public static void main(String[] args)
		{
			Employee obj = new Employee(101,"ajay",20000);
			obj.display();
			
			Employee obj1 = new Employee(102,"vijay",30000);
			obj1.display();
		}
}
