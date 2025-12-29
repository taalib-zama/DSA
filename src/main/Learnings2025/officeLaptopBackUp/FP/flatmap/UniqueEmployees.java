package FP.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueEmployees {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Arrays.asList("Java", "Python")),
                new Employee("Bob", Arrays.asList("JavaScript", "Python")),
                new Employee("Charlie", Arrays.asList("Java", "SQL"))
        );

        List<String> uniqueSkills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .distinct()
                .collect(Collectors.toList());

        //find employees that have atleast one conflicting skills and store them in HashSet
        Set<Employee> employeesWithConflictingSkills = employees.stream()
       .filter(employee -> employee.getSkills().stream().anyMatch(skill -> skill.equals("Java")))
        .collect(Collectors.toSet());


        System.out.println(employeesWithConflictingSkills);  // Output: [Alice, Charlie]

        System.out.println(uniqueSkills);  // Output: [Java, Python, JavaScript, SQL]

    }

}
