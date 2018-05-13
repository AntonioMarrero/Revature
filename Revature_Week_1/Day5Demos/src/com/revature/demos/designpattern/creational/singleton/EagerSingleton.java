package com.revature.demos.designpattern.creational.singleton;

/*
 * If the program will always need an instance, or if the cost of 
 * creating the instance is not too large in terms of time/resources, 
 * the programmer can switch to eager initialization, which always 
 * creates an instance when the class is loaded into the JVM.
 */
public class EagerSingleton {
	
	private int value;
	
	public static EagerSingleton mySingleton = new EagerSingleton();
	
	private EagerSingleton() { }
	
	public static EagerSingleton getInstance() {
		return mySingleton;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
