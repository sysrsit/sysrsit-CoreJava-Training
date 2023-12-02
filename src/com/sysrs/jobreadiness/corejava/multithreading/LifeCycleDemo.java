package com.sysrs.jobreadiness.corejava.multithreading;
/**
 * @author 
 *
 */
public class LifeCycleDemo {

    public static void main(String[] args) {
        // Creating a new thread
        Thread myThread = new Thread(() -> {
            try {
                // Simulating some processing in the NEW state
                System.out.println("Thread in the NEW state");
                Thread.sleep(500);

                // Moving to the RUNNABLE state
                System.out.println("Thread in the RUNNABLE state");

                // Simulating some processing in the RUNNABLE state
                for (int i = 0; i < 5; i++) {
                    System.out.println("Executing task in the RUNNABLE state - Count: " + i);
                    Thread.sleep(200);
                }

                // Simulating a blocking operation
                synchronized (LifeCycleDemo.class) {
                    System.out.println("Thread in the BLOCKED state (due to synchronized block)");
                    Thread.sleep(500);
                }

                // Simulating a waiting state
                synchronized (LifeCycleDemo.class) {
                    System.out.println("Thread in the WAITING state (due to wait())");
                    LifeCycleDemo.class.wait();
                }

                // Simulating a timed waiting state
                synchronized (LifeCycleDemo.class) {
                    System.out.println("Thread in the TIMED_WAITING state (due to sleep())");
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // Starting the thread
        myThread.start();

        try {
            // Simulating the main thread waiting for the completion of the new thread
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Thread in the TERMINATED state
        System.out.println("Thread in the TERMINATED state");
    }
}
