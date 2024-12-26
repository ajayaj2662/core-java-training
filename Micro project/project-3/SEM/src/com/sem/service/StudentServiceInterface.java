package com.sem.service;

import com.sem.model.Student;

public interface StudentServiceInterface {
	public String insertStudentValidation(Student student);

	public String deleteStudentValidation(int id);

	public String updateStudentValidation(Student student);

	public String findStudentValidation(int id);

	public String findAllStudentValidation();
}
