package collections.comparableImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee(341, "John", 35000.00);
        Employee employee2 = new Employee(103, "Sam", 30000.00);
        Employee employee3 = new Employee(221, "Albert", 40000.00);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        //Displaying unsorted objects.
        System.out.println(employeeList);

        //performing sort on employeeList.
        Collections.sort(employeeList);
        // Sorted objects are displayed below.
        for (Employee e : employeeList) {
            System.out.println(e.employeeId + " " + e.name + " " + e.salary);
        }

        //using method-"compareTo".
        System.out.println(employee1.compareTo(employee2));
        System.out.println(employee2.compareTo(employee3));

    }

}
