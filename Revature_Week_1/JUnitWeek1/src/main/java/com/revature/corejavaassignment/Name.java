package com.revature.corejavaassignment;

import java.util.Comparator;

public class Name implements Comparator<Employee> {

	
	public int compare(Employee e1, Employee e2) {
		
		int name = e1.getName().compareTo(e2.getName());
		
		return name;
	}

}
