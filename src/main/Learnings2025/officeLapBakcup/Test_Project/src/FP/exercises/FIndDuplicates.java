package FP.exercises;
import java.util.*;
import java.util.stream.Collectors;


public class FIndDuplicates {


        public static void main(String[] args) {
            // Sample collection with duplicates
            List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3, 7, 8, 4);

            System.out.println("Original collection: " + numbers);

            // Method 1: Find duplicates using frequency counting
            Set<Integer> duplicates = findDuplicates(numbers);
            System.out.println("Duplicate elements: " + duplicates);

            // Method 2: Remove duplicates and calculate sum
            int sumWithoutDuplicates = removeDuplicatesAndSum(numbers);
            System.out.println("Sum after removing duplicates: " + sumWithoutDuplicates);

            // Method 3: Alternative approach - get unique elements first
            List<Integer> uniqueElements = getUniqueElements(numbers);
            System.out.println("Unique elements: " + uniqueElements);

            // Method 4: Sum of only the duplicate values
            int sumOfDuplicates = sumDuplicates(numbers);
            System.out.println("Sum of duplicate values: " + sumOfDuplicates);
        }

        /**
         * Find duplicate elements using streams
         */
        public static Set<Integer> findDuplicates(List<Integer> numbers) {
            return numbers.stream()
                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
        }

        /**
         * Remove duplicates and calculate sum
         */
        public static int removeDuplicatesAndSum(List<Integer> numbers) {
            return numbers.stream()
                    .distinct()  // Remove duplicates
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        /**
         * Get unique elements as a list
         */
        public static List<Integer> getUniqueElements(List<Integer> numbers) {
            return numbers.stream()
                    .distinct()
                    .collect(Collectors.toList());
        }

        /**
         * Calculate sum of only the duplicate values (each duplicate counted once)
         */
        public static int sumDuplicates(List<Integer> numbers) {
            return findDuplicates(numbers)
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        /**
         * Alternative method: Using Set to track seen elements
         */
        public static Set<Integer> findDuplicatesAlternative(List<Integer> numbers) {
            Set<Integer> seen = new HashSet<>();
            return numbers.stream()
                    .filter(n -> !seen.add(n))  // add() returns false if element already exists
                    .collect(Collectors.toSet());
        }

}
