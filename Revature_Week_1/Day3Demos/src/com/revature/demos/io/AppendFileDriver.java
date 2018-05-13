package com.revature.demos.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDriver {

	public static void main(String[] args) {

		String path = "C:\\Users\\Revature\\my_git_repos\\1803-MAR26-Java\\Week 1 - Core Java\\"
				+ "Day3Demos\\src\\com\\revature\\demos\\io\\data\\io_write_demo";

		try {

			String content = "\nThis is my content. It will be written to an existing"
					+ " file, but not override it!";

			// Specify our target file location
			File file = new File(path);

			if(!file.exists()) {
				file.createNewFile();
			}

			// The second parameter in the FileWriter constructor indicates whether or not we will
			// be appending to the file, or overwriting it completely.
			//
			// true = append
			// false = overwrite
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("File successfully appended to!");

			bw.write(content);

			bw.close();

		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
