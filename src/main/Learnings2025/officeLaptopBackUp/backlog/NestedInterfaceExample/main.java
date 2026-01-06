package backlog.NestedInterfaceExample;

public class main {
    public static void main(String[] args) {
        Bird1 bird1 = new Bird1();
        bird1.fly();

        Bird.NonFlyingBird obj = new Bird2();
        obj.canRun();
    }
}
