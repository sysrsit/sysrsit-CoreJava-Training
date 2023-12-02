package com.sysrs.jobreadiness.corejava.multithreading;
/**
 * @author 
 *
 */
public class DeadlockHandlingDemo {

    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Simulating a resource-specific operation
        public boolean doOperation(Resource otherResource, long timeout) throws InterruptedException {
            long startTime = System.currentTimeMillis();

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " acquired " + name);

                try {
                    // Introducing a delay to increase the chance of deadlock occurrence
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while (System.currentTimeMillis() - startTime < timeout) {
                    synchronized (otherResource) {
                        System.out.println(Thread.currentThread().getName() + " acquired " + otherResource.getName());
                        return true;
                    }
                }
            }

            // Couldn't acquire the lock within the timeout, releasing acquired locks
            release();
            return false;
        }

        public synchronized void release() {
            // Simulating releasing the resource
        }
    }

    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Thread 1 acquires resource1 and then waits for resource2
        Thread thread1 = new Thread(() -> {
            try {
                if (resource1.doOperation(resource2, 2000)) {
                    // Perform operations on resource1 and resource2
                    System.out.println(Thread.currentThread().getName() + " performing operations");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");

        // Thread 2 acquires resource2 and then waits for resource1
        Thread thread2 = new Thread(() -> {
            try {
                if (resource2.doOperation(resource1, 2000)) {
                    // Perform operations on resource2 and resource1
                    System.out.println(Thread.currentThread().getName() + " performing operations");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
