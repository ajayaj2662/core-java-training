package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step-1 : Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step-2 : Making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training","Celcom123");
		 
		//step-3 : Creating statement
		String sql ="Insert into ajayr_employee values(?,?,?,?)";   //To insert date into table
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step-4 : Execution the Query
		ps.setInt(1, 103);
		ps.setString(2,"Naveen");
		ps.setInt(3, 1300);
		ps.setInt(4, 111);
		
		int n = ps.executeUpdate();  //Insert, Delete, Update 
		if(n == 1)
		{
			System.out.println("Record Inserted");
		}
		else
		{
			System.out.println("Employee record not inserted");
		}
		ps.close();
		con.close();
	}
}
