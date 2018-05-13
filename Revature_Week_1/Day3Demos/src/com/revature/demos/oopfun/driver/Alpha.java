package com.revature.demos.oopfun.driver;

import com.revature.demos.oopfun.models.Beta;
import com.revature.demos.oopfun.models.Charlie;

public class Alpha {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		// Variance keywords
		//
		//		- Contravariant (allows for the substitution of a subtype with a supertype)
		//		- Covariant (allows for the substitution of a supertype with a subtype)
		//		- Bivariant (both covariant and contravariant)
		//		- Invariant (neither covariant nor contravariant)
		
		Charlie obj1 = new Charlie();
		// The below code prints out 1 if the Charlie class does not
		// override the 'publicIntGetter()' method, since it is returning
		// the shadowed Beta instance variable.
		System.out.println(obj1.publicIntGetter());
		
		
		// Covariant assignment
		Beta obj2 = new Charlie();
		// Prints 1 no matter if the Charlie class overrides the 'publicIntGetter()'
		// method or not. Because our variable is declared as type Beta, it only has
		// access to the members of the Beta class, not the Charlie class.
		System.out.println(obj2.publicIntGetter());
		
		// Primitive arrays are covariant
		Integer[] integers = new Integer[10];
		Number[] numbers = integers;
		
		//But above assignment is dangerous, because...
		numbers[0] = new Double(25); // This will throw an ArrayStoreException!
		
		// Additionally there are other examples of variance in Java with regard
		// to Generics.
		//
		//		- Standard Generics (no wildcard) are invariant
		//		- Generics with a wildcard of '? extends' are covariant
		//		- Generics with a wildcard of '? super' are contravariant
		
	}

}
