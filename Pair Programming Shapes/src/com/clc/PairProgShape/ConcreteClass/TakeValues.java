package com.clc.PairProgShape.ConcreteClass;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.clc.PairProgShape.AbstractClass.AbstractTakeValues;

/**
 * This class takes input of various values depending on shape or method called
 * by user.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 *
 */
public class TakeValues extends AbstractTakeValues {

	// initializing Scanner class to take input from user.
	Scanner s = new Scanner(System.in);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ITakeValues#circle()
	 * 
	 * This method takes radius value from user and handles exception if user
	 * enters wrong values.
	 */
	@Override
	public void circle() {
		// TODO Auto-generated method stub

		System.out.println("Enter radius for circle:");
		try {
			radiusCircle = s.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println(e + " for circle");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " for circle");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ITakeValues#rectangle()
	 * 
	 * This method takes length and breadth values from user and handles
	 * exception if user enters wrong values.
	 */
	@Override
	public void rectangle() {
		// TODO Auto-generated method stub

		try {
			System.out.println("Enter length for rectangle:");
			length = s.nextFloat();
			System.out.println("Enter breath for rectangle:");
			breath = s.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println(e + " for rectangle");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " for rectangle");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ITakeValues#square()
	 * 
	 * This method takes length and breadth values from user and handles
	 * exception if user enters wrong values.
	 */
	@Override
	public void square() {
		// TODO Auto-generated method stub

		try {
			System.out.println("Enter the side of square:");
			sideOfSquare = s.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println(e + " for square");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " for square");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ITakeValues#triangle()
	 * 
	 * This method takes base and height values from user and handles exception
	 * if user enters wrong values.
	 */
	@Override
	public void triangle() {
		// TODO Auto-generated method stub

		try {
			System.out.println("Enter base of triangle:");
			base = s.nextFloat();
			System.out.println("Enter height of triangle:");
			height = s.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println(e + " for triangle");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " for triangle");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ITakeValues#cylinder()
	 * 
	 * This method takes radius and height values from user and handles
	 * exception if user enters wrong values.
	 */
	@Override
	public void cylinder() {
		// TODO Auto-generated method stub

		try {
			System.out.println("Enter radius of cylinder:");
			radiusCylinder = s.nextFloat();
			System.out.println("Enter height of cylinder:");
			heightCylinder = s.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println(e + " for cylinder");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " for cylinder");
		}
	}

}
