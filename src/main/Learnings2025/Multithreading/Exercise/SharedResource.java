package Multithreading.Exercise;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedqueue;
    private int bufferSize;
    //buffersize to determine the maximum size of the queue


    //Constructor to initialize the shared resource with a specific buffer size
    //Using linked list as the underlying data structure for the queue
    // If size of the queue is less than buffer size, producer can add items
    public SharedResource(int bufferSize){
        sharedqueue = new LinkedList<>();
        this.bufferSize = bufferSize;
        System.out.println("Shared resource initialized with buffer size: " + bufferSize);
    }


    public synchronized void produce(int item) throws Exception {

    }

    public synchronized void consume() throws Exception {
        //If buffer is empty, wait for the producer to produce an item
        while(sharedqueue.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting for producer to produce an item");
            wait();
        }
        //Remove item from the queue
        int item = sharedqueue.poll();
        System.out.println("Consumed item: " + item + ", Current buffer size: " + sharedqueue.size());
        //Notify the producer that an item has been consumed and space is available in the buffer
        notifyAll();
    }

    public void addItem() {
    }
}
