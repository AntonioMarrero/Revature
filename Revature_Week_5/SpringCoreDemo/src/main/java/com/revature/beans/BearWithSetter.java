package com.revature.beans;

public class BearWithSetter extends Bear {
	
	private int id;
	private String name;
	private Cave crib;
	
	public void setCrib(Cave crib) {
		this.crib = crib;
	}
	
	@Override
	public String toString() {
		return "BearWithSetter [id=" + id + ", name=" + name + ", cave=" + crib + "]";
	}
	
	public void methodInBear() {
		System.out.println("method in BearWithSetter. this bear is: "+toString());
		System.out.println("cave: "+ crib.toString());
	}
	
}
