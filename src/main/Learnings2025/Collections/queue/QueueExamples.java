package Collections.queue;

import java.util.PriorityQueue;

public class QueueExamples {
    //minHeapQueue
    //maxHeapQueue
    PriorityQueue<Integer> minHeapQueue = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeapQueue = new PriorityQueue<>((a, b) -> b - a);

    public static void main(String[] args) {
        QueueExamples queueExamples = new QueueExamples();
        queueExamples.minHeapQueue.add(5);
        queueExamples.minHeapQueue.add(1);
        queueExamples.minHeapQueue.add(3);

        queueExamples.maxHeapQueue.add(5);
        queueExamples.maxHeapQueue.add(1);
        queueExamples.maxHeapQueue.add(3);

        System.out.println("Min Heap Queue: " + queueExamples.minHeapQueue);
        System.out.println("Max Heap Queue: " + queueExamples.maxHeapQueue);
    }
}
