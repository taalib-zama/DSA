package mutithreading.ThreadLifecycle;

public class ExtendingThreadClass extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");

        }
        catch (Exception e) {
            System.out.println("Exception in thread " + Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExtendingThreadClass thread1 = new ExtendingThreadClass();
        ExtendingThreadClass thread2 = new ExtendingThreadClass();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have finished execution.");
    }
}
