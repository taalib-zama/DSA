package FPQuestions.flatmap.streamoperations.reduce;

import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum); // Output: 77

        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum2);
    }
}
