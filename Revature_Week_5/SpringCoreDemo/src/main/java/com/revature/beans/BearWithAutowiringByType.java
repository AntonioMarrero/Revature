package com.revature.beans;

public class BearWithAutowiringByType extends Bear {
	
	private int id;
	private String name;
	private Cave crib;
	
	@Override
	public void setCrib(Cave crib) {
		this.crib = crib;
	}
	
	@Override
	public String toString() {
		return "BearWithAutowiringByType [id=" + id + ", name=" + name + ", cave=" + crib + "]";
	}
	
	@Override
	public void methodInBear() {
		System.out.println("method in BearWithAutowiringByType. this bear is: "+toString());
		System.out.println("cave: "+ crib.toString());
	}

}
