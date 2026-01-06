package backlog.Java8.SRP;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class EmployeeNonRefactoredClass {
    private String employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeDesignation;
    private double employeeSalary;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

 /*   public void save() throws IOException {
        //serialize object into a string representation.
        String objectStr = MyUtils.serializeObject(this);
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = DatabaseConnection.getConnection();
            stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
        public void calculateTax() {
            //calculate tax for the employee
        }
    }

