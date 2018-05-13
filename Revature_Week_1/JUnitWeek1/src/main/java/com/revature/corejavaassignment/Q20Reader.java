package com.revature.corejavaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Q20Reader {
	
	public void q20Reader() {
		String path = "C:\\Users\\gamin\\my_git_repos\\1803-MAR26-Java\\"
				+ "Antonio_Marrero_Code\\Revature_Week_1\\Wk1CoreJavaAssignment\\"
				+ "src\\com\\revature\\corejavaassignment\\data.txt";
		
		BufferedWriter bw;
		
		String[] splitter = null;
		
		String Mickey = "Mickey";
		
		File file = new File(path);
		
		
		
		
		//Need to read main Bank.txt file and write to temporary file
		try {
			
			File noteFile = new File(path);
			
			BufferedReader br = new BufferedReader(new FileReader(noteFile));
			
			
			String line = br.readLine();
			
			while(line != null) {
				
				splitter = line.split(":");
				
				if (splitter[0].equals(Mickey)) 
				{							
					System.out.println("First Name:" + splitter[0]);
					
					System.out.println("Age:" + splitter[2]);
					System.out.println("State:" + splitter[3]);
					line = br.readLine();				
				}
				//If line to be updated is found, skip writing it to temp file
			}			
		}
				 
			 catch (IOException ioe) {
				 ioe.printStackTrace();			 
			 }		
		}
}
