package com.revature.corejavaassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q7EmployeeCase {
	
	public static void main(String[] args) {
		employeeMain();
	}	
		public static void employeeMain () {
			ArrayList<Employee> myArr = new ArrayList<Employee>();
			Employee e = new Employee("Luis", "Sales", 34);
			myArr.add(e);
			Employee e1 = new Employee("Veronica", "Manager", 29);
			myArr.add(e1);
			
			Name n = new Name();
			Age a = new Age();
			Department d = new Department();
			
			Collections.sort(myArr, n);
			System.out.println(myArr);
			Collections.sort(myArr, a);
			System.out.println(myArr);
			Collections.sort(myArr, d);
			System.out.println(myArr);
		}
		
}

