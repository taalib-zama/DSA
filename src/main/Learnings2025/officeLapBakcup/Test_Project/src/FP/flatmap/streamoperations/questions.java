package FP.flatmap.streamoperations;

import java.util.Arrays;
import java.util.List;

public class questions {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5,90, 67,8);

        System.out.println("Printing odd numbers");
        nums.stream().map(num -> num %2 !=0 ).sorted()
                .forEach(System.out::println);


        System.out.println("printing all courses individually");
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

       //using reduce
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);

    }
}
