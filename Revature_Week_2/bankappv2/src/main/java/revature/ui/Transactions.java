/*********************************************************************** 
Program Name: Bank App v2
Author: Antonio Marrero Bonilla
Contributors: Zachary Vaughn, Dennis Park
Company: Revature
Week Iteration: Week 2
Program Description: Bank application where the user can register,
login and perform transactions with their money such as: deposit,
withdrawals, and check balances. Requirements for users to register
are to provide a username and password. 
***********************************************************************/

package revature.ui;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import revature.dao.UserAcctDAO;
import revature.dao.UserAcctDAOImp;
import revature.driver.BankDriver;
import revature.pojo.UserAcct;

public class Transactions {
	
		static Scanner scan = new Scanner(System.in);
		
	// This method perform all the transactions of withdrawal, deposit and check balance
	public static void transaction(int id) {
		
		
		
		int input = 0;
		
		// Menu for user to enter their choice of transaction
		System.out.println("\nEnter a number form the menu to star"
		+ "start a transaction");
		System.out.println("1. Check Balance");
		System.out.println("2. Widthdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. LogOut");
		
		while (!scan.hasNextInt()) {
			
			System.out.println("Error: That's not a valid input.");
		    scan.next();
		    transaction(id);
		    
		}
		
		
		// Tries the user input to make sure is a valid input
		try {
			
			input = scan.nextInt();
			
		} catch (InputMismatchException ime) {
			
			System.out.println("Input invalid. Try again");
			transaction(id);
			
		}
		
		// Switch statement for the choices for a transaction
		switch(input) {
			case 1: checkBalance(id); // Takes the user to the checkBalance() method
				break;
			case 2: withDrawal(id); // Takes user to the withDraw() method
				break;
			case 3: deposit(id); // Takes user to the deposit() method
				break;
			case 4: BankDriver.mainScreen(); // Returns the user to the main screen
				break;
			default:
				
			System.out.println("Invalid choice, please choose between 1 and 4");
			transaction(id);
		}
		
	}
	
	// Allows the user to check their balance
	public static void checkBalance(int id) {
		
		UserAcctDAO acctDao = new UserAcctDAOImp();
				
		UserAcct userAcct = acctDao.getBalanceById(id); // Gets the user current balance.

		DecimalFormat format = new DecimalFormat("#0.00"); // Formats the balance value to currency format.
		
		System.out.println("$" + format.format(userAcct.getBalance())); // Prints the balance with the currency format.
		
		// Returns the user to the transaction menu.
		Transactions.transaction(id);
		
	}
	
	public static void withDrawal(int id) {
		
		UserAcctDAO acctDao = new UserAcctDAOImp();
		
		// New scanner for input.
		System.out.println("Please enter the amount you wish to withdraw:\n");
		
		// Variables to hold the scanned values,
		// the old and new balances to be calculated.
		double wd = 0;
		double newBalance;
		double oldBalance;
		
	while (!scan.hasNextDouble()) {
			
			System.out.println("Error: That's not a valid input.\n");
		    scan.next();
		    withDrawal(id);
		    
		}
		
	try {
		// Scan for input and assign the value to wd as withdrawal values.
		scan.nextDouble();
		wd = scan.nextDouble();
		
		} catch(InputMismatchException ime) {
			
			withDrawal(id);
			
	}
		// Gets the current balance from the DB.
		UserAcct userAcct = acctDao.getBalanceById(id);
		
		// Calculates the new balance to pass it to the UserAcctDAOImp for update.
		oldBalance = userAcct.getBalance();
		
			newBalance = oldBalance - wd;
			
			if(newBalance >= 0) {
				
			userAcct.setBalance(newBalance);
		
			System.out.println("Updating.....");
		
			// Passes the userAcct newBalance values for update.
			UserAcct newBlnc = acctDao.updateBalance(userAcct);
	
			// Returns the user to the transaction menu.
			Transactions.transaction(id);
		
		} else {
			
			// If the user has $0.00 it will print the message and return to the transaction menu.
			System.out.println("Not enough funds for a withdrawal transaction.");
			// Returns the user to the transaction menu.
			Transactions.transaction(id);
		
		}
			// Returns the user to the transaction menu.
			Transactions.transaction(id);
		
	}
	
	public static void deposit(int id) {
		UserAcctDAO acctDao = new UserAcctDAOImp();
		
		// Variables
		double dp = 0;
		double newBalance;
		double oldBalance;
		
		System.out.println("Please enter the amount you wish to deposit:\n");
		
	while (!scan.hasNextDouble()) {
			
			System.out.println("Error: That's not a valid input.");
		    scan.next();
		    deposit(id);
		    
		}
		
		
		
		try {
			
		// Scanner for user input and assign
		scan.nextDouble();
		dp = scan.nextDouble();
		
		} catch (InputMismatchException ime) {
			
			deposit(id);
		}
		
		UserAcct userAcct = acctDao.getBalanceById(id);  // Gets the current balance
		
		// Perform the calculation to get the new balance.
		oldBalance = userAcct.getBalance();
		newBalance = oldBalance + dp;
		userAcct.setBalance(newBalance);
		
		System.out.println("Updating....."); // Filler..
				
		UserAcct newBlnc = acctDao.updateBalance(userAcct);
		
		// Sends user to the transaction menu.
		Transactions.transaction(id);
	}
}
