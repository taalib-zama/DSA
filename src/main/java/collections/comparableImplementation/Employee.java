package collections.comparableImplementation;

public class Employee implements Comparable<Employee>{
    Integer employeeId;
    String name;
    Double salary;
    Employee(Integer employeeId, String name, Double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    //It compares employeeId of both the objects and returns the result as an integer.
    public int compareTo(Employee employee) {
        //compareTo() receives another Employee object as an argument to compare with the current Employee object.
        if (employeeId == employee.employeeId)
            return 0;
        else if (employeeId > employee.employeeId) {
            return 1;}
        else
            return -1;
    }
    @Override
    //overriding toString method for Employee class.
    public String toString() {
        return this.employeeId+" "+this.name+" "+this.salary;
    }
}


