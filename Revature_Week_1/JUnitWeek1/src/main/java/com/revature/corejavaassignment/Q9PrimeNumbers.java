/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Prime Numbers
 * Question: Q9. Create an ArrayList which stores
 * numbers from 1 to 100 and prints out all the prime
 * numbers to the console.
**************************************************/

package com.revature.corejavaassignment;

import java.util.ArrayList;

	public class Q9PrimeNumbers {
		
		public static void main(String[] args) {
			
			// calls myPrimeNumbers() method
			myPrimeNumbers();
	}
		public static ArrayList<Integer> myPrimeNumbers() {
			// Create a list array to store the prime numbers
	        ArrayList<Integer> primeList = new ArrayList<Integer>();
	        
			for (int index = 2; index < 100; index++)
	        {
	        	// initially true
	            boolean prime = true; 

	            // checks for every number that can factor into the index number
	            for (int i = 2; i < index; i++) 
	                // check if a number is found that factors into it, it's not prime
	                if (index%i == 0) prime = false; 
	            // if this current index number is prime it will print the number out
	            if (prime) 
	            {
	                System.out.print (index + " "); 
	                // add the prime number to the List
	                primeList.add(index); 
	            }// end if
	        }// end for
			return primeList;
		}// end myPrimeNumbers()
}// end class

