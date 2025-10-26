package Streams.examples;

import java.util.List;
import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> numbers  = List.of(11, 10, 5, 0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.stream()
                .map(n -> n * 2) // Double each number
                .peek(n -> System.out.println("Mapped value: " + n)) // Print each mapped value
                .filter(n -> n % 2 == 0)
                .sorted(
                        (a, b) -> Integer.compare(b, a) // Sort in descending order
                )// Filter even numbers
                .reduce(
                        0, // Initial value for reduction
                        (a, b) -> a + b // Sum the numbers
                ); // Collect the result into a list


        List<Integer> filterdnumbers2 = numbers.stream()
                .map(n -> n * 2) // Double each number
                .peek(n -> System.out.println("Mapped value: " + n)) // Print each mapped value
                .filter(n -> n % 2 == 0)
                .sorted(
                        (a, b) -> Integer.compare(b, a) // Sort in descending order
                )// Filter even numbers
                .toList();// Collect the result into a list


        Optional<Integer> min = numbers.stream().min(
                (a, b) -> Integer.compare(a, b) // Compare integers in ascending order
        );
        Optional<Integer> max = numbers.stream().max(
                (a, b) -> Integer.compare(a, b) // Compare integers in ascending order
        ); 

        System.out.println(min.orElse(-1)); // Print the minimum value or -1 if empty
        System.out.println(max.orElse(-1)); // Print the maximum value or -1 if empty











    }
}
