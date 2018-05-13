/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Pulling float variables from another package
 * Question: Q11. Write a program that would access
 * two float-variables from a class that exists in
 * another package. Note, you will need to create two
 * packages to demonstrate the solution.
**************************************************/


package com.revature.corejavaassignment;
import com.revature.Q11outerpackage.Q11FloatOuterClass;

public class Q11Float {

	public static void main(String[] args) {
		checkFloat();

	}
	
	public static boolean checkFloat() {
		// instantiate the outer class from another package
		Q11FloatOuterClass num = new Q11FloatOuterClass();
		System.out.println(num.number1); // display the float numbers
		System.out.println(num.number2); // display the float numbers
		
		return true;
		
	}

}
