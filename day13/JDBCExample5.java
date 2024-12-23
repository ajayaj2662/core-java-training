package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2 : Making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// step-3 : Creating statement
		String sql = "select * from ajayr_employee"; // To display data
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4 : Execution the Query
		ResultSet rs = ps.executeQuery(); // select
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		for (int i = 1; i <= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}
		while (rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("esalary") + " "
					+ rs.getString("dno"));
		}
		// step-5 : closing
		rs.close();
		ps.close();
		con.close();
	}
}
