package com.revature.bankingapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	// login method where user login using their username
	public void logIn() {
		// login variables
		Scanner scan = new Scanner(System.in);
		Customer cs;
		String newUserName;
		boolean exist = false;
		String[] splitter = null;
		// Ask the user to enter their username
		System.out.println("Enter UserName!");
		// moves to the next line
		newUserName = scan.nextLine();
		double balance = 0;
		BufferedReader br;
		
		try {
			// path for the bank text where the client  information is stored
			String path = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\Antonio_Marrero_Code\\"
					+ "Revature_Week_1\\Wk1CoreJavaAssignment\\BankingApp\\Bank.txt";
			
			// bufferedreader to read the file declared on the file path
			br = new BufferedReader(new FileReader(path));
			String read = br.readLine();
			
			// loop to read the file lines and split the array data
				while(read!=null) {
					splitter = read.split(":");
					
					if(newUserName.equals(splitter[0])) {
						newUserName = splitter[0];
						balance = Double.parseDouble(splitter[1]);
						exist = true;
					}
					
					read = br.readLine();
				}
				br.close();
				
				// if the account exist gets the customer info
				// and goes to the transaction method
				// otherwise it will send to mainscreen
				if(exist == true) {
					cs = new Customer(newUserName, balance);
					Transactions trans = new Transactions();
					trans.transaction(cs);
				} else {
					System.out.println("Account does not exist!");
					BankDriver.mainScreen();
				}
				
			} catch (IOException ie) {
				ie.printStackTrace();
		} finally {
			scan.close();
		}
	}

}
