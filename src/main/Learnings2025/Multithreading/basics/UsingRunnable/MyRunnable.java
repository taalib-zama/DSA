package Multithreading.basics.UsingRunnable;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable is running in thread: " + Thread.currentThread().getName());
    }
}
