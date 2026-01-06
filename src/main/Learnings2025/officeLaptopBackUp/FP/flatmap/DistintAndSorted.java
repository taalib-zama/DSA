package FP.flatmap;

import java.util.Comparator;
import java.util.List;

public class DistintAndSorted {
    public static void main(String[] args) {
        List<String> courses = List.of("Java", "Python", "C++", "JavaScript");
        courses.stream().sorted().forEach(System.out::println);

        System.out.println("**********************************************");

        //sorting in reverse order :
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
