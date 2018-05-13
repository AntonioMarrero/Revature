package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BearWithAutomagic extends Bear{

	private int id;
	private String name;
	
	@Autowired
	private Cave cave;
	
	@Override
	public String toString() {
		return "BearWithAutomagic [id=" + id + ", name=" + name + ", cave=" + cave + "]";
	}



	public void methodInBear() {
		System.out.println("method in BearWithAutoMagic. this bear is: "+toString());
		System.out.println("cave: "+ cave.toString());
	}
}
