package inheritence;

public class Cycle extends TwoWheelers {

    public Cycle() {
        super("Cycle Chain");
        System.out.println("Cycle constructor called");
    }

    @Override
    public void drive() {
        System.out.println("Cycle Drive");
    }

    @Override
    public void steer() {
        System.out.println("Cycle steer");
    }
}
