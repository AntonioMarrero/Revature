package com.revature.demos.abstraction;

public class InterfaceDriver {

	public static void main(String[] args) {
		InterfaceImpl myImpl = new InterfaceImpl();
		
		myImpl.doSomething();
		myImpl.doSomethingElse();
	}
}
