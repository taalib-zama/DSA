package mvc;

public class EmployeeController {
    // class which represent the controller
    //The controller layer gets the user requests from the view layer and processes them,
    // with the necessary validations. It acts as an interface between Model and View.
    // The requests are then sent to model for data processing. Once they are processed,
    // the data is sent back to the controller and then displayed on the view.

        // declaring the variables model and view
        private Employee model;
        private EmployeeView view;

        // constructor to initialize
        public EmployeeController(Employee model, EmployeeView view) {
            this.model = model;
            this.view = view;
        }

        // getter and setter methods
        public void setEmployeeName(String name){
            model.setName(name);
        }

        public String getEmployeeName(){
            return model.getName();
        }

        public void setEmployeeId(String id){
            model.setId(id);
        }

        public String getEmployeeId(){
            return model.getId();
        }

        public void setEmployeeDepartment(String Department){
            model.setDepartment(Department);
        }

        public String getEmployeeDepartment(){
            return model.getDepartment();
        }

        // method to update view
        public void updateView() {
            view.printEmployeeDetails(model.getName(), model.getId(), model.getDepartment());
        }
    }

