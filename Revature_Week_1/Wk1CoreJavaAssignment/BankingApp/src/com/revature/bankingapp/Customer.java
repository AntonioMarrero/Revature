package com.revature.bankingapp;

import java.util.ArrayList;

// This class holds the clients information
// it has the constructors, getters and setters
public class Customer {

	private String userName;
	private double balance;
	// Array that holds the clients username and balance
	ArrayList<String> clientList = new ArrayList<String>();
	
	// Constructors
	public Customer(String userName, double balance) {
		super();
		this.userName = userName;
		this.balance = balance;
		clientList = new ArrayList<String>(2);
	}
	
	// Getter and Setters for my variables
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// override toString() method for my variables
	@Override
	public String toString() {
		return  userName + ":" + balance ;
	}
	
}
