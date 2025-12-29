package multithreading.mutithreadingBlog.ThreadStopExample;

import multithreading.mutithreadingBlog.UsingRunnableInterface.UsingAnonymous.MyRunnable2;

public class Tester {
    public static void main(String[] args) {
        ThreadStopExample thread = new ThreadStopExample();
        Thread myThread = new Thread(thread);
        myThread.start();

        try{
            Thread.sleep(10L * 1000L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
