package officeLaptopBackUp.multithreading.mutithreadingBlog.UsingThreadClass;

public class MyThreadUsingAnonymousClass {
    public static void main(String[] args) {
        System.out.println("Running the main thread: " + Thread.currentThread().getName());

        //start a new thread using anonymous class
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("New modified created Thread is running" + this.getName());
            }
        };
        myThread.start();
    }

}
