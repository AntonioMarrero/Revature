package com.revature.corejavaassignment;

import java.util.Scanner;

public class Q16StringLength {

	public static void main(String[] args) {
		
		stringLeng("lola");

	}
	
	public static int stringLeng(String str) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a word to get the "
//				+ "number of characters for the string input");
//		String str = scan.nextLine();
		System.out.println("The number of characters for your entered"
				+ "word is: " + str.length());
//		scan.close();
		
		// returns the number of how big the string is as far
		// as number of characters.
		return str.length();
	}

}
