package com.revature.corejavaassignment;

public class Q15MainDriver extends Q15Methods {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 2;
		
		Q15Methods results = new Q15Methods();
		
		System.out.println("Test Results are: ");
		System.out.println("------------------" + "\n");
		
		System.out.println(results.addition(7, 6));
		System.out.println(results.substraction(4, 3));
		System.out.println(results.multiplication(a, b));
		System.out.println(results.division(a, b));

	}

}
