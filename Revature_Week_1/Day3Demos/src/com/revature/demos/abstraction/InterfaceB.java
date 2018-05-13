package com.revature.demos.abstraction;

/* 
 * Interfaces extend other interfaces. In this case, we will need to extend InterfaceA to get our code
 * to work properly.
 * 
 * If we do not extend InterfaceA, our InterfaceImpl class breaks because both InterfaceA and InterfaceB
 * have a default method 'void doSomethingElse()', creating a conflict compile time.
 * 
 */
public interface InterfaceB extends InterfaceA{
	
	void doSomething();
	
	default void doSomethingElse() {
		System.out.println("InterfaceB is doing something else...");
	}

}
