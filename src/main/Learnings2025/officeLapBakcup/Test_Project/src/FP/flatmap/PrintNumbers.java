package FP.flatmap;

import java.util.Arrays;
import java.util.List;

public class PrintNumbers {
    public static void main(String[] args) {
        //Print a set of numbers, each on a separate line.
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        numbers.stream().map(number -> number % 2 == 0)
                .forEach(System.out::println);




    }
}
