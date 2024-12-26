package com.sem.service;

import com.sem.model.Student;
import com.sem.repo.StudentInterface;
import com.sem.repo.StudentRepo;

public class StudentService implements StudentServiceInterface{
	StudentInterface studentRepo = new StudentRepo();

	public String insertStudentValidation(Student student) {
		String result;
		if (student == null) {
			result = "Student Object is Null";
		} else if (student.getStudent_Id() == 0 || student.getStudent_Name() == null || student.getAge() == 0
				|| student.getGender() == null) {
			result = "Invalid Student Data";
		} else {
			boolean flag = studentRepo.doInsertStudent(student);

			if (flag) {
				result = "Student Object Saved";
			} else {
				result = "Student Object Not Saved";
			}
		}
		return result;
	}

	public String deleteStudentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = studentRepo.doDeleteStudent(id);
			if (flag) {
				result = "Student Object Deleted Successfully";
			} else {
				result = "Student Object Not Found";
			}
		}
		return result;
	}
	
	public String updateStudentValidation(Student student) {
		String result;
		if (student == null) { // validation of employee object
			result = "Student Object is Null";
		} else if (student.getStudent_Id()==0 || student.getStudent_Name() == null || student.getAge() == 0  || student.getGender() ==null) {
			result = "Invalid Student Data";
		} else {
			boolean flag = studentRepo.doUpdateStudent(student);
			if (flag) {
				result = "Student Object Updated";
			} else {
				result = "Student Object Not Found";
			}
		}
		return result;
	}
	public String findStudentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Student student = studentRepo.doFindStudent(id);
			if (student != null) {
				result = student.toString(); // later will modify
			} else {
				result = "Student Object Not Found";
			}
		}
		return result;
	}
	
	public String findAllStudentValidation()
	{
		return studentRepo.doFindAllStudent().toString();
	}
}
