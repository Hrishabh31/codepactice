package com.clc.PairProgShape.ConcreteClass;

import com.clc.PairProgShape.AbstractClass.AbstractTriangle;

/**
 * This class calculates the area and perimeter of this shape.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Triangle extends AbstractTriangle {

	/**
	 * static reference of TakeValues class to initialize values here taken from
	 * user.
	 */
	static TakeValues takeValues = new TakeValues();

	/**
	 * default constructor to initialize values
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub

		base = takeValues.base;
		heightTriangle = takeValues.height;
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

		float areaTriangle = (base * heightTriangle) / 2;

		if (base < 1 || heightTriangle < 1) {
			System.out.println("Enter Proper choice");
			return 0;
		}
		return areaTriangle;
	}

}
