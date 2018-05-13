package com.revature.demos.oopfun.models;

import static java.lang.Math.*;

public class Circle extends Shape {

	private double radius;
	private double circumference;

	public Circle() {
		super("Infinity", 2);
		this.radius = 1.0;

		// Since we have included a static import for java.lang.Math.*, we have access
		// to all of the static members of the java.lang.Math class - which includes
		// the final member PI.
		this.circumference = 2 * PI * radius;
	}

	public Circle(double radius) {
		super("Infinity", 2);
		this.radius = radius;
		this.circumference = 2 * PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

}
