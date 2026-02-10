
package FPQuestions.flatmap;

import java.util.HashMap;
import java.util.List;

public class PrintCourses {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        //printing courses with letter spring in it.
        System.out.println("Courses related to spring");
        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);  // Print each course name


        System.out.println("Courese name with > 4 letters");
        courses.stream().filter(course->course.length()>4)
                .forEach(System.out::println);


        //ex - 6 - Printing the Number of Characters in Course Names
        System.out.println("Printing the Number of Characters in Course Names");
        HashMap<String, Integer> result = new HashMap<>();
        courses.stream().forEach(course->result.put(course, course.length()));
        //print the hashmap result.
        System.out.println(result);







    }
}

