package com.revature.beans;

public class Bear {
	
	protected int id;
	protected String name;
	protected Cave crib;
	
	public Bear() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cave getCrib() {
		return crib;
	}

	public void setCrib(Cave crib) {
		this.crib = crib;
	}

	@Override
	public String toString() {
		return "Bear [id=" + id + ", name=" + name + ", crib=" + crib + "]";
	}

	public void methodInBear() {
		System.out.println("method in bear.");
	}
	

}
