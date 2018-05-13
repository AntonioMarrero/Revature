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
import revature.driver.BankDriver;

public class Register {
	
	static Scanner scan = new Scanner(System.in);
	
	// Method for user to register into the application
	// and be added to the DB.
	public void register() {
		ClientDAOImp cdao = new ClientDAOImp();
				
		
		String[] clientData = new String[4];
				
		for(int i =0;i<4;i++) {
		
			switch(i) {
			case 0: System.out.println("Please enter Username");
				break;
			case 1: System.out.println("Please enter First Name");
				break;
			case 2: System.out.println("Please enter Last Name");
				break;
			case 3: System.out.println("Please enter Password");
				break;
			}
			
			clientData[i] = scan.nextLine().trim();
		}
		
		for(int i =0;i<4;i++) 
			
			System.out.print(clientData[i] + "||");
			cdao.addClient(clientData);
			
		
			System.out.println("\nPress Enter");
			scan.nextLine();
			BankDriver.mainScreen(); // Returns to the main screen menu.
			
	}
}
