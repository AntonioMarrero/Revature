package com.revature.demos.abstraction;

public abstract class MyAbstractClass {
	
	// Although the class is marked as 'abstract', it is still required
	// for us to include the 'abstract' keyword in our method declaration.
	public abstract void myAbstractMethod();
	
	public void myConcreteMethod() {
		System.out.println("We can still provide some methods with implementations in abstract classes!");
	}

}
