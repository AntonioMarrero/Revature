package com.revature.demos.garbage;

public class GarbageDriver {

	public static void main(String[] args) {
		System.out.println("Instantiating a new GarbageDriver object, 'obj'...");
		
		@SuppressWarnings("unused")
		GarbageDriver obj = new GarbageDriver();
		
		System.out.println("GarbageDriver object, 'obj', successfully created!");
		System.out.println("Some time passes...");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Assign 'obj' to null, effectively dereferencing our"
				+ " GarbageDriver object in memory.");

		obj = null;

		System.gc();
	}

	@Override
	protected void finalize() {
		System.out.println("GarbageDriver's finalize() method called!");
		System.out.println("Goodbye, cruel world!");
	}

}
