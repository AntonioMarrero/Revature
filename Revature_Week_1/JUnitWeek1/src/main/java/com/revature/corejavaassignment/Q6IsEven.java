/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Even Integer
 * Question: Q6. Write a program to determine if 
 * an integer is even without using the modulus operator (%)
**************************************************/

package com.revature.corejavaassignment;
import java.util.Scanner;

public class Q6IsEven {
    

	
		
	public static void main(String[] args) {
		

		checkEven(6);
		checkEven(7);
		
	}//end main()
	
	public static boolean checkEven (int test) {
		
		int number = 0;
		
		number = test/2;
		
		if(number*2 == test) {
			System.out.println("It's even");
			return true;
		} else {
			System.out.println("It's odd");
		}
		return false;
		
	}	

}//end class
