package com.clc.PairProgShape.ConcreteClass;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.clc.PairProgShape.Interface.IShape;


/**
 * This class shows the final output required by the user this is test class
 * through which we execute our project.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Test {

	// int type variable to check the user's choice of shape for calculation.
	private int selectShape;

	// float type variables to store final perimeter/surface area of respective
	// shapes.
	private float circleCircumference, perimeterRectangle, surfaceAreaCylinder,
			perimeterSquare;

	// float type variables to store final area/volume of respective shapes.
	private float areaCircle, areaRectangle, volumeCylinder, areaTriangle,
			areaSquare;

	// initializing Scanner class reference to take input from user.
	Scanner scan = new Scanner(System.in);

	/**
	 * This method will print final required output.
	 */
	public void printOutput() {
		// TODO Auto-generated method stub

		selectShape();

		switch (selectShape) {
		case 1:
			circleOutput();
			break;

		case 2:
			rectangleOutput();
			break;

		case 3:
			cylinderOutput();
			break;

		case 4:
			triangleOutput();
			break;

		case 5:
			squareOutput();
			break;

		default:
			System.out.println("enter proper choise.");
			break;
		}

	}

	/**
	 * This method checks user choice of shape and handles exception if user
	 * enters wrong choice.
	 */
	private void selectShape() {
		// TODO Auto-generated method stub

		try {
			System.out
					.println("Enter choice:\n 1.Circle 2.Rectangle 3.Cylinder 4.Triangle 5.Square");
			selectShape = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("Enter proper choise.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Enter proper choise.");
		}
	}

	/**
	 * This method is called by print output method to print final output
	 * related to this shape
	 */
	private void circleOutput() {
		// TODO Auto-generated method stub

		Circle.takeValues.circle();
		IShape iCircle = new Circle();
		circleCircumference = iCircle.circumference();
		areaCircle = iCircle.area();
		System.out.println("Perimeter of" + iCircle.selectedShape() + "is: "
				+ circleCircumference);
		System.out.println("Area of" + iCircle.selectedShape() + "is: "
				+ areaCircle);
	}

	/**
	 * This method is called by print output method to print final output
	 * related to this shape
	 */
	private void rectangleOutput() {
		// TODO Auto-generated method stub

		Rectangle.takeValues.rectangle();
		IShape iRectangle = new Rectangle();
		perimeterRectangle = iRectangle.perimeter();
		areaRectangle = iRectangle.area();
		System.out.println("Perimeter of" + iRectangle.selectedShape() + "is: "
				+ perimeterRectangle);
		System.out.println("Area of" + iRectangle.selectedShape() + "is: "
				+ areaRectangle);
	}

	/**
	 * This method is called by print output method to print final output
	 * related to this shape
	 */
	private void cylinderOutput() {
		// TODO Auto-generated method stub

		Cylinder.takeValues.cylinder();
		IShape iCylinder = new Cylinder();
		surfaceAreaCylinder = iCylinder.area();
		volumeCylinder = iCylinder.volume();
		System.out.println("Surface area of" + iCylinder.selectedShape()
				+ "is: " + surfaceAreaCylinder);
		System.out.println("Volume of" + iCylinder.selectedShape() + "is: "
				+ volumeCylinder);
	}

	/**
	 * This method is called by print output method to print final output
	 * related to this shape
	 */
	private void triangleOutput() {
		// TODO Auto-generated method stub

		Triangle.takeValues.triangle();
		IShape iTriangle = new Triangle();
		areaTriangle = iTriangle.area();
		System.out.println("Area of" + iTriangle.selectedShape() + "is: "
				+ areaTriangle);
	}

	/**
	 * This method is called by print output method to print final output
	 * related to this shape
	 */
	private void squareOutput() {
		// TODO Auto-generated method stub

		Square.takeValues.square();
		IShape iSquare = new Square();
		perimeterSquare = iSquare.perimeter();
		System.out.println("Perimeter of" + iSquare.selectedShape() + "is: "
				+ perimeterSquare);
		areaSquare = iSquare.area();
		System.out.println("Area of" + iSquare.selectedShape() + "is: "
				+ areaSquare);
	}


	public static void main(String[] args) {

		Test test = new Test();

		for (int i = 0; i >= 0; i++) {

			int check = 0;

			try {
				System.out.println("Do you want to continue: 1.yes 2.no");
				check = test.scan.nextInt();

				if (check == 2)
					break;

				if (check == 1) {
					test.printOutput();
				} else {
					System.out.println("Enter proper integer");
				}

			} catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("Enter proper choice\n");
				test.scan.next();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e + "\n");

			}
		}

	}

}
