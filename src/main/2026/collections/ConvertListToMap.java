package collections;


import java.util.List;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "delhi", 40000),
                new Person("Bob", 25 , "mumbai", 50000),
                new Person("Charlie", 35 , "bangalore", 60000)
        );
        // print the opriginal list

        // Convert List to Map using name as key and age as value
        var peopleMap = people.stream()
                .collect(java.util.stream.Collectors.toMap(Person::getName, Person::getAge));
        // Print the resulting Map
        System.out.println("\nConverted Map:");
        peopleMap.forEach((name, age) -> System.out.println(name + ": " + age));
    }
}
