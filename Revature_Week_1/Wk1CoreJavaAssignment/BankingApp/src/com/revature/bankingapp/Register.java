package com.revature.bankingapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Register {
	// creates a static path declaration for the file holding the clients information
	static String path = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\Antonio_Marrero_Code\\"
			+ "Revature_Week_1\\Wk1CoreJavaAssignment\\BankingApp\\Bank.txt";

	// method to register the user in to the application
	public void register() {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw;
		Customer cs;
		String newUserName = " ";
		boolean exist = false;
		String[] splitter = null;
		System.out.println("Enter UserName!");
		newUserName = scan.nextLine();
		BufferedReader br = null;
		Transactions trans = new Transactions();
		
		try {
			// new bufferedreader to read the file in the path
			br = new BufferedReader(new FileReader(path));
			String read = br.readLine();
			// loops while the file has not null
				while(read!=null) {
					splitter = read.split(":");
					// if the username is on the first part of the split array before the colon
					// sets the exist to true
					if(newUserName.equals(splitter[0])) {
						System.out.println("Username already exist.");
						exist = true;
					}
					
					read = br.readLine();
				}
				br.close();
				
				// if the user does not exist it will create a new user and 
				// assigns a balance of $00.00
				if(exist == false) {
					
					cs = new Customer(newUserName, 0);
					File file = new File(path);
					FileWriter fw = new FileWriter(file, true);
					bw = new BufferedWriter(fw);
					bw.write("\n" + cs.toString());
					trans.transaction(cs);
					bw.close();
				}
				
			} catch (IOException ie) {
				ie.printStackTrace();
		} finally {
//			scan.close();
		}
	}
}
