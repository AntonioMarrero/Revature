package com.revature.strings;

public class Driver {
	
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str = "";

	public static void main(String[] args) {

		
//		  //gives us our primitive default values
//		  System.out.println("Bool :" + bool);
//        System.out.println("Byte :" + by);
//        System.out.println("Character:" + '\u0000');
//        System.out.println("Double :" + d);
//        System.out.println("Float :" + f);
//        System.out.println("Integer :" + i);
//        System.out.println("Long :" + l);
//        System.out.println("Short :" + sh);
//        System.out.println("String: "+ str); 
		
		//matches method
//		String stringA = "abc";
//		System.out.println(stringA.matches("abc"));
//		System.out.println(stringA.matches("abcd"));
		
		//equals
//		String a = "abc";
//		String b = "abcd";
//		if(a.equals(b)) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//replaceAll
//		String test = "this is a test";
//		System.out.println(test.replaceAll(" ", "_"));
		
		//charAt
//		String original = "original stri";
//		System.out.println(original.charAt(original.length()/2));
		
		//hashcode
//		String test = "Hello World";
//		System.out.println(test.hashCode());

		//lowercase
//		String str = "This is a string";
//		System.out.println(str.toLowerCase());
		
		//ends with
//		String r = "running";
//		System.out.println(r.endsWith("ing"));
		
        
        
        

    		
    		//////////////STRINGS///////////////
    		
//    		String string1 = "I'm a string!";
//    		String string2 = "I'm a string!";
    		
    		/* two strings with the same value reference the same hashcode */
//    		System.out.println("string1 hashcode: "+string1.hashCode());
//    		System.out.println("string2 hashcode: "+string2.hashCode());
//    		System.out.println("objects are equal: "+string1.equals(string2));

    		/* modifying a string's value will reference a new object */
//    		String alsoString1 = string1;
//    		string1 = string1 + "!";
//    		/* this is reflected by a new hashcode */
//    		System.out.println("string1 hashcode: "+alsoString1.hashCode());
//    		System.out.println("string2 hashcode: "+string1.hashCode());
//    		/* also by comparing it to a variable referencing the same original object */
//    		System.out.println("objects are equal: "+string1.equals(string2));

    		
    		//////////////STRINGBUILDERS///////////////
    		
//    		StringBuilder stringBuilder1 = new StringBuilder("I'm a string builder object!");
//    		StringBuilder stringBuilder2 = new StringBuilder("I'm a string builder object!");
    		
    		/* two different StringBuilders have different hashcodes, regardless of their value */
//    		System.out.println("stringBuilder1 hashcode: "+stringBuilder1.hashCode());
//    		System.out.println("stringBuilder2 hashcode: "+stringBuilder2.hashCode());
//    		System.out.println("objects are equal: "+stringBuilder1.equals(stringBuilder2));
    	
    		/* when converted into Strings, they again will refer to the same String in the string pool */
//    		System.out.println("string1 hashcode: "+stringBuilder1.toString().hashCode());
//    		System.out.println("string2 hashcode: "+stringBuilder2.toString().hashCode());
//    		System.out.println("objects are equal: "+stringBuilder1.toString().equals(stringBuilder2.toString()));

    		/* modifying a StringBuilder's value will modify the object being referenced */
//    		StringBuilder alsoStringBuilder1 = stringBuilder1;
//    		System.out.println("stringBuilder1: "+stringBuilder1);
//    		System.out.println("stringBuilder1 hashcode: "+stringBuilder1.hashCode());
//    		stringBuilder1 = stringBuilder1.append("!");
//    		/* this is reflected by showing the same hashcode */
//    		System.out.println("stringBuilder1 after mutating: "+alsoStringBuilder1);
//    		System.out.println("alsoStringBuilder1 hashcode after mutating: "+alsoStringBuilder1.hashCode());
//    		/* also by comparing it to a variable referencing the same original object */
//    		System.out.println("objects are equal: "+stringBuilder1.equals(alsoStringBuilder1));
        
        
	}

}
