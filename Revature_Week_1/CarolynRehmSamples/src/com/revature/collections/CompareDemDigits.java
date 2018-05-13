package com.revature.collections;

import java.util.Comparator;

public class CompareDemDigits implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		return s1.getDemDigits().compareTo(s2.getDemDigits());
	}

}
