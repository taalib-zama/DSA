package FP.flatmap.usingmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> result;
        result= numbers.stream().filter(num -> num %2==0).map(num -> num * num).collect(Collectors.toList());
        System.out.println(result);


        //GIVING CUBES.
        System.out.println("Cubes of odd numbers");
        numbers.stream().filter(num -> num %2!=0).map(num -> num * num * num).forEach(System.out::println);






    }
}
