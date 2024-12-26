package com.sem.view;

import java.util.Scanner;

import com.sem.model.Mark;
import com.sem.model.Student;

public class StudentView {

	static Scanner sc = new Scanner(System.in);
	static int student_Id, student_Age;
	static String student_Name, student_Gender;

	public static int menu() {
		System.out.println("1. Insert Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Find Student");
		System.out.println("5. Find All Students");
		System.out.println("6. Insert Mark");
		System.out.println("7. Delete Mark");
		System.out.println("8. Update Mark");
		System.out.println("9. Find Mark");
		System.out.println("10. Find All Mark");
		System.out.println("11. Exit");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static String toContinue(String msg) {
		System.out.println("Do you want to continue [Yes | No]");
		return msg = sc.next();
	}

	public static void printResult(String result) {
		System.out.println(result);

	}

	public static Student insertStudentsView() {

		System.out.println("Enter student id, name ,age ,gender ");
		student_Id = sc.nextInt();
		student_Name = sc.next();
		student_Age = sc.nextInt();
		student_Gender = sc.next();

		Mark mark = new Mark();
		mark.setStudent_Id(student_Id);

		return new Student(student_Id, student_Name, student_Age, student_Gender, mark);
	}

	public static int deleteStudentView() {
		System.out.println("Enter Student Id");
		return sc.nextInt();
	}

	public static Student UpdateStudentsView() {
		System.out.println("Enter Studenet id, name, age, gender");
		student_Id = sc.nextInt();
		student_Name = sc.next();
		student_Age = sc.nextInt();
		student_Gender = sc.next();

		Mark mark = new Mark();
		mark.setStudent_Id(student_Id);

		return new Student(student_Id, student_Name, student_Age, student_Gender, mark);
	}

	public static int findStudentView() {
		System.out.println("Enter Student Id");
		return sc.nextInt();
	}
}