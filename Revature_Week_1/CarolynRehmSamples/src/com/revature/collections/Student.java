package com.revature.collections;

public class Student implements Comparable<Student>{
	
	private String name;
	private String demDigits;
	private int age;


	public Student() {
		super();
	}

	public Student(String name, String demDigits) {
		this.name = name;
		this.demDigits = demDigits;
	}
	
	public Student(String name, String demDigits, int age) {
		this.name = name;
		this.demDigits = demDigits;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDemDigits() {
		return demDigits;
	}

	public void setDemDigits(String demDigits) {
		this.demDigits = demDigits;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", demDigits=" + demDigits + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student studentParam) {
		//return this.getName().compareTo(studentParam.getName());
		return this.getAge() - studentParam.getAge();
	}
	
	
	
}
