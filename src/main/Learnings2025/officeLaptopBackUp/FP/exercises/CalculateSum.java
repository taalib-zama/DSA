package FP.exercises;

import java.text.MessageFormat;
import java.util.List;


import java.util.stream.Collectors;

public class CalculateSum {
    public static void main(String[] args) {

        //private static final Logger logger = LoggerFactory.getLogger(PlaceholderExample.class);
        List<Integer> numbers = List.of(1, 2, 3,1);
        // Calculate the sum of the numbers in the list
        Integer sum = numbers.stream()
                .reduce(0, (x, y) -> x + y);
        //explaning the reduce method:
        // The first argument (0) is the identity value, which is the initial value of the sum.
        // The second argument is a lambda function that takes two parameters (x and y) and returns their sum.
        System.out.println("The sum of the numbers in the list is: " + sum);

        //sum of cubes.
        Integer sum2 = numbers.stream().map(x -> x*x*x).reduce(0, (x, y) -> x + y);


        Integer sumWithoutDuplicates = numbers.stream()
                .distinct() // Remove duplicates
                .mapToInt(Integer::intValue) // Convert to int
                .sum();

        //or
        Integer sumWithoutDuplicates2 = numbers.stream()
                .distinct() // Remove duplicates
                .reduce(0, (x, y) -> x + y);

        System.out.println(MessageFormat.format("Sum without duplicates: {0}", sumWithoutDuplicates2));
    }
}
