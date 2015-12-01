package com.clc.JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getPostgresqlConnection() throws ClassNotFoundException, SQLException{
		
		Connection connection = null;
		
		try {
			// Load the driver.
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully...");
			
			try {
				
				// Get connection.
				connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee", "user1", "root");
				System.out.println("Connection established successfully...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return connection;
	}
}
