package lambdaExpressions.userDefinedClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Tester {
    public static void main(String[] args) {
        //List of employee objects.
        List<Employee> empList = Arrays.asList(new Employee("T1001","Arnold",50000,"Manager"),
                new Employee("T1002","Zarvis",35000,"Consultant"),new Employee("T1003","Mathew",65000,"Manager"),
                new Employee("T1004","Santana",40000,"Associate"));

        /**
         * 		1. Adding 5000 to the salary of employees, who are "Manager":
         */
        for(Employee e : empList) {

            //Displaying Salary of all Employees before Increment using "Consumer":
            Consumer<Employee> beforeInc = emp -> System.out.println(e.getEmpName()+" ("+e.getEmpRole()+") "+" had salary before Increment: "+e.getSalary());
            beforeInc.accept(e);

            //Increment Salary of only Managers using "Function":
            Function<Employee,Integer> salaryIncrease = emp -> e.getEmpRole().equals("Manager")?e.getSalary()+5000:e.getSalary();
            e.setSalary(salaryIncrease.apply(e));

            //Displaying Salary of all Employees after Increment using "Consumer":
            Consumer<Employee> afterInc = emp -> System.out.println(e.getEmpName()+" ("+e.getEmpRole()+") "+" has salary after Increment: "+e.getSalary());
            afterInc.accept(e);
        }
    }
}
