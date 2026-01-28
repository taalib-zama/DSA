package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog.UsingRunnableInterface.UsingAnonymous;

import multithreading.mutithreadingBlog.UsingRunnableInterface.VanillaImplementation.MyRunnable1;

public class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("New Thread is running" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread
        MyRunnable1 myRunnable = new MyRunnable1();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
