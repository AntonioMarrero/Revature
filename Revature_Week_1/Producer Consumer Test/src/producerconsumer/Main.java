package producerconsumer;

import producerconsumer.ProducerConsumer.PC;

public class Main {

	static PC pc = new PC();
	
	public static void main(String[] args) throws InterruptedException {
		// Create producer thread
		Thread t1 = new Thread(new Producer());

		// Create consumer thread
		Thread t2 = new Thread(new Consumer());


		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();

	}

}
