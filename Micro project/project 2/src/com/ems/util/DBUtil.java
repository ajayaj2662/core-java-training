package com.ems.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			//step-1 : Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step-2 : Making connection with database
			 con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training","Celcom123");
		}
		catch(ClassNotFoundException e){
			System.out.println("Could not load the driver");
		}
		catch(SQLException e)
		{
			System.out.println("Could not connect with the database");
		}
		return con;
		
	}
}
