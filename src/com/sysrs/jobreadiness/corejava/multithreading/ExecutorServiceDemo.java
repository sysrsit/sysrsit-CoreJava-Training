package com.sysrs.jobreadiness.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorService is an interface that manages a pool of threads and enables
 * asynchronous execution of tasks.
 *
 */
public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// Creating a fixed-size thread pool with 3 threads
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Submitting tasks for execution
		for (int i = 1; i <= 5; i++) {
			int taskId = i;
			executorService.submit(() -> performTask(taskId));
		}

		// Initiating an orderly shutdown
		executorService.shutdown();

		try {
			// Waiting for all submitted tasks to complete or timeout after 5 seconds
			executorService.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All tasks completed. ExecutorService shut down.");
	}

	// Simulating a task that takes some time to execute
	private static void performTask(int taskId) {
		try {
			System.out.println("Task " + taskId + " started by thread: " + Thread.currentThread().getName());
			Thread.sleep(2000); // Simulating some task execution time
			System.out.println("Task " + taskId + " completed by thread: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
