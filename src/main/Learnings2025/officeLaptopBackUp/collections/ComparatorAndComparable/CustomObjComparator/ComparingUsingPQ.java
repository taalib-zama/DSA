package collections.ComparatorAndComparable.CustomObjComparator;

import java.util.PriorityQueue;

public class ComparingUsingPQ {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>((p1, p2) -> {
            // Custom comparator to sort by age in descending order
            return p2.age.compareTo(p1.age);
        });
        // Adding Person objects to the priority queue

        // Add elements
        pq.add(new Person("Alice", 30));
        pq.add(new Person("Bob", 25));
        pq.add(new Person("Charlie", 35));


        // Poll elements (youngest first)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: Bob (25), Alice (30), Charlie (35)
        }
    }
}
