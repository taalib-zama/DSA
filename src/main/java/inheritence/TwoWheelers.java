package inheritence;

public abstract class TwoWheelers implements Automobile {
    private Integer numberOfWheels;

    private String driveTrain;

    public TwoWheelers(String driveTrain) {
        System.out.println("Two Wheelers Constructor called");
        numberOfWheels = 2;
        this.driveTrain = driveTrain;
    }
    /*
    We may or may not have an abstract method here
     */

    public abstract void steer();

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }
}
