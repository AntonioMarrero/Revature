package com.revature.demos.designpattern.creational.singleton;

/*
 * The Singleton pattern is implemented by creating a class with a method that 
 * creates a new instance of the object if one does not exist. If an instance 
 * already exists, it simply returns a reference to that object. To make sure 
 * that the object cannot be instantiated any other way, the constructor is 
 * made private. 
 * 
 * Although a Singleton can be implemented as a static instance, 
 * it can also be lazily constructed, requiring no memory or resources until 
 * needed.
 */
public class LazySingleton {
	
	/*
	 * This is just here to prove that changes to one reference to our 
	 * LazySingleton instance are persisted across all references (since 
	 * they refer to the same object)
	 */
	private int value;
	
	/*
	 *  A static member of type LazySingleton will hold our one and only
	 *  instance. It starts off as uninstantiated since we want to load it
	 *  only when it is required (lazy loading).
	 */
	private static LazySingleton mySingleton;
	
	/*
	 * Making the constructor of our outer class private ensures that it cannot
	 * be called outside of the class itself.
	 */
	private LazySingleton() { }
	
	/*
	 * This public getter method is what is used to fetch the our only
	 * instance of the OnDemandSingleton class.
	 */
	public static LazySingleton getInstance() {
		
		/*
		 * If the static member 'mySingleton' is null, instantiate a new LazySingleton
		 * object and return it. Otherwise, just return the existing instance.
		 */
		return (mySingleton == null) ? mySingleton = new LazySingleton() : mySingleton;
	}

	/*
	 * The two methods below are simple getters and setters for accessing
	 * and mutating the private member 'value'.
	 */
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/*
	 * We need to override the clone() method so that if it is invoked it will throw
	 * an exception. Otherwise, this method could be invoked to make a copy of our
	 * singleton class - which defeats the purpose of the design pattern
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
