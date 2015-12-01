package com.clc.ConcreteClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;

import com.clc.JDBCConnectivity.JDBCUtil;

public class EmployeeAccessDB {

	private int executeQuery;
	
	public void accessDatabase(){
		
		Connection connection;
		Statement statement;
		ResultSet resultSet;
		
		String name;
		String add ;
		int id ;
		int i=0;
		try {
			
			// Call connection method.
			connection=JDBCUtil.getPostgresqlConnection();
			
			// Create statement.
			statement=connection.createStatement();
			System.out.println("Statement created...");
			
		    
			String sqlQuery;
			System.out.println("Enter the query to be submitted:");
			Scanner scan=new Scanner(System.in);
			//sqlQuery=scan.nextLine();
			sqlQuery="select * from emp_schema.employee where emp_add='amt';";
			resultSet = statement.executeQuery(sqlQuery);

			while(resultSet.next()){
				name=resultSet.getString(1);
				id=resultSet.getInt(2);
				add=resultSet.getString(3);
				
				System.out.println(name+"\t"+id+"\t"+add);
				i++;
			}
			checkIfQueryExecuted();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
		}
	}
	
	private void checkIfQueryExecuted() {
		// TODO Auto-generated method stub

		if (executeQuery==1)
			System.out.println("Query executed successfully.");
		else
			System.out.println("Sorry. Query is not executed.");
	}
	
	public static void main(String[] args) {
		EmployeeAccessDB e=new EmployeeAccessDB();
		e.accessDatabase();
	}
}
