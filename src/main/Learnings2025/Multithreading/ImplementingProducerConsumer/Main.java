package Multithreading.ImplementingProducerConsumer;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);

        // Create producer and consumer threads
        Thread producerThread = new Thread(() ->
        {
            try {
                Thread.sleep(2000);     //to make sure consumer thread starts first
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i <= 5; i++) {
                try {
                    sharedResource.produce(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //consumer thread
        Thread consumeThread = new Thread(() ->
        {
            for (int i = 0; i <= 5; i++) {
                try {
                    sharedResource.consume();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        });

        producerThread.start();
        consumeThread.start();
    }
}
