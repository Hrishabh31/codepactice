package com.clc.PairProgShape.ConcreteClass;

import com.clc.PairProgShape.AbstractClass.AbstractCylinder;

/**
 * This class calculates the surface area and volume of this shape.
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public class Cylinder extends AbstractCylinder {

	/**
	 * static reference of TakeValues class to initialize values here taken from
	 * user.
	 */
	static TakeValues takeValues = new TakeValues();

	/**
	 * default constructor to initialize values
	 */
	public Cylinder() {
		// TODO Auto-generated constructor stub

		radiusCylinder = takeValues.radiusCylinder;
		heightCylinder = takeValues.heightCylinder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.ICylinder#volume()
	 * 
	 * This method calculates volume of this shape
	 */
	@Override
	public float volume() {
		// TODO Auto-generated method stub

		float volumeCylinder = (float) (3.14 * radiusCylinder * radiusCylinder * heightCylinder);

		if (radiusCylinder < 1 || heightCylinder < 1) {
			System.out.println("Enter Proper choice");
			return 0;
		}
		return volumeCylinder;
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

		float surfaceArea = (float) ((2 * 3.14 * radiusCylinder * radiusCylinder) + (2 * 3.14 * radiusCylinder * heightCylinder));

		if (radiusCylinder < 1 || heightCylinder < 1)
			return 0;
		return surfaceArea;
	}

}
