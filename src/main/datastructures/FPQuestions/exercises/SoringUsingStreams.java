package FPQuestions.exercises;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class SoringUsingStreams {
    public static void main(String[] args) {
        List<String> courses = List.of("Java", "Python", "C++", "JavaScript", "Java");


        Set<String> sortedCourses = courses.stream()
                .sorted() // Sort the courses in natural order
                .collect(Collectors.toCollection(LinkedHashSet::new)); // Collect the sorted courses into a Set

        //print the set sortedCourses
        System.out.println("Sorted Courses: " + sortedCourses);

        //sorting in reverse order. Also remove duplicates.
        System.out.println("**********************************************");
        courses.stream()
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .forEach(System.out::println);
    }
}
