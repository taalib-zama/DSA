package multithreading;

public class Sample1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        Thread thread = new Thread(sample1);
        thread.start();
        System.out.println("Current thread id : "  + Thread.currentThread().getId());
    }
}
