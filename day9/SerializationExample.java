package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable
{
	private int eid;
	private String ename;
	transient private double esalary;
	
	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
}
public class SerializationExample 	
{
	public static void main(String[] args) throws Exception
	{
		//Serialization
		Employee obj = new Employee(101,"Ajay",2000);
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj);
		objout.close();
		fout.close();
		System.out.println("The program executed successfully");
		
		//Deserialization
		FileInputStream fin = new FileInputStream("D://ObjectFIle.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee obj2 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		
		System.out.println("Employee name " + obj2.getEname());
		System.out.println("Employee id " + obj2.getEid());
		System.out.println("Employee name " + obj2.getEsalary());
	
	}
}
