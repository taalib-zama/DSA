package backlog.NestedInterfaceExample;

public interface Bird {
    public void fly();

    public interface NonFlyingBird{
        public void  canRun();
    }
}
