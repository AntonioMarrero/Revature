package com.revature.demo;

import java.lang.reflect.Field;

public class ReflectionDriver {
	
	public static void main(String[] args) {
		String s = "String are ALWAYS immutable, right?";
		
		Class<String> stringClass = String.class;
		
		System.out.println("Initial value: " + s);
		
		try {
			//get access to the 'value' members of the String class
			Field value = stringClass.getDeclaredField("value");
			
			// change the accessibility of our 'value' attribute to true
			// a value of true indicates that the reflected object should
			// suppress Java language access checking when it is used
			value.setAccessible(true);
			
			// change 'value' to be something else
			value.set(s, "Mutated.".toCharArray());
			System.out.println("New Value: " + s);
		} catch(NoSuchFieldException e) {
			e.printStackTrace();
		} catch(SecurityException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// I sure hope we didn't break anything
		System.out.println(s);
		System.out.println("Strings are ALWAYS immutable, right?");
		System.out.println("This still prints correctly");
		
		// what if we deference out initial String object, so it can be garbage collected?
		s = null;
		
		// Garbage collection should clean it up and fix it for us?
		System.gc();
		
		while("String are ALWAYS immutable, right?".equals("Mutated")) {
			System.out.println("Strings are ALWAYS immmutable, right?");
		}
		
		System.out.println("Finally fixed! Maybe?");
		System.out.println("String are ALWAYS immutable, right?");
	}

}
