package com.revature.demos.abstraction;

/* 
 * See that we can extend our abstract class, as well as implement multiple interfaces.
 *
 * Although because InterfaceA and InterfaceB both have methods with the same signature
 * our compiler is complaining about the naming collision. Because it doesn't know which
 * interface to get the default method, doSomethingElse(), implementation from.
 * 
 */
public class InterfaceImpl extends MyAbstractClass implements InterfaceA, InterfaceB {
	
	// Which interface is the inheriting from? Hmmm...
	@Override
	public void doSomething() {
		System.out.println("Do some stuff");
	}

	// We know that this abstract method is coming from our abstract class, MyAbstractClass
	@Override
	public void myAbstractMethod() {
		System.out.println("No so abstract anymore, eh?");
	}

}
