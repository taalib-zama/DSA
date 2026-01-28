package mutithreading.multithreadingPart2.Multithreading;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() ->
        {
            try {
                Thread.sleep(2000);     //to make sure consumer thread starts first
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });

        Thread consumeThread = new Thread(() ->
        {
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumeThread.start();
    }
}
