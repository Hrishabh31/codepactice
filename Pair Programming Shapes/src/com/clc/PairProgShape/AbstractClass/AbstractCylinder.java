package com.clc.PairProgShape.AbstractClass;

import com.clc.PairProgShape.Interface.IShape;

/**
 * This abstract class initializes radius and height and implements
 * selectedShape method from upper interface
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public abstract class AbstractCylinder implements IShape {

	// initilaizes radius and height of the cylinder
	public float radiusCylinder, heightCylinder;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.IShape#selectedShape()
	 * 
	 * prints name of this shape
	 */
	@Override
	public String selectedShape() {
		// TODO Auto-generated method stub

		return " cylinder ";
	}

	@Override
	public float circumference() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
