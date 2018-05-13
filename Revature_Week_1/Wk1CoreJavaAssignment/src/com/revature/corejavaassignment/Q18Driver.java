package com.revature.corejavaassignment;

public class Q18Driver {

	public static void main(String[] args) {
		
		Q18Convertion conv = new Q18Convertion();
		
		if(conv.upperCase("hello")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		System.out.println(conv.lowerUpper("tom"));
		
		conv.stringToInt("908675");

	}

}
