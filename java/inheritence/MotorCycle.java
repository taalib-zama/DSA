package inheritence;

import java.io.IOException;

public class MotorCycle extends TwoWheelers {
    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    private String suspension;

    public MotorCycle(String suspension) {
        super("Motorcycle drivetrain");
        System.out.println("Motorcycle constructor called");
        this.suspension = suspension;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle drive");
    }

    @Override
    public String status() {
        return "Motorcycle status";
    }

    @Override
    public void steer() {
        System.out.println("Motorcycle steer");
    }
}
