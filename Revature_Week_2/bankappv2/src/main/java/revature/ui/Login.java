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

import java.util.Scanner;

import revature.dao.ClientDAOImp;
import revature.pojo.Client;

public class Login {
	
	static Scanner scan = new Scanner(System.in);
	
	// Method for the user to Log in the application.
	public void logIn() {
		
		ClientDAOImp cdao = new ClientDAOImp();
		
		// Variables to hold the username and password.
		String un = new String();
		String pw = new String();
				
		System.out.println("Please enter your Username!");
			// User userName input.
			un = scan.nextLine();
		
		System.out.println("Please enter your Password!");
			// User password input.
			pw = scan.nextLine();
			
		// Send input to the loginByUserName method		
		Client test = cdao.loginByUserName(un, pw);
		
		if(test!=null) {
			
			// Testing to see if returns the right User Id to continue 
			// to transactions.
			System.out.println();
//			System.out.println("Your userId is: " + test.getAcctId());
			System.out.println("Welcome " + test.getFirstName());
			
			// Sends the User to the Transaction Menu
			Transactions.transaction(test.getAcctId());
			
		} else {
			
			// If wrong credentials were enter.
			System.out.println("Wrong Username and/or Password.");
			System.out.println("\nPlease Check Your Credentials Carefully.\n");
			
			// Returns the user to the login menu.
			logIn();
		}
		
	}
	
}
