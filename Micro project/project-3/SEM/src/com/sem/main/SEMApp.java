package com.sem.main;

import java.util.Scanner;

import com.sem.model.Mark;
import com.sem.model.Student;
import com.sem.service.MarkService;
import com.sem.service.StudentService;
import com.sem.view.MarkView;
import com.sem.view.StudentView;

public class SEMApp {

	public static void main(String[] args) {

		String msg = "";
		String result = "";
		int id = 0;
		Student students;
		Mark mark;
		StudentService studentService = new StudentService();
		MarkService markService = new MarkService();
		do {
			int choice = StudentView.menu();
			switch (choice) {
			case 1:
				students = StudentView.insertStudentsView();
				result = studentService.insertStudentValidation(students);
				StudentView.printResult(result);
				break;
			case 2:
				id = StudentView.deleteStudentView();
				result = studentService.deleteStudentValidation(id);
				StudentView.printResult(result);
				break;
			case 3:
				students = StudentView.UpdateStudentsView();
				result = studentService.updateStudentValidation(students);
				StudentView.printResult(result);
				break;
			case 4:
				id = StudentView.findStudentView();
				result = studentService.findStudentValidation(id);
				StudentView.printResult(result);
				break;
			case 5:
				result = studentService.findAllStudentValidation();
				StudentView.printResult(result);
				break;
			case 6:
				mark = MarkView.insertMarkView();
				result = markService.insertMarkValidation(mark);
				MarkView.printResult(result);
				break;
			case 7:
				id = MarkView.deleteMarkView();
				result = markService.deleteMarkValidation(id);
				MarkView.printResult(result);
				break;
			case 8:
				mark = MarkView.updateMarkView();
				result = markService.updateMarkValidation(mark);
				MarkView.printResult(result);
				break;
			case 9:
				id = MarkView.findMarkView();
				result = markService.findMarkValidation(id);
				MarkView.printResult(result);
				break;
			case 10:
				result = markService.findAllMarkValidation();
				MarkView.printResult(result);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			msg = StudentView.toContinue(msg);
		} while (msg.equalsIgnoreCase("Yes"));
		{

		}
	}
}
