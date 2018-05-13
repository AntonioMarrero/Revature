package com.revature.demos.threads;

public class ThreadDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.start();

		// Using join() method, we tell our thread to wait until the specified 
		// thread completes its execution. There are overloaded versions of 
		// join() method, which allows us to specify time for which you want to 
		// wait for the specified thread to terminate.
		//
		// Uncomment to see the threads switch.
//		try {
//			emp1.join(); // Waiting for emp1 to finish its execution
//		} catch(InterruptedException ie) {
//			ie.printStackTrace();
//		}
		
		
		Employee emp2 = new Employee();
		
		// We can increase the priority to increase the probability that the
		// higher priority thread will be called.
		emp2.setPriority(9);
		emp2.start();

		// Display the priority of the threads. The default priority is 5.
		// Note that these lines will be executed by the main thread.
		System.out.println(emp1.getPriority());
		System.out.println(emp2.getPriority());

		// We can use the isAlive() method to check if the given thread is still
		// running.
		System.out.println("emp1's thread is alive: " + emp1.isAlive());
		System.out.println("emp2's thread is alive: " + emp2.isAlive());
		
		/*
		 * The start() method, inherited from the parent Thread class, creates 
		 * a new thread and runs whatever code is in run() in the new thread.
		 * 
		 * Of course, nothing stops us from calling the run() methods directly 
		 * ourselves, but then the Worker.run() methods run one after the other,
		 * in the main program thread, not simultaneously. 
		 */

		// This is not the proper way to use threads. The below code will be
		// executed on the main thread, not individual ones.
		//		Employee emp3 = new Employee();
		//		emp3.run();
		//		
		//		Employee emp4 = new Employee();
		//		emp4.run();
	}

}
