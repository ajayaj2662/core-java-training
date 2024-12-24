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


public class DepartmentRepo {
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "insert into ajayr_department values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	

	public boolean doDeleteDepartment(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "delete ajayr_department where dno = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
			
		} catch (SQLException e) {
			System.out.println("Delete Query not executed");
		}
		return flag;
	}

 public boolean doUpdateDepartment(Department department){
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "update ajayr_department set dname = ? where dno = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(2, department.getDno());
			ps.setString(1, department.getDname());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;
	}

	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from ajayr_department where dno =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();
				department.setDname(rs.getString("dname"));
				department.setDno(rs.getInt("dno"));
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return department;
	}
	
	public List<Department> doFindAllDepartment() {
		List<Department> list = new LinkedList<>();
	
		try {
			Connection con = DBUtil.getConnection();
			
			String sql = "select * from ajayr_department";
			
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Department department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));
				
				list.add(department);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return list;
	}
}
