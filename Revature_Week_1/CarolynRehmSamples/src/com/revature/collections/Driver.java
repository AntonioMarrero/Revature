package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		
		Integer[] iArr = {1,2,3,4,5};
		Character[] cArr = {'h','e','l','l','o'};
		
//		printMe(iArr);
//		printMe(cArr);
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("test");
//		Integer i = (Integer)arrList.get(0);
		
		
		LinkedHashSet<Integer> hSet = new LinkedHashSet<Integer>();
		hSet.add(9);
		hSet.add(4);
		hSet.add(3);
		hSet.add(5);
		hSet.add(4);
		//System.out.println(hSet);
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(9);
		tSet.add(4);
		tSet.add(3);
		tSet.add(5);
		//System.out.println(tSet);
		
		TreeSet<String> sSet= new TreeSet<String>();
		sSet.add("alpha");
		sSet.add("charlie");
		sSet.add("bravo");
		//System.out.println(sSet);
		
		LinkedHashSet<Student> studentSet = new LinkedHashSet<Student>();
		studentSet.add(new Student("Veronica","5555555555"));
		studentSet.add(new Student("Paul","7328653487"));
		studentSet.add(new Student("Jose","4585455645"));
		studentSet.add(new Student("Cool Guy","4564554855"));
		for(Student s : studentSet) {
			//System.out.println(s.getName());
		}
		
		TreeSet<Student> studentTreeSet = new TreeSet<Student>();
		studentTreeSet.add(new Student("Veronica","5555555555",24));
		studentTreeSet.add(new Student("Paul","7328653487",21));
		studentTreeSet.add(new Student("Jose","4585455645",18));
		studentTreeSet.add(new Student("Cool Guy","4564554855",27));
		for(Student s : studentTreeSet) {
			//System.out.println(s.toString());
		}
		
		LinkedList<Student> studentList = new LinkedList<Student>();
		studentList.add(new Student("Veronica","5555555555",24));
		studentList.add(new Student("Paul","7328653487",21));
		studentList.add(new Student("Jose","4585455645",18));
		studentList.add(new Student("Cool Guy","4564554855",27));
		CompareDemDigits compareDemDigits = new CompareDemDigits();
		Collections.sort(studentList, compareDemDigits);
		for(Student s : studentList) {
			System.out.println(s.toString());
		}
		
		
	}

	//dealing with different data types require us to overload our method
//	public static void printMe(Integer[] arr) {
//		
//		for(Integer i : arr) {
//			System.out.println(i);
//		}
//		
//	}
//	
//	public static void printMe(Character[] arr) {
//		for(Character i : arr) {
//			System.out.println(i);
//		}
//	}
	
	//using generics reduces the need for that 
	public static <T> void printMe(T[] arr) {
		for(T i: arr) {
			System.out.println(i);
		}
	}
	
	
	
	
}
