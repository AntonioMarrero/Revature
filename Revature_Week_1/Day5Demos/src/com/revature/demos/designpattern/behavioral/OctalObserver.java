package com.revature.demos.designpattern.behavioral;

public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.println(subject.getState() + " as octal: " + Integer.toOctalString(subject.getState()));
	}

}
