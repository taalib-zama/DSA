package collections.part1.deque;

import java.util.Deque;

public class DequeSample {
    public static void main(String[] args) {
        Deque<String> deque = new java.util.ArrayDeque<>();
        // Adding elements to the deque
        deque.add("First");
        deque.add("Second");
        deque.add("Third");
        // Adding elements to the front of the deque
        deque.addFirst("Zero");
        // Adding elements to the end of the deque
        deque.addLast("Fourth");
        // Displaying the deque
        System.out.println("Deque: " + deque);
        // Removing elements from the front of the deque
        String firstElement = deque.removeFirst();
    }
}
