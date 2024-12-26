package com.sem.view;

import java.util.Scanner;

import com.sem.model.Mark;

public class MarkView {
	static Scanner sc = new Scanner(System.in);
	static int student_Id, student_Mark;
	static String student_Subject;

	public static void printResult(String result) {
		System.out.println(result);

	}

	public static Mark insertMarkView() {
		System.out.println("Enter student id, subject, mark");

		student_Id = sc.nextInt();
		student_Subject = sc.next();
		student_Mark = sc.nextInt();
		return new Mark(student_Id, student_Subject, student_Mark);
	}

	public static int deleteMarkView() {
		System.out.println("Enter Student Id to be deleted");
		return sc.nextInt();
	}

	public static Mark updateMarkView() {
		System.out.println("Mark Details -  Enter Student id, subject,marks");
		student_Id = sc.nextInt();
		student_Subject = sc.next();
		student_Mark = sc.nextInt();

		return new Mark(student_Id, student_Subject, student_Mark);
	}

	public static int findMarkView() {
		System.out.println("Enter Student Id");
		return sc.nextInt();
	}

}
