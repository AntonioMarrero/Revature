package com.revature.corejavaassignment;

import java.util.Scanner;

public class Q17PrincipleInterest {
	
//	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		intrest(25000, 6, 6);

	}
	
	public static double intrest(long principal, double rate, double time) {
		
//		long principal;
//		double rate;
//		double time;
		float intrest;
		
//		System.out.println("Enter principal: ");
//		principal = scan.nextInt();
//		System.out.println("Enter your rate: ");
//		rate = scan.nextDouble();
//		System.out.println("Enter time in years: ");
//		time = scan.nextDouble();
		
		// calculates the interest
		// casting as a float
		intrest = (float) (principal * rate * time);
		System.out.println("Your Intrest is: " + intrest);
		return intrest;
	}
}
