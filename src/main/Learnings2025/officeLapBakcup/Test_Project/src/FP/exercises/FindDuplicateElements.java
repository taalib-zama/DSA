package FP.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 7, 3, 8, 9, 1);

        /*// Find duplicate elements
        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Group by element and count occurrences
                .entrySet().stream() // Convert to stream of map entries
                .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
                .map(Map.Entry::getKey) // Extract the keys (duplicate elements)
                .collect(Collectors.toList()); // Collect into a list

        System.out.println("Duplicate elements: " + duplicates);*/

        // Find duplicate elements with intermediate results printed
        List<Integer> duplicates = numbers.stream()
                .peek(n -> System.out.println("Original element: " + n)) // Print original elements
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                // Group by element and count occurrences
                .entrySet().stream()
                .peek(entry -> System.out.println("Grouped entry: " + entry)) // Print grouped entries
                .filter(entry -> entry.getValue() > 1)
                .peek(entry -> System.out.println("Filtered entry (count > 1): " + entry)) // Print filtered entries
                .map(Map.Entry::getKey)
                .peek(key -> System.out.println("Duplicate key: " + key)) // Print duplicate keys
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
    }

}
