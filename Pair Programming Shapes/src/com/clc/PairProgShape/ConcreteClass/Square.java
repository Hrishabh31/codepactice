package com.clc.PairProgShape.ConcreteClass;

import com.clc.PairProgShape.AbstractClass.AbstractSquare;

/**
 * This class calculates the area and perimeter of this shape.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Square extends AbstractSquare {

	/**
	 * static reference of TakeValues class to initialize values here taken from
	 * user.
	 */
	static TakeValues takeValues = new TakeValues();

	/**
	 * default constructor to initialize values
	 */
	public Square() {
		// TODO Auto-generated constructor stub

		sideOfSquare = takeValues.sideOfSquare;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ISquare#perimeter()
	 * 
	 * This method calculates perimeter of this shape
	 */
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub

		float perimeterSquare = 4 * sideOfSquare;

		if (sideOfSquare < 1) {
			System.out.println("Enter Proper choice");
			return 0;
		}
		return perimeterSquare;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.IShape#area()
	 * 
	 * This method calculates area of this shape
	 */
	@Override
	public float area() {
		// TODO Auto-generated method stub

		float areaSquare = sideOfSquare * sideOfSquare;

		if (sideOfSquare < 1)
			return 0;
		return areaSquare;
	}

}
