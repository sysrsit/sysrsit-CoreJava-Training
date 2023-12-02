package com.sysrs.jobreadiness.corejava.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock is a synchronized lock mechanism that allows multiple
 * acquisitions of the same lock by the same thread, ensuring thread-safe access
 * to shared resources.
 *
 */
class ReentrantLockDemo {

	private int sharedCounter = 0;
	private Lock lock = new ReentrantLock(); // ReentrantLock instance

	public void incrementCounter() {
		lock.lock();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - Counter: " + ++sharedCounter);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ReentrantLockDemo example = new ReentrantLockDemo();
		// Creating two threads
		Thread thread1 = new Thread(() -> example.incrementCounter(), "Thread-1");
		Thread thread2 = new Thread(() -> example.incrementCounter(), "Thread-2");
		// Starting the threads
		thread1.start();
		thread2.start();
	}
}
