package com.revature.corejavaassignment;

public class Q18Convertion extends Q18Abstract {

	@Override
	public boolean upperCase(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return true;
			}
		}		
		return false;
	}

	@Override
	public String lowerUpper(String str) {
		
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				temp = str.toUpperCase();
				break;
			}
		}
		
		return temp;
	}

	@Override
	public boolean stringToInt(String str) {
		
		int n;
		
		try {
			n = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			System.out.println("\nError: string must all be decimal digits");
			return false;
		}
		
		System.out.println("String: " + str + " plus ten as number: "
				+ (n+10));
		
		return true;
	}

}
