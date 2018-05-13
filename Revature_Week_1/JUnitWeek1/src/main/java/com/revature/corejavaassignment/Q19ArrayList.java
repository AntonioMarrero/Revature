package com.revature.corejavaassignment;

import java.util.ArrayList;

public class Q19ArrayList {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			arr.add(i);
		}
		
		addEven();
		addOdds();
		showNonPrimes();

	}
	
	public static void addEven() {
		int even = 0;
		for(int i : arr) {
			if(i%2==0) {
				even = even + i;
			}
		}
		
		System.out.println(even);
	}
	
	public static void addOdds() {
		int odds = 0;
		for(int i : arr) {
			if(i%2!=0) {
				odds = odds + i;
			}
		}
		
		System.out.println(odds);
	}
	
	public static void showNonPrimes() {
		for(int i : arr) {
			if(i%2 == 0 || i%3 == 0) {
				if(i!=2 && i!=3) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
