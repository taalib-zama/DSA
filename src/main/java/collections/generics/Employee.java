package collections.generics;

import java.util.ArrayList;

public class Employee {
    private int empId;
    public Employee(int empId){
        this.empId = empId;
    }

    public static void main(String[] args) {
        ArrayList<Employee> elist = new ArrayList<Employee>(); //using generics with user defined class Employee as a type.
        elist.add(new Employee(101));
        elist.add(new Employee(102));
        elist.add(new Employee(103));
    }

}
