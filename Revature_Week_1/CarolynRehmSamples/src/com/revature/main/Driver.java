package com.revature.main;

public class Driver {

	public static void main(String[] args) {
		
		Calculator.divide(5,0);
		
		Bicycle bikeA = new Bicycle();
		bikeA.printStatus();
		
		Bicycle bikeB = new Bicycle();
		bikeB.applyBrakes(10);
		bikeB.printStatus();
		
		System.out.println(Bicycle.MAX_SPEED);
		
//		System.out.println(bikeA.equals(bikeB));	

	}

}
