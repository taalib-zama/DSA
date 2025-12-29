package backlog.NestedInterfaceExample;

public class Bird2 implements Bird.NonFlyingBird{
    @Override
    public void canRun() {
        System.out.println("Bird is running");
    }
}
