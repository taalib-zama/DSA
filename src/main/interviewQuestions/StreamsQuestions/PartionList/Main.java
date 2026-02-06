package StreamsQuestions.PartionList;

import java.net.Inet4Address;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        System.out.println(partitioned);

        //above condition only partitions based on odd even if we want more conditions
        System.out.println("partitioning based on multiple conditions");
        Map<String, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : n % 3 == 0 ? "Multiple of 3" : "Odd"));

        System.out.println(grouped);


        List<String> items = List.of("apple", "banana", "orange", "apple", "orange", "banana", "apple");
        //partition based on length of elements.
        Map<Boolean, List<String>> partitionedByLength = items.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));

    }
}
