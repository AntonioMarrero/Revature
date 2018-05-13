/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Used of For Enhanced Loops
 * Question: Q12. Write a program to store
 * numbers from 1 to 100 in an array. 
 * Print out all the even numbers from the array.
 * Use the enhanced FOR loop for printing out the
 * numbers.
**************************************************/


package com.revature.corejavaassignment;

import java.util.ArrayList;

public class Q12ForEnhanced {

	public static void main(String[] args) {
		getMyEvenNumbers();

	}
	
	public static ArrayList<Integer> getMyEvenNumbers() {
		// create an array list
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		// set my interations to 100 and add to my
		// array list the values
		for(int i = 1; i < 100; i++) {
			myList.add(i);
		}
		
		System.out.println("Here are the even Numbers: " + "\n");
		ArrayList<Integer> myList2 = new ArrayList<Integer>();
		// use a for loop enhanced to get my even 
		// numbers and print them out
		for (int i : myList) {
			if(i%2 == 0) {
			System.out.println(i);
			myList2.add(i);
			}
			
		}
		return myList2;
	}
	}

