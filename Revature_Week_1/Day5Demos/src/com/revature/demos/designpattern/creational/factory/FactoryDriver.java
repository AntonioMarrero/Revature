package com.revature.demos.designpattern.creational.factory;

/*
 * The main objective of the creational patterns is to instantiate an object 
 * and in Factory Pattern an interface is responsible for creating the object 
 * but the sub classes decides which class to instantiate.
 * 
 * Whenever we create object using new() we violate principle of programming 
 * for interface rather than implementation which eventually result in inflexible 
 * code and difficult to change in maintenance. By using Factory design pattern 
 * in Java we get rid of this problem.
 * 
 * Another problem we can face is class needs to contain objects of other classes 
 * or class hierarchies within it; this can be very easily achieved by just using 
 * the new keyword and the class constructor. The problem with this approach is that 
 * it is a very hard coded approach to create objects as this creates dependency 
 * between the two classes.
 * 
 * A Simple Factory pattern returns an instance of one of several possible classes 
 * depending on the data provided to it. Usually all classes that it returns have a 
 * common parent class and common methods, but each performs a task differently and 
 * is optimized for different kinds of data.
 */
public class FactoryDriver {
	
	public static void main(String[] args) {
		
		String country = "USA";
		Currency usa = CurrencyFactory.createCurrency(country);
		System.out.println("USA currency: " + usa.getSymbol());
		
		country = "Italy";
		Currency itly = CurrencyFactory.createCurrency(country);
		System.out.println("Italy currency: " + itly.getSymbol());
		
		country = "Germany";
		Currency grmny = CurrencyFactory.createCurrency(country);
		System.out.println("Germany currency: " + grmny.getSymbol());
		
		country = "China";
		Currency chn = CurrencyFactory.createCurrency(country);
		System.out.println("China currency: " + chn.getSymbol());
		
		country = "Venezuela";
		Currency vnzla = CurrencyFactory.createCurrency(country);
		System.out.println("Venezuela currency: " + vnzla.getSymbol());
	}
}

/*
 * Pros:
 * 		1) Factory method design pattern decouples the calling class from 
 * 		   the target class, which result in less coupled and highly cohesive code.
 * 
 * 		2) Factory pattern in Java enables the subclasses to provide extended 
 * 		   version of an object, because creating an object inside factory is more 
 * 		   flexible than creating an object directly in the client. Since client is 
 * 		   working on interface level any time you can enhance the implementation and 
 * 		   return from Factory.
 * 
 * 		3) Another benefit of using Factory design pattern in Java is that it encourages 
 * 		   consistency in Code since every time object is created using Factory rather 
 * 		   than using different constructor at different client side.
 * 
 * 		4) Code written using Factory design pattern in Java is also easy to debug and 
 * 		   troubleshoot because you have a centralized method for object creation and 
 * 		   every client is getting object from same place.
 */