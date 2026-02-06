package FPQuestions.flatmap.lambdaExample;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersUsingLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        numbers.stream()                // Convert the list to a stream
                .filter(number->number % 2==0).sorted() // Filter to select even numbers
                .forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
