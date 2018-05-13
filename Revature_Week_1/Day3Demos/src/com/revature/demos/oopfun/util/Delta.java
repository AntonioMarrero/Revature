package com.revature.demos.oopfun.util;

import com.revature.demos.oopfun.models.Beta;
import com.revature.demos.oopfun.models.Circle;

public class Delta extends Beta {

	// This works! Because protected methods are inherited by all subclasses,
	// even if they are located in different packages.
	@Override
	public double protectedDoubleGetter() {
		return super.myProtectedDouble;
	}

	// Methods with package visibility are not inherited by subclasses located
	// in different packages!
	//		@Override
	//		String packageStringGetter() {
	//			return "Even super.myPackageString is inaccessible!";
	//		}

	// This works: 
	//		- visibility of overridden methods can only be increased
	//		- thrown exceptions can only be more specific
	@Override
	public String protectedStringThrowsException() throws RuntimeException {
		return "Successfully overridden!";
	}

	// This works! We can override a method by changing the return type of the
	// method signature, but only if the new return type is a subclass of the
	// original return type.
	@Override
	public Circle getMyPrivateShape() {
		return new Circle();
	}

	// This does not work, because we are trying to override the method by using
	// a super class of the return type, which is not allowed.
	//		@Override
	//		public Shape getMyPrivateCircle() {
	//			return new Shape();
	//		}

}
