package com.revature.demos.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) {
		Student stu = new Student(321654, "Veronica", "Thompson", 23);

		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(stu);
			oos.close();
			fos.close();
			System.out.println("We're done serializing Veronica!");

		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
