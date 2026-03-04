package StreamsQuestions.StreamSorting;

import java.util.List;
import java.util.Optional;

public class UsingReduce {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        // Using reduce to find the sum of all elements in the list
        Optional<Integer> result = arr.stream().reduce((a, b) -> a+b);
        System.out.println("Sum of all elements: " + result.orElse(0));
    }
}
