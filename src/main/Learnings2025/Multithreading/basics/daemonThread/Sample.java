package Multithreading.basics.daemonThread;

public class Sample {
    public static void main(String[] args) {


        //sample implementation of daemon thread

        Thread deamonThread1 = new Thread(() ->
        {
            //creating daemon thread to run in background
            while(true) {
                System.out.println("Daemon Thread 1 is running in background");
                try {
                    Thread.sleep(1000);     //simulate some task
                } catch (InterruptedException e) {
                    System.out.println("Daemon Thread 1 interrupted: " + e.getMessage());
                }
            }
        });

//        Thread intermediateOperation = new Thread(()->{
//            System.out.printf("Intermediate Thread ran : %s%n", Thread.currentThread().getName());
//        })
        //Note in creating thread we are using lambda expression to implement Runnable interface only single method run().

        //further runnable interface is better way to create thread rather than extending Thread class
        Runnable intermediateTask = () -> {
            System.out.printf("Intermediate Thread ran : %s%n", Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Current state of Daemon Thread 1 : %s%n",deamonThread1.getState());
        };
        Thread intermediateOperation = new Thread(intermediateTask,"Intermediate-Thread");
        /*ntermediateOperation.start();*/


        deamonThread1.setDaemon(true); //setting thread as daemon
        deamonThread1.start();

        intermediateOperation.start();

        System.out.printf("Main Thread: %s%n", Thread.currentThread().getName());
        System.out.printf("Daemon Thread 1 State after starting: %s%n",deamonThread1.getState());
        try {
            Thread.sleep(3000); //main thread sleeps for 3 seconds to let daemon thread run for a while
            System.out.printf("Daemon Thread 1 State before main thread ends: %s%n",deamonThread1.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    //NOTE : The daemon thread message stops as soon as the main thread ends its execution.
}
