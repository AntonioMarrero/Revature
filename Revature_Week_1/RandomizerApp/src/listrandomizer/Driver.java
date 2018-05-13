package listrandomizer;

import java.util.Collections;
import java.util.Iterator;
//import java.util.Scanner;

public class Driver {
	
//	private static Scanner scan;
	
	public static void main(String[] args) {
		
		AssociateCollection associateCollection = new AssociateCollection();
		
		Collections.shuffle(associateCollection);
	
//		scan = new Scanner(System.in);
	
		Iterator<Associate> itr = associateCollection.iterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
//			scan.nextLine();
		}
	
		System.out.println("Everyone has been called");

	}// end main
	
}// end class
