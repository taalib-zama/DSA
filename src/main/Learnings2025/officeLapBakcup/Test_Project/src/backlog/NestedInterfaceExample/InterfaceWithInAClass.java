package backlog.NestedInterfaceExample;

public class InterfaceWithInAClass {
    protected interface Bird {
        void fly();

        interface NonFlyingBird {
            void canRun();
        }
    }
}
