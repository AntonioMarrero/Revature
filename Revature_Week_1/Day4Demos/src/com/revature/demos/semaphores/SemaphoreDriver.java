package com.revature.demos.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreDriver {
	
	public static void main(String[] args) {
		
		/*
		 * A Semaphore is a thread synchronization construct that can be used either to 
		 * send signals between threads to avoid missed signals, or to guard a critical 
		 * section like you would with a lock.
		 * 
		 * A counting semaphore. Conceptually, a semaphore maintains a set of permits. 
		 * Each acquire() blocks if necessary until a permit is available, and then takes 
		 * it. Each release() adds a permit, potentially releasing a blocking acquirer. 
		 * 
		 * However, no actual permit objects are used; the Semaphore just keeps a count 
		 * of the number available and acts accordingly. Semaphores are often used to 
		 * restrict the number of threads than can access some (physical or logical) 
		 * resource.
		 * 
		 * A semaphore initialized to one, and which is used such that it only has at
		 * most one permit available, can serve as a mutual exclusion lock - also known
		 * as a 'binary semaphore'.
		 */
		Semaphore sem = new Semaphore(1);
		System.out.println("Available permits: " + sem.availablePermits()); // 1
		
		
		try {
			// Acquires a permit from the semaphore, or blocking until one is available
			// Or until the thread is interrupted
			sem.acquire();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Available permits: " + sem.availablePermits()); // 0
		
		// Releases a permit back to the semaphore
		sem.release();
		System.out.println("Available permits: " + sem.availablePermits());
		
		
		/*
		 * The constructor for the Semaphore class optionally accepts a fairness parameter. 
		 * When set false, this class makes no guarantees about the order in which 
		 * threads acquire permits. If not given at initialization, the fairness is false.
		 * 
		 * In particular, barging is permitted, that is, a thread invoking acquire()
		 * can be allocated a permit ahead of a thread that has been waiting - 
		 * logically the new thread places itself at the head of the queue of 
		 * waiting threads. 
		 * 
		 * When fairness is set true, the semaphore guarantees that threads invoking 
		 * any of the acquire methods are selected to obtain permits in the order in 
		 * which their invocation of those methods was processed (FIFO).
		 */
		System.out.println("Fairness: " + sem.isFair());
	}

}
