package com.revature.corejavaassignment;

import java.util.Comparator;

public class Age implements Comparator<Employee> {

	// compare employees age between employee 1
	// and employee 2
	public int compare(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}

}
