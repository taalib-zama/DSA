package collections.ComparatorAndComparable.UsingLambdaExperssion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sort by string length
        names.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(names);
    }
}
