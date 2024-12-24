package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.EmployeeRepo;

public class DepartmentService {
	
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) { // validation of employee object
			result = "Employee Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department); // own method
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not Saved";
			}
		}
		return result;
	}


	public String deleteDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department Object Deleted Successfully";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) { // validation of employee object
			result = "Department Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null ) {
			result = "Invalid Department Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public String findDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString(); // later will modify
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}
