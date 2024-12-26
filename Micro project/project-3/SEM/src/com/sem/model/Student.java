package com.sem.model;

public class Student {
	private int student_Id;
	private String student_Name;
	private int age;
	private String gender;
	private Mark mark;//has a
	
	public Student() {
		super();
	}

	public Student(int student_Id, String student_Name, int age, String gender, Mark mark) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.age = age;
		this.gender = gender;
		this.mark = mark;  //Has -a
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", age=" + age + ", gender="
				+ gender + ", mark=" + mark+ "]";
	}

	
	
	
}
