package com.revature.demos.oopfun.driver;

/*
 * The process of determining applicability begins by determining the potentially 
 * applicable methods. 
 * 
 * The remainder of the process is split into three phases, to ensure compatibility 
 * with versions of the Java programming language prior to Java SE 5.0. The phases are:
 * 
 * 		- The first phase performs overload resolution without permitting
 * 		  boxing or unboxing conversion, or the use of variable arity method
 * 		  invocation. If no applicable method is found during this phase then
 * 		  processing continues to the second phase.
 * 
 * 		- The second phase performs overload resolution while allowing boxing 
 * 		  and unboxing, but still precludes the use of variable arity method 
 *   	  invocation. If no applicable method is found during this phase then 
 *   	  processing continues to the third phase. 
 *   
 *   	- The third phase allows overloading to be combined with variable arity 
 *   	  methods, boxing, and unboxing.
 *   
 *   Simply put, the general order that the compiler will attempt to match parameters 
 *   to overloaded methods is:
 *   
 *   	1) Exact Match
 *   	2) Implicit Casting
 *   	3) Boxing/Unboxing
 *   	4) Capturing (varargs)
 */
public class Omega {

	public static void main(String [] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);
		go((Short)y);
	}

	public static void go(Long n) {
		System.out.println("takes Long ");
	}

	public static void go(Short n) {
		System.out.println("takes Short ");
	}

	public static void go(int n) {
		System.out.println("takes int ");
	}
}
