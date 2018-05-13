/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Substring
 * Question: Q5. Write a substring method that
 * accepts a string str and an integer idx and
 * returns the substring contained between 0 and
 * idx-1 inclusive.  Do NOT use any of the existing
 * substring methods in the String, StringBuilder,
 * or StringBuffer APIs.
**************************************************/

package com.revature.corejavaassignment;

public class Q5Substring {
		
	
	public static void main(String[] args) {
		System.out.println(substringIndex("something", 3));
		
		
	}
	
	public static String substringIndex(String str, int index) {
		if(index >= str.length()) {
			return str;
		}
		
		
		String str1 = "";
		for(int i = 0; i < index; i++) {
			str1 += str.charAt(i);
		}
		
		return str1;
	}

}
