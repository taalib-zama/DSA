package multithreading.mutithreadingBlog.UsingRunnableInterface.UsingLambda;

public class Test3 {
    //start a new thread using lambda expression
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread using lambda expression
        Runnable myRunnable = () -> System.out.println("New Thread is running" + Thread.currentThread().getName());
        Thread myThread = new Thread(myRunnable);
        myThread.start();
        try {
            myThread.join(10000);
            System.out.println("Thread after wait of 10 seconds");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
