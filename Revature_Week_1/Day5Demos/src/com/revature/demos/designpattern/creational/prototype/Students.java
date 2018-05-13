package com.revature.demos.designpattern.creational.prototype;

import java.util.ArrayList;

public class Students implements Cloneable {
	
	private ArrayList<String> studentList;
	
	public Students() {
		studentList = new ArrayList<String>();
	}
	
	/*
	 * We will use this constructor to build the copy of our Students class in the
	 * overridden clone() method.
	 */
	public Students(ArrayList<String> list) {
		this.studentList = list;
	}
	
	public void loadData() {
		studentList.add("Thomas");
		studentList.add("Sean");
		studentList.add("Nathan");
		studentList.add("Ihsan");
		studentList.add("Shujin");
		studentList.add("Veronica");
	}
	
	public ArrayList<String> getStudentList() {
		return studentList;
	}
	
	/*
	 * In order to clone an object, we need to override the Object class's implementation of
	 * clone() to ensure that a true clone of our object is made.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		ArrayList<String> temp = new ArrayList<String>();
		
		for(String student : this.getStudentList()) {
			temp.add(student);
		}
		
		return new Students(temp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (studentList == null) {
			if (other.studentList != null)
				return false;
		} else if (!studentList.equals(other.studentList))
			return false;
		return true;
	}
	
	

}
