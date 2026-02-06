package StreamsQuestions.CalculateAverage;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );


        OptionalDouble avg = people.stream().mapToDouble(Person::getAge)
                .average();
        System.out.println(avg.orElse(0.0));

    }
}
