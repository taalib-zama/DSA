package multithreading.mainThreadEx;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class MainThreadExample {
    public static void main(String[] args)
    {
        // Getting reference to Main thread
        Thread t = Thread.currentThread();

        // Getting name of Main thread
        System.out.println("Current thread: "
                + t.getName());

        // Changing the name of Main thread
        t.setName("Geeks");
        System.out.println("After name change: "
                + t.getName());

        // Getting priority of Main thread
        System.out.println("Main thread priority: "
                + t.getPriority());

        // Setting priority of Main thread to MAX(10)
        t.setPriority(MAX_PRIORITY);

        // Print and display the main thread priority
        System.out.println("Main thread new priority: "
                + t.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }

        // Main thread creating a child thread
        Thread ct = new Thread() {
            // run() method of a thread
            public void run()
            {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread");
                }
            }
        };

        // Getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "
                + ct.getPriority());

        // Setting priority of Main thread to MIN(1)
        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority: "
                + ct.getPriority());

        // Starting child thread
        ct.start();
    }
}
