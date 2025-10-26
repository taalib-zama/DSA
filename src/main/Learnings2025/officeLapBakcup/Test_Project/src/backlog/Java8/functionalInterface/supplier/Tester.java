package backlog.Java8.functionalInterface.supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("TAT", "GeeksQuiz", "Geeks2", "geeks2", "Gi");

        //use of predicate function.
        Predicate<String> p = (s) -> s.startsWith("G");

        //iterate throuh the list to call the test method.
        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
