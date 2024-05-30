package streams.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(5,10,15,20,25);
        //applying stream.
        //filter out numbers greater than 10.
        //by default streams work in sequence.
        test.stream().filter(x->x%2 == 0).filter(x->x>10).forEach(System.out::println);

        //to make them parallel.
        test.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        //using map.
        test.stream().map(x->x*2).collect(Collectors.toList()).forEach(System.out::println);


        List<Integer> number = Arrays.asList(2,3,4,5);
        int resEven = number.stream().filter(x-> x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(resEven);



        //Print strings that begin with "a" and ends with "c" in lexicographic order.
        String arr[] = {"abc", "cde", "acd",
                "aec", "xyz"};
        Arrays.stream(arr).filter(x -> x.startsWith("a")).filter(x -> x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);






    }
}
