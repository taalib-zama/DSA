package Multithreading.basics.UsingRunnable;


import officeLaptopBackUp.multithreading.mutithreadingBlog.UsingThreadClass.MyThread;

public class Test {
    public static void main(String[] args) {
        MyRunnable customThread = new MyRunnable();
        customThread.run();
    }
}
