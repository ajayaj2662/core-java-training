package com.sem.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.sem.model.Mark;

import com.sem.util.DBUtil;

public class MarkRepo implements MarkInterface {
	public boolean doInsertStudent(Mark mark) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "insert into mark_ajay values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, mark.getStudent_Id());
			ps.setString(2, mark.getStudent_Subject());
			ps.setInt(3, mark.getStudent_Marks());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query Not exeuted");
		}
		return flag;
	}

	public boolean doDeleteMark(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "delete mark_ajay where student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Delete Query Not exeuted" + e.getMessage());
		}
		return flag;
	}

	public boolean doUpdateMark(Mark mark) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "update mark_ajay set student_subject =?, student_mark =? where student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, mark.getStudent_Subject());
			ps.setInt(2, mark.getStudent_Marks());
			ps.setInt(3, mark.getStudent_Id());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;
	}

	public Mark doFindMark(int id) {
		Mark mark = null;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from mark_ajay where student_id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				mark = new Mark();
				mark.setStudent_Id(id);
				mark.setStudent_Subject(rs.getString("student_subject"));
				mark.setStudent_Marks(rs.getInt("student_mark"));
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return mark;
	}

	public List<Mark> doFindAllMark() {
		List<Mark> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getConnection();

			String sql = "select * from mark_ajay";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Mark mark = new Mark();
				mark.setStudent_Id(rs.getInt("student_id"));
				mark.setStudent_Subject(rs.getString("student_subject"));
				mark.setStudent_Marks(rs.getInt("student_mark"));

				list.add(mark);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return list;
	}

}
