package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog.UsingThreadClass;

import officeLaptopBackUp.multithreading.mutithreadingBlog.UsingThreadClass.MyThread;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
