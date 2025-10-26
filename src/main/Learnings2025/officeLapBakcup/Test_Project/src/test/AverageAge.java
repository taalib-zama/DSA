package test;

import java.util.Arrays;
import java.util.List;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        persons.forEach(person -> {
            System.out.println("Name: " + person.getName() + ", Age: " + person.age);
        });

        //find the average age of list of person object using java stream.

        double averageAge = persons.stream()
                .mapToInt(person -> (int) person.getAge()) // Extract ages
                .reduce(0, (a,b) -> a+b) / (double) persons.size();






    }
}
