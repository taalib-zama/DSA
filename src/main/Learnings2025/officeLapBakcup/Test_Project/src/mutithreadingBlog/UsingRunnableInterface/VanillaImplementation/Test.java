package mutithreadingBlog.UsingRunnableInterface.VanillaImplementation;

public class Test {
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread
        MyRunnable1 myRunnable = new MyRunnable1();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
