/*******************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Reverse String
 * Question: Q3. Reverse a string without using a temporary variable.
 * Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
********************************************/

package com.revature.corejavaassignment;

public class Q3ReverseString {

	public static void main(String[] args) {
		// call the getReverseString() method
		getReverseString("reverse");
	}// end main
	
	public static String getReverseString(String str) {
		// set the value for str String
//		String str = "reverse";
		// loops around moving letters until its completely reverse.
		for(int i = 0; i < str.length(); i++) {
			str = str.substring(1, str.length() - i) 
			+ str.substring(0, 1)
			+ str.substring(str.length() -i, str.length());
			}
		// prints out the str value.
		System.out.println(str);
		return str;
	}// end getReverseString()

}// end class
