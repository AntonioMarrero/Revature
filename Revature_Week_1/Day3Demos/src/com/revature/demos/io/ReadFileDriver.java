package com.revature.demos.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDriver {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedReader br2 = null;
		String path = "C:\\Users\\Revature\\my_git_repos\\1803-MAR26-Java\\Week 1 - Core Java\\"
				+ "Day3Demos\\src\\com\\revature\\demos\\io\\data\\io_read_demo";


		// Reading from a file: Using readLine()
		try {
			br = new BufferedReader(new FileReader(path));
			System.out.println("Reading the file using the readLine() method:");
			String line = br.readLine();

			// read the file until there are no more lines
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("--------------------------------------------------------");

		// Reading from a file: Using read()
		try {
			br2 = new BufferedReader(new FileReader(path));

			System.out.println("Reading the file using the read() method:");

			int val = 0;
			char myChar;

			// read the file until the end of the file
			while((val = br2.read()) != -1) {
				myChar = (char) val;
				if(myChar == '\n') { System.out.println(); }
				System.out.print(myChar);
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
