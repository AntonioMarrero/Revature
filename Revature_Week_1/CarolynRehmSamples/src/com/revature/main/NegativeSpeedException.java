package com.revature.main;

public class NegativeSpeedException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeSpeedException() {
		super("Can't go a negative speed");
	}

}
