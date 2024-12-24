package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentView {
	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;

	public static Department insertDepartmentView() {
		System.out.println("Enter DepartmentNo,Enter Name");
		dno =sc.nextInt();
		dname = sc.next();
		
		return new Department(dno,dname);
	}
	
	public static int deleteDepartmentView() {
		System.out.println("Enter Department id");
		return sc.nextInt();
	}

	public static Department updateDepartmentView() {
		System.out.println("Enter Department Number ");
		dno = sc.nextInt();
		System.out.println("Enter dept name");
		dname=sc.next();
		return new Department(dno,dname); 
	}

	
	public static int findDepartmentView() {
		System.out.println("Enter Department id");
		return sc.nextInt();
	}
	
}
