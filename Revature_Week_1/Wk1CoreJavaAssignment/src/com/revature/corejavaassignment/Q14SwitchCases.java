package com.revature.corejavaassignment;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Q14SwitchCases {
	
	static double root;
	static String str;
	static int selection;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Please enter 1 for square root");
		System.out.println("Enter 2 for Today's Date");
		System.out.println("Enter 3 for Splitting I am Learning Java String");
		
		selection = scan.nextInt();
		
		if(selection <= 3) {
			// switch case for the user to make a selection
			switch(selection) {
				case 1: System.out.println("Enter a number to get Square Root");
					findSquareRoot();
					break;
				case 2: todaysDate();
					break;
				case 3: splitMyString(str);
					break;
			}
		} else {
			System.out.println("Please enter a selection number bewteen 1 and 3.");
		}
	}	
	

	// find the square root of the number the 
	// user input in the console
	public static void findSquareRoot () {
	
		double root = scan.nextDouble();
		scan.close();
		double root1 = Math.sqrt(root);
		System.out.println("The square root of " + root + " is: " + root1);
	}
	
	// simply gets todays date
	public static void todaysDate() {
		Date dnow = new Date();
		System.out.println("Today's Date is: " + dnow.toString().substring(0, 11) + dnow.toString().substring(24));
	}
	
	// split the string "I am learning Core Java
	public static void splitMyString(String str) {
		str = "I am learning Core Java";
		String[] arr = str.split(" ");
		List<String> myList = Arrays.asList(arr);
		System.out.println(myList);		
	}
	
	
}
