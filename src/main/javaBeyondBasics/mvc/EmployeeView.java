package mvc;

public class EmployeeView {
    // class which represents the view :
    //view represents the visualization of data received from the model. The view layer consists of output of
    // application or user interface.
    // It sends the requested data to the client, that is fetched from model layer by controller.

        // method to display the Employee details
        public void printEmployeeDetails (String EmployeeName, String EmployeeId, String EmployeeDepartment){
            System.out.println("Employee Details: ");
            System.out.println("Name: " + EmployeeName);
            System.out.println("Employee ID: " + EmployeeId);
            System.out.println("Employee Department: " + EmployeeDepartment);
        }

}
