package com.revature.randomizer;

public class Driver {

	public static void main(String[] args) {
		
		AssociateCollection associateCollection = new AssociateCollection();
		//System.out.println(associateCollection);

		while(!associateCollection.isEmpty()) {
			associateCollection.printAssociate();
		}

	}

}
