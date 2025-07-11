package Streams.UsingmMapToInt;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define a list of Employee objects
        List<Employee> employees = List.of(
                new Employee("Alice", 30, "Engineer"),
                new Employee("Bob", 25, "Designer"),
                new Employee("Charlie", 35, "Manager")
        );

        // Use mapToInt to extract ages and calculate the total
        int totalAge = employees.stream()
                .mapToInt(Employee::getAge) // Map each Employee to their age
                .sum(); // Sum up the ages

        System.out.println("Total age of employees: " + totalAge);
    }
}
