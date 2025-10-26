package backlog.NestedInterfaceExample;

public class Bird3ImplementsBoth implements Bird, Bird.NonFlyingBird {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }


    @Override
    public void canRun() {

    }
}
