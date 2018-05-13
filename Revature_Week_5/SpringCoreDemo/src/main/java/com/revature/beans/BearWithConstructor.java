package com.revature.beans;

public class BearWithConstructor extends Bear {
	
	private int id;
	private String name;
	private Cave crib;
	
	public BearWithConstructor(Cave crib) {
		super();
		this.crib=crib;
	}
	
	@Override
	public String toString() {
		return "BearWithConstructor [id=" + id + ", name=" + name + ", cave=" + crib + "]";
	}
	
	@Override
	public void methodInBear() {
		System.out.println("method in BearWithConstructor. this bear is: "+toString());
		System.out.println("cave: "+ crib.toString());
	}

}
