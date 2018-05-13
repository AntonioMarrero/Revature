package com.revature.demos.abstraction;

// Interfaces are implicitly abstract (you can add it, but it doesn't change anything)
public interface InterfaceA {
	
	// implicitly public static final (again, you can add it...but why when it is implicit?)
	int MY_INT = 35;

	void doSomething();
	
	default void doSomethingElse() {
		System.out.println("InterfaceA is doing something else...");
	}
}
