package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;

public class EmployeeService {
	
	EmployeeRepo employeeRepo = new EmployeeRepo();

	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) { // validation of employee object
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == "Null" || employee.getEsalary() == 0 || employee.getDepartment().getDno() ==0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee); // own method
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Saved";
			}
		}
		return result;
	}

	public String deleteEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
			if (flag) {
				result = "Employee Object Deleted Successfully";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}

	public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) { // validation of employee object
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == "Null" || employee.getEsalary() == 0  || employee.getDepartment().getDno() ==0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdateEmloyee(employee);
			if (flag) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}

	public String findEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
			if (employee != null) {
				result = employee.toString(); // later will modify
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}
	
	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAllEmployee().toString();
	}
}
