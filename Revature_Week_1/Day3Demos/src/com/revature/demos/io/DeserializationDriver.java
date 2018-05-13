package com.revature.demos.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {

	public static void main(String[] args) {

		Student stu = null;

		try {

			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			stu = (Student) ois.readObject();

			ois.close();
			fis.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(stu.toString());
	}

}
