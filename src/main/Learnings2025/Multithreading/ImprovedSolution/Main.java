package Multithreading.ImprovedSolution;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(3);

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Producer produced: " + i);
                    buffer.put(i); // Add item to the queue
                    Thread.sleep(500); // Simulate production time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 5; i++) {
                    int item = buffer.take(); // Remove item from the queue
                    System.out.println("Consumer consumed: " + item);
                    Thread.sleep(1000); // Simulate consumption time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
