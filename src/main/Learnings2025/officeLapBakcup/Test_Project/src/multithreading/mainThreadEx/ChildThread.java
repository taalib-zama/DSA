package multithreading.mainThreadEx;

public class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            // Print statement whenever child thread is
            // called
            System.out.println("Child thread");
        }
    }
}
