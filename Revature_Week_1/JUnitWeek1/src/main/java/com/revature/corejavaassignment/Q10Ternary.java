/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Ternary operators comparison
 * Question: Q10. Find the minimum of two numbers using
 * ternary operators.
**************************************************/

package com.revature.corejavaassignment;
import java.util.Scanner;

public class Q10Ternary {
	
	public static void main(String[] args) {
		// calls the calculateMinNumber method
		calculateMinNumbers(8, 9);
	}
	
	public static int calculateMinNumbers(int num1, int num2) {
		// declare variables to be compared & declared the variable for the
		// minimum number
//		int num1;
//		int num2;
		int min; 
		
		// takes the user input and assign it to the variables num1 and num2
//		Scanner in = new Scanner(System.in);
//		
//		try {
//			System.out.println("Type first number.");
//			num1 = in.nextInt();
//			System.out.println("Type second number.");
//			num2 = in.nextInt();
//		} finally {
//			// close the scanner
//			in.close();
//		}	
		
		// compared the two inputed numbers using 
		// ternary operator
		min = num1 < num2 ? num1 : num2;
		
		// prints out the result
		System.out.println("The minimum of the two numbers is: " + min);
		return min;

	}
	
	

}
