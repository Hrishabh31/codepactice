package com.clc.PairProgShape.ConcreteClass;

import com.clc.PairProgShape.AbstractClass.AbstractRectangle;

/**
 * This class calculates the area and perimeter of this shape.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Rectangle extends AbstractRectangle {

	/**
	 * static reference of TakeValues class to initialize values here taken from
	 * user.
	 */
	static TakeValues takeValues = new TakeValues();

	/**
	 * default constructor to initialize values
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub

		breath = takeValues.breath;
		length = takeValues.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.IRectangle#perimeter()
	 * 
	 * This method calculates perimeter of this shape
	 */
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub

		float perimeterRectangle = 2 * breath * length;

		if (length < 1 || breath < 1) {
			System.out.println("Enter Proper choice");
			return 0;
		}
		return perimeterRectangle;
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

		float areaRectangle = length * breath;

		if (length < 1 || breath < 1)
			return 0;
		return areaRectangle;
	}
}
