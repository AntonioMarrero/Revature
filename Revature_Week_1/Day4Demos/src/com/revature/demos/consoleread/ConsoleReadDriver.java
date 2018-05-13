package com.revature.demos.consoleread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReadDriver {
	
	public static void main(String[] args) {
		
		System.out.println("First, let's try reading from the console using the BufferedReader class.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		
		System.out.print("Enter a string: ");
		try {
			userInput = reader.readLine();
		} catch (IOException e) {
			userInput = "Invalid input!";
			e.printStackTrace();
			main(args); // go back to beginning of our main method
		}
		
		System.out.println(userInput);
		
		System.out.println("+---------------------------------+");
		
		System.out.println("Now let's work on reading from the console using the Scanner class.");

		Scanner scan = new Scanner(System.in);
		
		String value = scan.nextLine();
		System.out.println(value);
		
		try {
			int myInt = scan.nextInt();
			System.out.println(myInt);
		} catch (Exception e) {
			main(args);
		}
			
		float myFloat = scan.nextFloat();
		System.out.println(myFloat);
	}

}
