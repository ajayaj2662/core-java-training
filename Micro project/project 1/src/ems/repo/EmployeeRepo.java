package com.ems.repo;

import java.util.Iterator;
import java.util.List;
import com.ems.model.Employee;

import com.ems.util.DBUtil;

/**
 * @author Ajay-R
 * @version 1.0
 * It is performing all the CRUD operations on LIST DB
 */
public class EmployeeRepo 
{
	/**
	 * @param employee
	 * @return return boolean
	 * It perform insert values in LIST DB
	 */
	public boolean doInsert(Employee employee) {
		
		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee); // true or false
	}

	/**
	 * @param id
	 * @return Boolean
	 * It perform to find Delete id in LIST DB
	 */
	public boolean doDelete(int id) {
		boolean flag = false;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	/**
	 * @param employee
	 * @return flag
	 * It perform to update employee id in LIST DB
	 */
	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == employee.getEmpId()) {
				list.set(index, employee);
				flag = true;
				break;
			}
			index++;
		}
		return flag;
	}
	
	/**
	 * @param id 
	 * @return
	 * It perform to display employee details based on ID in LIST DB
	 */
	public Employee doFind(int id) {
		Employee employee = null;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == id) {
				it.remove();
				employee = temp;
				break;
			}
		}
		return employee;
	}
	
	/**
	 * @return list
	 * It perform to display all employee details
	 */
	public List<Employee> doFindAll() {
		return DBUtil.getListDBInstance();
	}
}
