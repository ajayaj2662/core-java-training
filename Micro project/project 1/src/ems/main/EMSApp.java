package com.ems.main;

import java.util.Scanner;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;
/**
 * @author Ajay-R
 * @version 1.0 
 * Driver class of the Employee Management System application
 */
public class EMSApp {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}
	/*
	 * return Employee
	 * used to get the data to be inserted in the specified collection
	 */
	public static Employee insertView() {
		System.out.println("Enter Employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble()); // Model Object
	}
	/**
	 * @return int
	 * used to get data to be deleted from the specified collection
	 */
	public static int deleteView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}
	/**
	 * @return Employee
	 * used to update employee details
	 */
	public static Employee updateView() {
		System.out.println("Enter Employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
	}
	/**
	 * @return int 
	 * used to find the particular employee's detail
	 */
	public static int findView() {
		System.out.println("Enter Employee id");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		String msg = "";

		String result = "";
		Employee employee;
		int id = 0;
		do {
			int choice = menu();
			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
		{

		}
	}
}
