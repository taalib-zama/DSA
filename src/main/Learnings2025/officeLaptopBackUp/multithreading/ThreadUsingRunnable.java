package multithreading;

public class ThreadUsingRunnable implements Runnable{


    String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
    };

    @Override
    public void run() {
        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(importantInfo[i]);
        }
    }

    public static void main(String[] args) {
        ThreadUsingRunnable sample1 = new ThreadUsingRunnable();
        Thread thread = new Thread(sample1);
        thread.start();
        System.out.println("Current thread id : "  + Thread.currentThread().getId());
    }
}
