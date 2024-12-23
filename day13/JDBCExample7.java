package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample7 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2 : Making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// step-3 : Creating statement
		String sql ="Insert into ajayr_employee values(?,?,?,?)"; // T
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4 : Execution the Query
		Object employee[][] = new Object[][]	
		{
			{601," naveen raj",2000,111},
			{602," Stephen",2500,111},
			{603," kishore",3000,111},
			{604," praveen",3500,111},
			{605," hari",4000,111},
		};
		for(int i=0;i<employee.length;i++)
		{
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2, (String)employee[i][1]);
			ps.setInt(3, (Integer)employee[i][2]);
			ps.setInt(4, (Integer)employee[i][3]);
			
			ps.addBatch();
		}
		ps.executeBatch();
		// step-5 : closing
		ps.close();
		ps.close();
		con.close();
	}
}
