package StreamsQuestions.countOccourencesOfElements;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("apple","x", "banana", "orange", "apple", "orange", "banana", "apple");
        //count the occourences of each element in the list
        //apple - 2, banana -3
        Map<String, Integer> result = items.stream()
                .collect(Collectors.toMap(
                        item -> item,
                        item -> 1,
                        Integer::sum
                ));

        //or
        Map<String, Long> result1 = items.stream().collect((Collectors.groupingBy(Function.identity(), Collectors.counting())));


        //using groupingBY
        Map<String, Long> result2 = items.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(result);
        System.out.println(result2);
    }
}
