package streams.sample.averageExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        Student arr[] = {new Student(110, "abc", 70),
                new Student(101, "bcd", 80),
                new Student(120, "xyz", 60)};


        //// Getting the average of the marks
        //        // Mapping each element to getMarks
        //        // Finding the average
        double res = Arrays.stream(arr)
                .mapToInt(x -> x.getMarks())
                .average()
                .getAsDouble();
        System.out.printf("for the average");
        System.out.println(res);

        //Creating a map and loading it with
        //        // roll no and name of the student using
        //        // the Collectors.toMap() method
        Map<Integer, String> m
                = Arrays.stream(arr)
                .collect(Collectors.toMap(
                        Student::getRoll, Student::getName));
        System.out.printf("creating map");
        System.out.println(m);


        //using .collect() methods.
        Map<Integer, List<Student>> m1
                = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                        Student::getMarks));

        System.out.println(m1);
    }
}
