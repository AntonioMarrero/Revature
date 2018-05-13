package com.revature.demos.scopes;

public class ScopeDriver {

	public static int x = 0;

	// Demonstrating that Java is PASS-BY-VALUE
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(changeX(x));
		System.out.println(x);
		x = changeX(x);	// this is how we can capture the changes done in our method with our original variable
	}

	public static int changeX(int x) {
		return ++x;
	}

	private static int myOuterInt = 9;

	// myInnerInt is not visible to us! So we cannot access it.
	public int getMyInnerInt(int myInnerInt) {
		return myInnerInt;
		/*return 0;*/
	}

	class SomeClass {
		// NONE OF THESE ARE VISIBLE TO OUR OUTER CLASS
		//private int myInnerInt = 6;
		//protected int myInnerInt = 4;
		//public int myInnerInt = 5;

		public int getMyOuterInt() {
			return myOuterInt;
		}
	}

}
