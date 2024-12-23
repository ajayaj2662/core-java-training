package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample6 {
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
		ps.setInt(1,503);
		ps.setString(2, "Madan");
		ps.setInt(3, 50000);
		ps.setInt(4, 111);
		ps.addBatch();    //Batch processing
		
		
		ps.setInt(1,504);
		ps.setString(2, "Krithik");
		ps.setInt(3, 60023);
		ps.setInt(4, 111);
		ps.addBatch();
		
		ps.executeBatch();
		
		// step-5 : closing
		ps.close();
		ps.close();
		con.close();
	}
}
