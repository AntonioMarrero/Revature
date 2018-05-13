package com.revature.demos.io;

import java.io.Serializable;

/*
 * This is an example of a very common design pattern in Java:
 * 		The Java Bean Design Pattern
 * 
 * It is also, more commonly, referred to as a POJO (Plain Old Java Object)
 * 
 * This design pattern is characterized by:
 * 		- private instance fields
 * 		- public getters and setters used to access and mutate our private instance fields
 * 		- a no-args constructor and a fully parameterized constructor
 * 		- overridden equals()
 * 		- overridden hashCode()
 * 		- overridden toString()
 * 
 * This is how you should almost always be structuring your data models!
 */

/* 
 * Serializable is a maker interface, which means it has no methods (abstract or default)
 * in it at all. Its purpose is to act as a note for the JVM, so it knows what the objects
 * of this class may be used for.
 */ 
public class Student implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private int studentId;
	private String firstName;
	private String lastName;
	
	// the 'transient' keyword lets the JVM know to NOT serialize this member
	private transient int studentAge;
	
	
	// no args-constructor
	public Student() {
		
	}
	
	// fully parameterized constructor
	public Student(int studentId, String firstName, String lastName, int studentAge) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", studentAge=" + studentAge + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + studentAge;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (studentAge != other.studentAge)
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}

}
