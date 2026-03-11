package StreamsOperations;

import collections.comparableImplementation.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static java.util.Collections.min;

public class GroupingOperations {

    static List<Employees> employeesList = List.of(
            new Employees("Alice", "IT", 70000.0, "New York", "Software Engineer"),
            new Employees("Bob", "HR", 50000.0, "Chicago", "HR Manager"),
            new Employees("Charlie", "IT", 80000.0, "New York", "Senior Software Engineer"),
            new Employees("David", "Finance", 60000.0, "Chicago", "Financial Analyst"),
            new Employees("Eve", "HR", 55000.0, "New York", "Recruiter"));


    public static void main(String[] args) {
        // grouping employees by location. By defauly groupingby will return a list of employees for each location.
        Map<String, List<Employees>> employeesByLocation  = employeesList.stream().
                collect(Collectors.groupingBy(Employees::getLocation));
        System.out.println("Employees by location : "+employeesByLocation);


        //collecting the grouped data to a set.
        Map<String, Set<Employees>> employeesByDepartment = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.toSet()));
        System.out.println("Employees by department : "+employeesByDepartment);

        //grouping by department and then by designation
        Map<String, Map<String, List<Employees>>> employeesByDepartmentAndDesignation = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.groupingBy(Employees::getDesignation)));
        System.out.println("Employees by department and designation : "+employeesByDepartmentAndDesignation);

        //get a map where key is the name of department and value is the employee that as highest salary there.
        Map<String, Optional<Employees>> highestSalaryInDepartment  = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.maxBy(Comparator.comparing(Employees::getSalary))));
        System.out.println("Highest salary in department : "+highestSalaryInDepartment);


        // Map where the key is the name of the country and the value is the sum of salaries of all of the employees of that country.
        Map<String, Double> totalSalaryByLocation = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getLocation, Collectors.summingDouble(Employees::getSalary)));
        System.out.println("Total salary by location : "+totalSalaryByLocation);

        // grouping by department and then calculating the average salary for each department.
        Map<String, Double> averageSalaryByDepartment = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));

        System.out.println("Average salary by department : "+averageSalaryByDepartment);

        // use concurrent groupingByConcurrent().
        ConcurrentMap<String,List<Employees>> employeeMap = employeesList.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employees::getLocation));
        System.out.println("Employees by location using groupingByConcurrent : "+employeeMap);


        // 


    }


}
