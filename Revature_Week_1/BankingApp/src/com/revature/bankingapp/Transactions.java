package com.revature.bankingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Transactions {
	// This method perform all the transactions of withdrawal, deposit and check balance
	public void transaction(Customer client) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		// Menu for user to enter their choice of transaction
		System.out.println("\nEnter a number form the menu to star"
		+ "start a transaction");
		System.out.println("1. Check Balance");
		System.out.println("2. Widthdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		// Tries the user input to make sure is a valid input
		try {
			input = scan.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Input invalid. Try again");
			transaction(client);
		}
		
		// Switch statement for the choices for a transaction
		switch(input) {
		case 1: checkBalance(client); // Takes the user to the checkBalance() method
			break;
		case 2: withDraw(client); // Takes user to the withDraw() method
			break;
		case 3: deposit(client); // Takes user to the deposit() method
			break;
		case 4: BankDriver.mainScreen(); // Returns the user to the main screen
			break;
		default:
			System.out.println("Invalid choice, please choose between 1 and 4");
			transaction(client);
		}
	}
	
	// Allows the user to check their balance
	public void checkBalance(Customer client) {
		System.out.println("Balance: $" + client.getBalance());
		transaction(client);
	}
	
	
	// Allows the user to withdraw money from their account
	public void withDraw(Customer client) {
		Scanner scan = new Scanner(System.in);
		double wd = 0; // money to be taken out by the user
		Update updt = new Update();
		
		
		if(client.getBalance() == 0) {
			System.out.println("You have no money in your balance! ");
			scan.nextLine();
		}
		else {
			try {
				System.out.println("How much would you like to withdraw?");
				wd = Double.parseDouble(scan.nextLine().trim());
			} catch(InputMismatchException ime) {
				withDraw(client);
			}
			
			double balance = client.getBalance() - wd; // calculates the new balance by substracting the withdraw transaction
			updt.save(client); // saves the client information
			
			if(balance > 0) {
				client.setBalance(balance);
				System.out.println("Your balance is: " + client.getBalance());
				
			} else {
				System.out.println("Sorry you dont have enough money!");
			}
		}
//		scan.close();
		transaction(client);
	}
	
	// Allows the user to deposit money to their accounts
	public void deposit(Customer client) {
		double moneyIn = 0; // money to be input by the user
		double balance;
		Scanner scan = new Scanner(System.in);
		Update updt = new Update(); 
		
		System.out.println("How much money do you wish to deposit?");
		
		
		try {
			moneyIn = Double.parseDouble(scan.nextLine().trim());
		} catch(InputMismatchException ime) {
			deposit(client);
		}
		
		balance = client.getBalance() + moneyIn; // calculates the balance adding the moneyIn with the current balance
		client.setBalance(balance); // sets the new balance
		updt.save(client); // updates the file with the save() method
		System.out.println("Balance: $" + balance);
		transaction(client);
//		scan.close();
	}
}
