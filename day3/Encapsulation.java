package com.day3;


class Emp
{
	private int	eid;
	private String ename;
	private int esalary;
	
	public Emp(int eid, String ename, int esalary)
	{
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
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
}
public class Encapsulation
{
	public static void main(String[] args)
	{
		Emp obj = new Emp(101,"Ajay",22000);
		System.out.println(obj.getEname());
		System.out.println(obj.getEid());
		System.out.println(obj.getEsalary());
		
		obj.setEname("vijay");
		System.out.println(obj.getEname());
		System.out.println(obj.getEid());
		System.out.println(obj.getEsalary());
		
	
	}
}
