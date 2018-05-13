package com.revature.demo;

public class ScopeDriver {
	
//	public static int x = 0;
//	
//	public static void main(String[] args) {
//		System.out.println(x);
//		System.out.println(changeX(x));
//		System.out.println(x);
//	}
//	
//	private static int changeX(int x) {
//		return ++x;
//	}
	
	
	
	private static int myOuterInt = 9;
	
	// myInnerInt is not visible to us! So we cannot access it.
	public int getMyInnerInt() {
		//return myInnerInt;
		return 0;
	}
	
	class SomeClass {
		// NONE OF THESE ARE VISIBLE TO OUT OUTER CLASS
//		private int myInnerInt = 6;
//		protected int myInnerInt = 6;
//		public int myInnerInt = 6;
		
		public int getMyOuterInt() {
			return myOuterInt;
		}
	}

}
