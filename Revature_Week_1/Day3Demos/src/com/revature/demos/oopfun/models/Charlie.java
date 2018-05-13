package com.revature.demos.oopfun.models;

import java.io.FileNotFoundException;

public class Charlie extends Beta {

	// 'Variable shadowing'
	//
	// Since Charlie extends Beta, it inherits all of Beta's public and 
	// protected members (fields and methods). However, because the class
	// Charlie declares its own public int named 'myPublicInt', it 'shadows'
	// the super class's variable. Making it more difficult to access, though
	// not impossible. We can access it by declaring a variable of Type Beta
	// using the Charlie class's constructor, and invoking the shadowed variable.
	//
	//		Charlie obj1 = Charlie();
	//		System.out.println(obj1.myPublicInt); // prints out 9
	//
	//		Beta obj2 = Charlie();
	//		System.out.println(obj2.myPublicInt); // prints out 1
	//
	// Also, we can access Beta's shadowed variable by NOT overriding the public
	// getter from Beta that returns 'myPublicInt'.
	// 
	// Additionally, we can refer to it within the Charlie class itself by
	// using the 'super' keyword and a dot operator accessing it:
	//
	//		super.myPublicInt;	// only works within the class declaration
	//
	// VVVVVVVVVVVVVVVVVVVVVVVV
	public int myPublicInt = 9;

	public int shadowGetter() {
		return super.myPublicInt;
	}

	// Uncomment after showing how to access a shadowed variable using an
	// inherited getter that has not been overridden.
	//		@Override
	//		public int publicIntGetter() {
	//			return this.myPublicInt;
	//		}


	// Cannot reduce the visibility of inherited methods
	//		@Override
	//		private double protectedDoubleGetter() {
	//			return super.myProtectedDouble;
	//		}

	// Cannot override inherited final methods
	//		@Override
	//		public final int publicFinalIntGetter() {
	//			return super.MY_PUBLIC_FINAL_INT;
	//		}

	// A super class's private methods are not inheritable, and therefore
	// cannot be overridden.
	//		@Override
	//		private char privateCharGetter() {
	//			return 'x';
	//		}


	// Static methods are not inherited, and therefore cannot be overridden
	//		@Override
	//		public static int publicStaticIntGetter() {
	//			return myPublicStaticInt;
	//		}

	// This is ok! We are increasing the visibility of the inherited method,
	// so this is a valid example of method overriding.
	@Override
	public double protectedDoubleGetter() {
		return super.myProtectedDouble;
	}

	// This is another valid example of method overriding. In the 'throws'
	// clause of our method signature we are able to make the thrown 
	// exception more specific
	@Override
	protected String protectedStringThrowsException() throws FileNotFoundException {
		return "Method overridden.";
	}

	// This is invalid, because we are trying to override the inherited 
	// method by broadening the exception thrown.
	//		@Override
	//		public String publicStringThrowsIOException() throws Exception {
	//			return "Method will not be overridden. We cannot make the thrown exception more broad";
	//		}

}
