package inheritence;

public class InheritenceDemo {

    public static void main(String[] args) {
        //Creating inline/anonymous class
        Automobile automobile1 = new Automobile() {
            @Override
            public void drive() {
                System.out.println("Inline drive");
            }
        };
        automobile1.drive();

        /*

         */

        Automobile automobile2 = new TwoWheelers("Inline driveTrain") {
            @Override
            public void steer() {
                System.out.println("Inline twoWheeler steer");
            }

            @Override
            public void drive() {
                System.out.println("Inline twoWheeler drive");
            }
        };
        automobile2.drive();
        automobile2.status();
//        automobile2.steer();
//        automobile2.getNumberOfWheels();

        /*

         */

        TwoWheelers twoWheelers1 = new TwoWheelers("Inline driveTrain") {
            @Override
            public void steer() {
                System.out.println("Inline twoWheeler steer");
            }

            @Override
            public void drive() {
                System.out.println("Inline twoWheeler drive");
            }
        };
        twoWheelers1.drive();
        twoWheelers1.status();
        twoWheelers1.steer();
        twoWheelers1.getNumberOfWheels();
    }
}


