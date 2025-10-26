package FP.flatmap.streamoperations.reduce;

import java.util.List;

public class reduceSamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6);

        //sum the numbers.
        int sum = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum
        );



        ///sum of squares of numbers.
        int sumOfSquares = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
        System.out.println(sumOfSquares); //sum of squares

        //finding maximum value in List.

        int max = numbers.stream().reduce(0, Integer::max);
        //or
        int max2 = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
        System.out.println("maximums" + max + " " + max2);

        //To handle negative numbers, we can use Integer.MIN_VALUE as the starting value.
        int max3 = numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        System.out.println("maximums" + max3);


        //finding minimum value :
        int min1 = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a < b ? a : b);


        //SUM OF ODD NUMBERS :
        int sumOfOddNumbers = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
        System.out.println(sumOfOddNumbers);
    }
}
