package com.ems.service;

import com.ems.repo.EmployeeRepo1;
import com.ems.model.Employee;

public class EmployeeService {
	/**
	 * @author Ajay-R
	 * @version 1.0
	 * service layer of the Employee Management System
	 */

	// EmployeeRepo employeeRepo = new EmployeeRepo();
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();
	/**
	 * @param employee
	 * @return String
	 * validates the data being entered into the specified collection.
	 */
	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) { // validation of employee object
			result = "Employee Object is Null";
		} else if (employee.getEmpId() == 0 || employee.getEmpName() == "Null" || employee.getEmpSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsert(employee); // own method
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Saved";
			}
		}
		return result;
	}
	/**
	 * @param id
	 * @return String
	 * checks and removes the specified value from the collection
	 */
	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee Object Deleted Successfully";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}
	/**
	 * @param employee
	 * @return String
	 * updates the specified collection
	 */
	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) { // validation of employee object
			result = "Employee Object is Null";
		} else if (employee.getEmpId() == 0 || employee.getEmpName() == "Null" || employee.getEmpSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}
	/**
	 * @param id
	 * @return String
	 * retrieves and displays the specified detail
	 */
	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString(); // later will modify
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}
	/**
	 * @return String
	 * display the details of all employees in the collection
	 */
	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}
}
