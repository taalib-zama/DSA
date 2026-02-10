package collections.part1.queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        //sample of min max queue
        //by default min priority queue
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

        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Jennifer");
        waitingQueue.add("Angelina");
        waitingQueue.add("Johnny");
        waitingQueue.add("Sachin");


        System.out.println("WaitingQueue : " + waitingQueue);

        // Check if a Queue is empty
        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        // Check if the Queue contains an element
        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);



        //queue iteration
        waitingQueue.forEach(person -> {
            System.out.println("Person in the waiting queue : " + person);
        });



        //cutom PQ based on comparator.
        //The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }



    }
}
