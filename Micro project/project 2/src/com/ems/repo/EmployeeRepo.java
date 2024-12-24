package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;

import com.ems.util.DBUtil;

/**
 * @author Ajay-R
 * @version 1.0 It is performing all the CRUD operations on LIST DB
 */
public class EmployeeRepo {
	DepartmentRepo departmentRepo = new DepartmentRepo();
	
	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "insert into ajayr_employee values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	/**
	 * @param id
	 * @return Boolean It perform to find Delete id in LIST DB
	 */

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "delete ajayr_employee where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

//	
//	/**
//	 * @param employee
//	 * @return flag
//	 * It perform to update employee id in LIST DB
//	 */
	public boolean doUpdateEmloyee(Employee employee) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "update ajayr_employee set ename = ?, esalary =?, dno=? where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public Employee doFindEmployee(int id) {
		int departmentNumber;
		Employee employee = null;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from ajayr_employee where eid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname("ename");
				employee.setEsalary(rs.getInt("esalary"));
				departmentNumber = rs.getInt("dno");
				Department department =  departmentRepo.doFindDepartment(departmentNumber);
				employee.setDepartment(department);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return employee;
	}
	
	public List<Employee> doFindAllEmployee() {
		List<Employee> list = new LinkedList<>();
	
		try {
			Connection con = DBUtil.getConnection();
			
			String sql = "select * from ajayr_employee";
			
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname("ename");
				employee.setEsalary(rs.getInt("esalary"));
				int departmentNumber = rs.getInt("dno");
				Department department =  departmentRepo.doFindDepartment(departmentNumber);
				employee.setDepartment(department);
				
				list.add(employee);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return list;
	}
}
