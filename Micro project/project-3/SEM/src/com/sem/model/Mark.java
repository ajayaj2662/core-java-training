package com.sem.model;

public class Mark {
	private int student_Id;
	private String student_Subject;
	private int student_Marks;
	
	//default constructor
	public Mark() {
		super();
	}

	//parametarized constructor
	public Mark(int student_Id, String student_Subject, int student_Marks) {
		super();
		this.student_Id = student_Id;
		this.student_Subject = student_Subject;
		this.student_Marks = student_Marks;
	}

	//getter and setter methods
	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Subject() {
		return student_Subject;
	}

	public void setStudent_Subject(String student_Subject) {
		this.student_Subject = student_Subject;
	}

	public int getStudent_Marks() {
		return student_Marks;
	}

	public void setStudent_Marks(int student_Marks) {
		this.student_Marks = student_Marks;
	}

	@Override
	public String toString() {
		return "Marks [student_Id=" + student_Id + ", student_Subject=" + student_Subject + ", student_Marks="
				+ student_Marks + "]";
	}
	
}
