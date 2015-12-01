package com.clc.loginweb.jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	public static Connection getMySQLConnection()
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Connection connection = null;

		// Load the driver.
		Class.forName("org.postgresql.Driver");

		// Establish the connetion.
		connection = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/BookSystem", "user1", "root");
		System.out.println("Class loaded successfully...");

		return connection;
	}

	public static void cleanUp(Connection connection, Statement statement) {
		// TODO Auto-generated method stub

		try {
			if (connection != null)
				connection.close();
			/*if (statement != null)
				statement.close();*/
			System.out.println("Clean up");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void cleanUp(ResultSet extractedResult) {
		// TODO Auto-generated method stub
		
		try {
			if (extractedResult != null)
				extractedResult.close();
			System.out.println("Clean up");
			System.out.println(extractedResult);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
