package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog.UsingRunnableInterface.VanillaImplementation;

public class Test {
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread
        multithreading.mutithreadingBlog.UsingRunnableInterface.VanillaImplementation.MyRunnable1 myRunnable = new multithreading.mutithreadingBlog.UsingRunnableInterface.VanillaImplementation.MyRunnable1();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
