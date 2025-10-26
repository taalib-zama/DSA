package FP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("************");
        System.out.println("Convrt each word to uppercase");
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords);

    }

    //using normal approach/
   /* private static void printAllNumbersInListStructured(java.util.List<Integer> numbers) {
        // How to loop the numbers?
        for (int number : numbers) {
            System.out.println(number);
        }
    }*/

    //refactoring the above approach to functional programming.
    //Instead of explicitly looping through each element in the list, we can leverage streams.
    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // Convert the list to stream
        numbers.stream().sorted()
                // For each element in the stream, print the element
                .forEach(System.out::println);

        Stream<Integer> stream = numbers.stream();

    }




}
