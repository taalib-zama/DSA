package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog.UsingRunnableInterface.VanillaImplementation;

public class MyRunnable1 implements Runnable {

    public void run() {
        System.out.println("New Thread is running" + Thread.currentThread().getName());
    }
}
