package com.sem.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

//import com.ems.model.Department;

import com.sem.model.Mark;
import com.sem.model.Student;
import com.sem.util.DBUtil;

public class StudentRepo implements StudentInterface  {

	MarkInterface markrepo = new MarkRepo();

	public boolean doInsertStudent(Student student) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "insert into student_ajay values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, student.getStudent_Id());
			ps.setString(2, student.getStudent_Name());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getGender());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query Not exeuted");
		}
		return flag;
	}

	public boolean doDeleteStudent(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "delete student_ajay where student_id = ?";
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

	public boolean doUpdateStudent(Student student) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();

			String sql = "update student_ajay set student_name =?, student_age =? , student_gender=? where student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getStudent_Name());
			ps.setInt(2, student.getAge());
			ps.setString(3, student.getGender());
			ps.setInt(4, student.getStudent_Id());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public Student doFindStudent(int id) {
		Student student = null;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from student_ajay where student_id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student = new Student();
				student.setStudent_Id(rs.getInt("student_id"));
				student.setStudent_Name(rs.getString("student_name"));
				student.setAge(rs.getInt("student_age"));
				student.setGender(rs.getString("student_gender"));
				int smark = rs.getInt("student_id");
				Mark mark = markrepo.doFindMark(smark);
				student.setMark(mark);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed" + e);
		}
		return student;
	}

	public List<Student> doFindAllStudent() {

		int smark = 0;
		List<Student> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getConnection();

			String sql = "select * from student_ajay";

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudent_Id(rs.getInt("student_id"));
				student.setStudent_Name(rs.getString("student_name"));
				student.setAge(rs.getInt("student_age"));
				student.setGender(rs.getString("student_gender"));

				smark = rs.getInt("student_id");
				Mark mark = markrepo.doFindMark(smark);
				student.setMark(mark);

				list.add(student);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed" + e);
		}
		return list;
	}

}
