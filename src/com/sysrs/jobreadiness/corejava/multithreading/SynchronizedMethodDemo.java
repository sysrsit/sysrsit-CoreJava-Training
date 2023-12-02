package com.sysrs.jobreadiness.corejava.multithreading;

/**
 * A synchronized method acquires the monitor lock for the object on which it is
 * invoked, ensuring that only one thread can execute the method at a time.
 *
 */
class SynchronizedMethodDemo {

	private int sharedCounter = 0;

	// Synchronized method
	public synchronized void incrementCounter() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Counter: " + ++sharedCounter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedMethodDemo example = new SynchronizedMethodDemo();

		// Creating two threads
		Thread thread1 = new Thread(() -> example.incrementCounter(), "Thread-1");
		Thread thread2 = new Thread(() -> example.incrementCounter(), "Thread-2");

		// Starting the threads
		thread1.start();
		thread2.start();
	}
}
