package collections.part1.ListInterface.ArrayLIst.customObjectSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Sachin", 47));
            people.add(new Person("Chris", 34));
            people.add(new Person("Rajeev", 25));
            people.add(new Person("David", 31));

            System.out.println("Person List : " + people);

            // Sort People by their Age
            people.sort((person1, person2) -> {
                return person1.getAge() - person2.getAge();
            });

            // A more concise way of writing the above sorting function
            people.sort(Comparator.comparingInt(Person::getAge));

            System.out.println("Sorted Person List by Age : " + people);

            // You can also sort using Collections.sort() method by passing the custom Comparator
            Collections.sort(people, Comparator.comparing(Person::getName));
            System.out.println("Sorted Person List by Name : " + people);
        }
}
