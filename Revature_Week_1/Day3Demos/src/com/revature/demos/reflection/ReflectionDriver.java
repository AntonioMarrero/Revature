package com.revature.demos.reflection;

import java.lang.reflect.Field;

public class ReflectionDriver {

	public static void main(String[] args) {
		String s = "Strings are ALWAYS immutable, right?";

		Class<String> stringClass = String.class;

		System.out.println("Old value: " + s);

		try {
			// get access the the 'value' attribute of the String class
			Field value = stringClass.getDeclaredField("value");

			// change the accessibility of the 'value' attribute to true
			// BUT WAIT! I thought Strings were immutable...
			// That is how powerful Reflection is!
			//
			// A value of true indicates that the reflected object should 
			// suppress Java language access checking when it is used
			value.setAccessible(true);

			// Change 'value' of a given String object (in this case 's') to equal something else.
			value.set(s, "Mutated!".toCharArray());
			System.out.println("New value: " + s);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		// I sure hope that the above code didn't break anything!
		// Uh oh! This doesn't print what we think it will...
		System.out.println("Strings are ALWAYS immutable, right?");

		// What if we deference the String object
		s = null;

		// Garbage collection should clean it up and fix it for us right?
		System.gc();

		// Eventually...maybe...
		while ("Strings are ALWAYS immutable, right?".equals("Mutated!")) {
			System.out.println("Strings are ALWAYS immutable, right?");
		}

		// Who knows when this will run...
		System.out.println("Finally, it is fixed! See?");
		System.out.println("Strings are ALWAYS immutable, right?");
	}

}
