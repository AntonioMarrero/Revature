/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: A program to compute N factorial.
 * Factorial of n is the product of all positive descending integers
 * To determine the factorial number use this example:
 * 4! = 4*3*2*1 = 24  
 * 5! = 5*4*3*2*1 = 120
 * Question: Q4. Write a program to compute N factorial.
**************************************************/

package com.revature.corejavaassignment;

public class Q4Factorial {

	public static void main(String[] args) {
		
		getFactorial(4);

	}//end main
	
	public static int getFactorial(int factor) {
		int i; //iteration variable
		int number = 4; //number to be factored.
		
		for(i = 1; i <= number; i++) {
			factor =  factor * i;
		}//end for
		
		System.out.println("The Factorial of " 
		+ number + " is: " + factor);
		return factor;
		
	}

}//end class
