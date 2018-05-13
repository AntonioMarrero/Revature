package com.revature.bankingapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Update {
	
	// Path to the Bank.txt where the user information will be stored
	static String path1 = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\"
			+ "Antonio_Marrero_Code\\Revature_Week_1\\BankingApp\\Bank.txt";
	
	// Path to the temporary file to store the non matching user name while it updates the information
	// on the Bank.txt
	static String path2 = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\"
			+ "Antonio_Marrero_Code\\Revature_Week_1\\BankingApp\\Temp.txt";
	
	public void save(Customer client) {
		// Buffered writer
		BufferedWriter bw;
		
		// array splitter
		String[] splitter = null;
		
		//Need to read main Bank.txt file and write to temporary file
		try {
			// set the path of the files calling the path from the static declaration above
			File inputFile = new File(path1);
			File tempFile = new File(path2);
			
			// set the buffered readers to read and write to the input and temp file
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(tempFile));
			
			//Gets the user line that needs to be updated
			String update = client.getUserName(); // gets the username of the client
			String line;
			
			while((line = br.readLine()) != null) {
				//Split string for username
				splitter = line.split(":");
				
				//If line to be updated is found, skip writing it to temp file
				if(splitter[0].equals(update)) continue;
				
				//Write non-updated lines to temp file
				bw2.write(line + System.getProperty("line.separator"));
				}
			
			bw2.close(); 
			br.close();
			
			//If old file is not allowed to be deleted, print error
			if (!inputFile.delete()) {
				System.out.println("Problem deleting old file.");
	        return;
	        }
			
			//Make Temp.txt new Bank.txt
			tempFile.renameTo(inputFile);
			
			File file = new File(path1);
			
			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(client.toString());
			bw.close();
			
		} catch (IOException ie) {
			ie.printStackTrace();
			}
	}
}
