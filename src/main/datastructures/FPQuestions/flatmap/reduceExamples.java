package FPQuestions.flatmap;

import java.util.Arrays;
import java.util.List;

public class reduceExamples {
    public static void main(String[] args) {
        List<Integer> sample = List.of(12, 9, 13, 4, 6);
        int sum = sample.stream().reduce(0, (a,b) -> b);
        int max = sample.stream().reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(sum);

        //this won't work for negative numbers.
        List<Integer> list2 = Arrays.asList(-1,-4, -4, -5, -7 ,-8 ,-9);
        int max1 = list2.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x:y);
        System.out.println(max1);


        //keeping intital as max int as if we keep it as 0, the min comparion will always be 0
        int min = sample.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
        System.out.println(min);


        int maxOfSquares = sample.stream().map(x-> x*x).reduce(Integer.MIN_VALUE, (x,y) -> x+y);

        int sumOfOddNumbers = sample.stream().filter(x -> x%2 != 0).reduce(0, (x,y) -> x+y);

    }
}
