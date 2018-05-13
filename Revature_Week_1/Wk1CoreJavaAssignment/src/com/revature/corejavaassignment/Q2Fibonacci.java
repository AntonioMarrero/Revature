/*******************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Fibonacci Number Sequence
 * Question: Q2. Write a program to display
 * the first 25 Fibonacci numbers beginning at 0.
********************************************/
package com.revature.corejavaassignment;

public class Q2Fibonacci {

	public static void main(String[] args) {
		// calls the getFibonacciNumbers method using the values on the arguments.
		getFibonacciNumbers(25, 0, 1);
	}// end main
	
	public static int getFibonacciNumbers(int limit, int num1, int num2) {
		// initialized num as zero
		int num = 0;
		System.out.println(0);
		System.out.println(1);
		for(int i = 2; i < limit; ++i) {
	
			num = num2 + num1;
			num1 = num2;
			num2 =  num;
			System.out.println(num + " ");
		}
		return num;
	}// end getFibonacciNumbers

}// end class
