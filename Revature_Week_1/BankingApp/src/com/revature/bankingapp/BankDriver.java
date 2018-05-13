package com.revature.bankingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

// my main class
public class BankDriver {
	
	public static void main(String[] args) {
		
		// calls the mainScreen() i.e. Menu
		mainScreen();
	}
	
	// this method execute the menu screen
	public static void mainScreen() {
		
		Register registerBW = new Register();
		Login logIn = new Login();
		int run = 0;
		// Display a menu for the user to make a choice
		System.out.println("1. Log In");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		
		// creates a new scanner
		Scanner scan = new Scanner(System.in);
		
		// try to get the input from the user
		try {
			run = scan.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Invalid input. Try again!");
			mainScreen();
		}
		
		// takes the input and match it to a choice from the a case
		// then send the user to a perspective method to execute
		switch(run) {
		case 1: logIn.logIn();
			break;
		case 2: registerBW.register();
			break;
		case 3: return;
			default:
			System.out.println("Input invalid. Please choose between 1 and 3.");
			// sends user back to the beginning of the application main menu
			mainScreen();
		}
		scan.close();
	}

}
