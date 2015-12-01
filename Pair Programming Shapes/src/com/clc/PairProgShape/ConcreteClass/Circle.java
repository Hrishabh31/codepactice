package com.clc.PairProgShape.ConcreteClass;

import com.clc.PairProgShape.AbstractClass.AbstractCircle;

/**
 * This class calculates the area and circumference of this shape.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Circle extends AbstractCircle {

	/**
	 * static reference of TakeValues class to initialize values here taken from
	 * user.
	 */
	static TakeValues takeValues = new TakeValues();

	/**
	 * default constructor to initialize values
	 */
	public Circle() {
		// TODO Auto-generated constructor stub

		radius = takeValues.radiusCircle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ICircle#perimeter()
	 * 
	 * This method calculates perimeter of this shape
	 */
	@Override
	public float circumference() {
		// TODO Auto-generated method stub

		float perimeter = (float) (2 * 3.14 * radius);

		if (radius < 1) {
			System.out.println("Enter Proper choice");
			return 0;
		}
		return perimeter;
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

		float areaCircle = (float) (3.14 * radius * radius);

		if (radius < 1)
			return 0;
		return areaCircle;
	}

}
