package com.revature.beans;

public class BearWithAutowiringByName extends Bear {
	
	private int id;
	private String name;
	private Cave crib;
	
	public void setCave(Cave crib) { //setCrib gives us a NullPointerException because it's looking for a crib bean
		this.crib = crib;
	}
	
	@Override
	public String toString() {
		return "BearWithAutowiringByName [id=" + id + ", name=" + name + ", cave=" + crib + "]";
	}
	
	@Override
	public void methodInBear() {
		System.out.println("method in BearWithAutowiringByName. this bear is: "+toString());
		System.out.println("cave: "+ crib.toString());
	}

}
