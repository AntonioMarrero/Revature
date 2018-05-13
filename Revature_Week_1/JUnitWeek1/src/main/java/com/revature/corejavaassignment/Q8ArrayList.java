package com.revature.corejavaassignment;

import java.util.ArrayList;

public class Q8ArrayList {

	static ArrayList<String> myList = new ArrayList<String>();
	static ArrayList<String> paliList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String[] list = {"karan", "madam", "tom", "civic", "radar", "jimmy",
				"kayak", "john", "refer", "billy", "did"};
				
		Palindromes(list);
		
		System.out.println("Some Palidromes from my ArrayList are: " + "\n");
		
		for(String s : paliList) {
			
			System.out.println(s);
			
		}
		
		
	}
	
	public static ArrayList<String> Palindromes(String[] list ) {
		// cycles thru the list and add the contents to the myList ArrayList
		for(int i = 0; i < list.length ; i++) {
			myList.add(list[i]);
			boolean add = true;
			String words = list[i];
			
			for(int j=0 ; j < words.length()/2; j++) {
				if(words.charAt(j) != words.charAt(words.length()-j-1))
					add = false;
			}
			
			if(add)
				paliList.add(list[i]);
		}
		return paliList;
	}
}
