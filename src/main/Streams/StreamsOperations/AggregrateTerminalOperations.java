package StreamsOperations;

import lombok.extern.slf4j.Slf4j;


import java.util.*;
import java.util.stream.Collectors;

public class AggregrateTerminalOperations {


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product A", 20.0, 2));
        products.add(new Product("Product B", 10.0, 1));
        products.add(new Product("Product C", 15.0, 3));
        products.add(new Product("Product C", 10.0, 4));

        // Calculate the total price of all products
        Long totalPrice = products.stream()
                .filter(product -> product.getPrice() < 20.0) // Filter products with price greater than 10.0
                .count();

        //collecting total price
        Double price = products.stream().mapToDouble(Product::getPrice).sum();

        //average
        Double averagePrice = products.stream().collect(Collectors.averagingDouble(product -> product.getPrice()));
        System.out.println("Average Price: " + averagePrice);

        //we have an ArrayList of Employee objects and we need to find the Product object with a minimum price.
        Optional<Product> minPriceProduct = products.stream()
                .min(Comparator.comparing(Product::getPrice));
        System.out.println();

        //min and max
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));
        employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Dave", 34, 56000));
        employeeList.add(new Employee("Jodi", 43, 67000));
        employeeList.add(new Employee("Ryan", 53, 54000));

        //grouping operations.
        // find the employee with minimum salary :
        Optional<Employee> employeeWithMinSalary = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
        // fallback log when empty
        if (!employeeWithMinSalary.isPresent()) {
            System.out.println("No employees found to determine minimum salary");
        }
        else {
            System.out.println("Employee with minimum salary: " + employeeWithMinSalary);
        }

        //employee with max salary
        Optional<Employee> employeeMaxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println("Employee with maximum salary: " + employeeMaxSalary);


    }
}
