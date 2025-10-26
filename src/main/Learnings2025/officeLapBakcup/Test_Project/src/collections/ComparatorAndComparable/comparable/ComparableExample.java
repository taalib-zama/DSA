package collections.ComparatorAndComparable.comparable;

import java.util.Arrays;

public class ComparableExample {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 30),
                new Employee("Bob", 25),
                new Employee("Charlie", 35)
        };

        Arrays.sort(employees); // Sort using Comparable
        System.out.println(Arrays.toString(employees));
    }
}
