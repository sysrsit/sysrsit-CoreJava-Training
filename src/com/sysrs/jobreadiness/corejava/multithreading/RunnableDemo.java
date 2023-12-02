package com.sysrs.jobreadiness.corejava.multithreading;

/**
 * The Runnable interface a interface that defines a single method, run(), which
 * is executed when the thread starts.
 *
 */
class ThreadExample implements Runnable {
	private Thread t;
	private String threadName;

	ThreadExample(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class RunnableDemo {
	public static void main(String args[]) {
		ThreadExample R1 = new ThreadExample("Thread-1");
		R1.start();
		ThreadExample R2 = new ThreadExample("Thread-2");
		R2.start();
	}
}
