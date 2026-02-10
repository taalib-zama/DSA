package FPQuestions.flatmap.streamoperations.distincetAndSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //get the distince elements in a list
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        numbers.stream().distinct().forEach(System.out::println);

        System.out.println("----------------------------------------------");

        numbers.stream().sorted().forEach(System.out::println);



        //sorting strings in stream.
        List<String> courses = List.of("Java", "Python", "C++", "JavaScript");
        courses.stream().sorted().forEach(System.out::println);



        //Sorting in Reverse Order
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        //custom comparators : based on length
        courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(System.out::println);
    }
}
