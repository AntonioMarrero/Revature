package com.revature.demos.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDriver {

	public static void main(String[] args) {

		BufferedWriter bw = null;
		String path = "C:\\Users\\Revature\\my_git_repos\\1803-MAR26-Java\\Week 1 - Core Java\\"
				+ "Day3Demos\\src\\com\\revature\\demos\\io\\data\\io_write_demo";

		try {
			String content = "Write this string to my file!";

			//Specify the file we are writing to
			File file = new File(path);

			// Check to see if the file exists, if it doesn't we will create it
			if(!file.exists()) {
				file.createNewFile();
			}

			// instantiating our BufferedWriter, this is the same as:
			//		bw = new BufferedWriter(new FileWriter(file));
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// Write our content to our file!
			bw.write(content);
			System.out.println("Our file has been written successfully!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
