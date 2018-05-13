package com.revature.demos.deadlock;

import java.util.Date;

public class Philosopher implements Runnable {
	
	private Object leftFork;
	private Object rightFork;
	
	public Philosopher(Object leftFork, Object rightFork) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}
	
	/*
	 * Each action is simulated by suspending the invoking thread for a 
	 * random amount of time, so that the execution order isn’t enforced 
	 * by time alone.
	 */
	private void doAction(String action) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + action);
		Thread.sleep((int) (Math.random() * 100));
	}
	
	private String currentTime() {
		return new Date(System.currentTimeMillis()).toString().substring(11, 19);
	}
	
	/*
	 * A Philosopher thinks for a while and then decides to eat. After this, 
	 * he acquires the forks to his left and right and starts eating. When 
	 * done, he places the forks down. 
	 * 
	 * Time stamps have been added to each action, to help us understand the 
	 * order in which events occur.
	 */
	@Override
	public void run() {
		try {
			while(true) {
				doAction(currentTime() + ": Contemplating the meaning of existence");
				
				synchronized(rightFork) {
					doAction(currentTime() + ": Picked up right fork");
					
					synchronized(leftFork) {
						doAction(currentTime() + ": Picked up left fork - eating");
						doAction(currentTime() + ": Put down left fork");
					}
					
					doAction(currentTime() + ": Put down right fork - thinking some more");
					return;
				}
			}
		} catch(InterruptedException ie) {
			Thread.currentThread().interrupt();
			return;
		}
	}

}
