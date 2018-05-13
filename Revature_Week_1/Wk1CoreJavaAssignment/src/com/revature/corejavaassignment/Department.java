package com.revature.corejavaassignment;

import java.util.Comparator;

public class Department implements Comparator<Employee> {

	
	public int compare(Employee e1, Employee e2) {
		// compare the department between employee 1
		// and employee 2
		int department = e1.getDepartment().compareTo(e2.getDepartment());
		
		return department;
	}
	
}
