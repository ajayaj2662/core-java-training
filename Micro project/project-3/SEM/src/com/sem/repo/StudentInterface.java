package com.sem.repo;

import java.util.List;

import com.sem.model.Student;

public interface StudentInterface {
	public boolean doInsertStudent(Student student);

	public boolean doDeleteStudent(int id);

	public boolean doUpdateStudent(Student student);

	public Student doFindStudent(int id);

	public List<Student> doFindAllStudent();

}
