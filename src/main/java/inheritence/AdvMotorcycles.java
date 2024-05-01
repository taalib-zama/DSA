package inheritence;

import java.io.FileNotFoundException;

public class AdvMotorcycles extends MotorCycle {


    public AdvMotorcycles() {
        super("Adjustable suspension");
        System.out.println("ADV Motorcycles Constructor called");
    }

    @Override
    public void drive() {
        System.out.println("ADV Motorcycle drive");
    }

    @Override
    public String status() {
        return "ADV Motorcycle status";
    }
}
