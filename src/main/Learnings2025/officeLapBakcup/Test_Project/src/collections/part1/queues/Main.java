package collections.part1.queues;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //max priority queue
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(15);

        // Add elements to the max queue
        maxQueue.add(10);
        maxQueue.add(20);
        maxQueue.add(15);
        // Print the elements of the queue
        System.out.println("Priority Queue (Min): " + queue);
        System.out.println("Priority Queue (Max): " + maxQueue);

    }
}
