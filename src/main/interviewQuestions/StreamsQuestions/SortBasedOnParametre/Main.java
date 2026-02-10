package StreamsQuestions.SortBasedOnParametre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Collections.synchronizedList( List.of(
                new Employee(1,"John", 30, 95.00),
                new Employee(2,"John", 30, 55.00),
                new Employee(3,"John", 30, 65.00),
                new Employee(4,"John", 29, 65.00)

        ));
        //sort based on salalry then age.
        /*List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary)
                        .reversed().thenComparing(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sorted);
*/
/*


        employees.sort(Comparator.comparingDouble(Employee::getSalary)
                .reversed()
                .thenComparingInt(Employee::getAge).reversed());

        System.out.println(employees);
*/

        synchronized (employees) {
            employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                    .thenComparingInt(Employee::getAge));
            System.out.println(employees);
        }
        }
}
