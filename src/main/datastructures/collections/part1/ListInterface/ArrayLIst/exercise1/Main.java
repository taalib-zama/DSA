package collections.part1.ListInterface.ArrayLIst.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));



        //Find employees aged over 50#
        List<Employee> employeesOver50 = list.stream()
                .filter(employee -> employee.getAge() > 50)
                .toList();
        System.out.println(employeesOver50);

        //Find employees from USA
        boolean removed = list.removeIf(e -> "USA".equalsIgnoreCase(e.getCountry()));
        System.out.println("Any removed? " + removed);
        System.out.println("Remaining employees:");
        list.forEach(System.out::println);


        //Sort employees by country (IN-PLACE)
        list.sort(Comparator.comparing(Employee::getCountry)); // ascending country
        list.forEach(System.out::println);


    }



}
