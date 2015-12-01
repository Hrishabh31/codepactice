package com.clc.loginweb.jdbcservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.clc.loginweb.jdbcutil.JDBCUtil;


public class LoginService {

	static ResultSet resultSet;
	static Statement statement;
	static Connection connection;
	
	public static ResultSet extract() {
		// TODO Auto-generated method stub

			try {

				connection = JDBCUtil.getMySQLConnection();

				// Create the required statement.
				statement = connection.createStatement();
				String sql = "select user_name, password from book_schema.users_table";

				// Submit the sql statement to database.
				resultSet = statement.executeQuery(sql);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				 e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			} finally{
				JDBCUtil.cleanUp(connection, statement);
			}

			return resultSet;
	}

}