package polymorphism;

import inheritence.AdvMotorcycles;
import inheritence.MotorCycle;
import inheritence.TwoWheelers;

public class MethodOverridingDemo {
    public static void main(String[] args) {

        //Check the sequence of constructors called
        MotorCycle motorCycle1 = new AdvMotorcycles();

        motorCycle1.drive();
        System.out.println(motorCycle1.getSuspension());
        System.out.println(motorCycle1.getDriveTrain());
        System.out.println(motorCycle1.getNumberOfWheels());
        motorCycle1.steer();

        System.out.println();

//        TwoWheelers twoWheelers1 = TwoWheelerFactory.getTwoWheelerInstance(ADV_MOTORCYCLE);

        TwoWheelers twoWheelers1 = new AdvMotorcycles();
        twoWheelers1.drive();
        twoWheelers1.steer();
        twoWheelers1.status();
//        twoWheelers1.getSuspension();
        System.out.println(twoWheelers1.getDriveTrain());
    }
}
