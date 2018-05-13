package com.revature.demos.oopfun.models;

public class Shape {

	private String numberOfSides;
	private String numberOfDimensions;

	public Shape() {
		numberOfSides = "Infinity";
		numberOfDimensions = "Infinity";
	}

	public Shape(int sides, int dimensions) {
		numberOfSides = new Integer(sides).toString();
		numberOfDimensions = new Integer(dimensions).toString();

		// Just to ensure someone doesn't try to say that our shape has a negative
		// number of sides, or exists in a negative dimension.
		if(sides <= 0 || dimensions <= 0) {
			numberOfSides = "Infinity";
			numberOfDimensions = "Infinity";
		}
	}

	public Shape(String sides, int dimensions) {
		numberOfSides = sides;
		numberOfDimensions = new Integer(dimensions).toString();
	}

	public String getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(String numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public String getNumberOfDimensions() {
		return numberOfDimensions;
	}

	public void setNumberOfDimensions(String numberOfDimensions) {
		this.numberOfDimensions = numberOfDimensions;
	}

}
