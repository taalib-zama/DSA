package mutithreadingBlog.UsingThreadClass;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
