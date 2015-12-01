package com.clc.AbstractClass;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public abstract class EmployeeAbstract {

	public String[] employeeName = { "Employee1", "Employee2", "Employee3",
			"Employee4", "Employee5" };
	public boolean[] seniorityOfEmployeeCheck = new boolean[employeeName.length],
			publishedPapersCheck = new boolean[employeeName.length],
			ratingOfEmployeeCheck = new boolean[employeeName.length];
	public LocalDate[] joiningDate = { LocalDate.of(2010, Month.JANUARY, 1),
			LocalDate.of(2013, Month.MARCH, 21),
			LocalDate.of(2012, Month.MAY, 11),
			LocalDate.of(2009, Month.OCTOBER, 31),
			LocalDate.of(2010, Month.APRIL, 10) };
	public int[][] publishedPapers = { { 0, 2, 1, 3, 2 }, { 1, 2 },
			{ 1, 2, 3 }, { 2, 3, 2, 2, 3, 3 }, { 2, 3, 2, 3, 3 } },
			ratingOfEmployee = { { 2, 3, 3, 2, 4 }, { 3, 3 }, { 2, 3, 3 },
					{ 3, 3, 3, 4, 4, 4 }, { 2, 2, 3, 3, 4 } };

	public abstract void isAppraisable();

	/**
	 * To check the exact seniority of employee.
	 * @param x to refer the employee no in the array.
	 */
	public void exactSeniorityOfEmployee(int x) {
		// TODO Auto-generated method stub

		Period period = Period.between(joiningDate[x], LocalDate.now());
		System.out.println("Employee is exactly " + period.getDays() + "days "
				+ period.getMonths() + "months and " + period.getYears()
				+ "years senior in the company. Or "
				+ ChronoUnit.DAYS.between(joiningDate[x], LocalDate.now())
				+ " days in total.");
	}

}
