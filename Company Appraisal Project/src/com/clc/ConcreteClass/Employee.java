package com.clc.ConcreteClass;

import java.time.LocalDate;
import java.time.Period;

import com.clc.AbstractClass.EmployeeAbstract;

/**
 * @author Hrishabh
 * @Date 18/9/2015
 */
public class Employee extends EmployeeAbstract {

	private int i, j;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.AbstractClass.EmployeeAbstract#isAppraisable()
	 */
	@Override
	public void isAppraisable() {
		// TODO Auto-generated method stub

		isValidSenior();
		didPublishPapers();
		hasValidRatings();
		isAppraisableLogic();
	}

	/**
	 * Check if employee's seniority is valid or not.
	 */
	private void isValidSenior() {
		// TODO Auto-generated method stub

		for (i = 0; i < joiningDate.length; i++)
			isValidSeniorLogic();
	}

	/**
	 * Check if employee published minimum 2 papers per year or not.
	 */
	private void didPublishPapers() {
		// TODO Auto-generated method stub

		for (i = 0; i < publishedPapers.length; i++)
			didPublishPapersLogic();
	}

	/**
	 * Check if employee has minimum 3 rating out of 5 or not.
	 */
	private void hasValidRatings() {
		// TODO Auto-generated method stub

		for (i = 0; i < ratingOfEmployee.length; i++)
			hasValidRatingsLogic();
	}

	/**
	 * Logic to check if employee is appraisable or not.
	 */
	private void isAppraisableLogic() {
		// TODO Auto-generated method stub

		for (i = 0; i < employeeName.length; i++) {
			
			if (seniorityOfEmployeeCheck[i] && seniorityOfEmployeeCheck[i]
					&& ratingOfEmployeeCheck[i] == true)
				System.out.println(employeeName[i] + " is appraisable employee.");
		}
	}

	/**
	 * Logic to check if employee is valid senior or not.
	 */
	private void isValidSeniorLogic() {
		// TODO Auto-generated method stub

		if(Period.between(joiningDate[i], LocalDate.now()).getYears()>4)
			seniorityOfEmployeeCheck[i]=true;
		else
			seniorityOfEmployeeCheck[i]=false;
	}

	/**
	 * Logic to check if employee published sufficient papers per year or not.
	 */
	private void didPublishPapersLogic() {
		// TODO Auto-generated method stub

		for (j = 0; j < publishedPapers[i].length; j++) {

			if (publishedPapers[i][j] > 1) {
				publishedPapersCheck[i] = true;
			} else {
				publishedPapersCheck[i] = false;
				break;
			}

		}
	}

	/**
	 * Logic to check if employee has valid ratings per year or not.
	 */
	private void hasValidRatingsLogic() {
		// TODO Auto-generated method stub

		for (j = 0; j < ratingOfEmployee[i].length; j++) {

			if (ratingOfEmployee[i][j] > 2) {
				ratingOfEmployeeCheck[i] = true;
			} else {
				ratingOfEmployeeCheck[i] = false;
				break;
			}

		}
	}

	/**
	 * Simple method to check values of every boolean variable.
	 */
	void testBooleanValues() {
		// TODO Auto-generated method stub

		for (int i = 0; i < employeeName.length; i++) {
			System.out.println(seniorityOfEmployeeCheck[i] + "  "
					+ publishedPapersCheck[i] + "   "
					+ ratingOfEmployeeCheck[i]);
		}
	}

}
