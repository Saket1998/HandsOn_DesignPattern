package com.cognizant;

public class FacadePatternDemo {
	public static void main(String args[]) {
		ShapeMaker ob = new ShapeMaker();
		ob.drawCircle();
		ob.drawRectangle();
		ob.drawSquare();
	}
}
