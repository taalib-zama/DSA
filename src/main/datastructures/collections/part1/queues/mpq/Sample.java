package collections.part1.queues.mpq;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Sample {
    //custom ordering mpq
    public static void main(String[] args) {
        // Custom comparator for descending order filtering the values less than or equal to 5
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(x -> x > 5 ? x : -1));

        // Add elements
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Poll elements (largest first)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: 20, 15, 10, 5
        }
    }
}
