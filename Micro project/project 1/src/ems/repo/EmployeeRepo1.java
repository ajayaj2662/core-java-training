package com.ems.repo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Ajay-R
 * @version 1.0
 * It is performing all the CRUD operations on MAP DB
 */
public class EmployeeRepo1 {
	/**
	 * @param employee
	 * @return return boolean
	 * It perform insert values in MAP DB
	 */
	
	public boolean doInsert(Employee employee) {
		
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEmpId(), employee);
		return true;
	}
	
	/**
	 * @param id
	 * @return Boolean
	 * It perform to find Delete id in MAP DB
	 */
	public boolean doDelete(int id) {
		
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			map.remove(id);
			flag = true;
		}
		return flag;
	}
	
	/** 
	 * @param employee
	 * @return flag
	 * It perform to update employee id in MAP DB
	 */
	public boolean doUpdate(Employee employee) {
		
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getEmpId())) {
			map.put(employee.getEmpId(), employee);
			flag = true;
		}
		return flag;
	}
	
	/**
	 * @param id 
	 * @return
	 * It perform to display employee details based on ID in MAP DB
	 */
	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}

	/**
	 * @return list
	 * It perform to display all employee details
	 */
	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;
	}
}
