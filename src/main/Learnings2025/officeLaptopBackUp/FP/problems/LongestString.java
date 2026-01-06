package FP.problems;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");
        Optional<String> longestString = strings.stream().max(
                (s1, s2) -> Integer.compare(s1.length(), s2.length())
        );

        String smallestString = strings.stream()
                .reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2)
                .orElse("No strings available");

        String smallestString2 = String.valueOf(strings.stream().map(String::length)
                .reduce((s1, s2) -> s1 < s2 ? s1 : s2)
                .orElse(Integer.valueOf("No strings available")));

        System.out.println(longestString.get());
    }
}
