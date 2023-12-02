package com.sysrs.jobreadiness.corejava.multithreading;

/**
 * A synchronized block is a code block that is guarded by a monitor, which
 * ensures that only one thread can execute the block at a time.
 *
 */
class SynchronizedBlockDemo {

	private int sharedCounter = 0;
	private Object lock = new Object(); // Shared lock object

	public void incrementCounter() {
		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - Counter: " + ++sharedCounter);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedBlockDemo example = new SynchronizedBlockDemo();

		// Creating two threads
		Thread thread1 = new Thread(() -> example.incrementCounter(), "Thread-1");
		Thread thread2 = new Thread(() -> example.incrementCounter(), "Thread-2");

		// Starting the threads
		thread1.start();
		thread2.start();
	}
}
