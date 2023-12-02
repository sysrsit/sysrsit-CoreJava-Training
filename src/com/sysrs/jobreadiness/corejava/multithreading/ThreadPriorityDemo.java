package com.sysrs.jobreadiness.corejava.multithreading;

/**
 * Thread priority is a numerical value assigned to each thread that indicates
 * its relative importance for scheduling purposes.
 *
 */
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// Creating threads with different priorities
		Thread highPriorityThread = new Thread(new MyRunnable(), "HighPriorityThread");
		Thread lowPriorityThread = new Thread(new MyRunnable(), "LowPriorityThread");

		// Setting thread priorities
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

		// Starting the threads
		highPriorityThread.start();
		lowPriorityThread.start();
	}

	static class MyRunnable implements Runnable {
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - Count: " + i);
				try {
					// Introducing a short delay to better observe thread execution
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
