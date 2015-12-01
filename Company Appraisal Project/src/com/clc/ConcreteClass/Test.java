package com.clc.ConcreteClass;

public class Test {

	
	public static void main(String[] args) {
		
		/*Employee employee = new Employee();
		employee.isAppraisable();
		employee.testBooleanValues();
		employee.exactSeniorityOfEmployee(3);*/
		
		EmployeeAccessDB connectDB= new EmployeeAccessDB();
		connectDB.accessDatabase();
	}
}
