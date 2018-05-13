/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Display Triangle on the Console using a loop
 * Question: Q13. Display the triangle on the console
 *  as follows using any type of loop.  Do NOT use a
 *  simple group of print statements to accomplish this.
 *   0
 *   1 0
 *   0 1 0
 *   1 0 1 0
****************************************************/


package com.revature.corejavaassignment;

public class Q13Triangle {

	public static void main(String[] args) {
		// calls myTriangleConsole() method
		myTriangleConsole();
	}
	
	public static void myTriangleConsole() {
		// set my iterations to 5 
		for(int i = 0; i < 5; i++) {
			int num = i;
			
			// the loop will continue if j is less then i
			// and will check if the i is divisible by 2
			// and not 0 to print a "0" otherwise it will
			// print a "1"
			for(int j = 0; j < i; j++) {
				if(num%2 != 0) {
					System.out.print("0");
			} else {
				System.out.print("1");
			}
				num++;
			}
			System.out.println(" ");
		}
	}

}