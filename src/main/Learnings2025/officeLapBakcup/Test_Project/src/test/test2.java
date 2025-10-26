package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class test2 {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        //Longest string in a list.
        Optional<String> longest= strings.stream().reduce((a,b) -> a.length() > b.length() ? a : b);
        System.out.println("Longest string: " + longest.orElse("No strings available"));

}
}
