package test.intrerfacestest;

public class ForeignClassUsingInterface {
    // Method returning an interface type
    public TestInterface getInterfaceInstance() {
        return new InterfaceImplementation(); // Return an object of the implementing class
    }

    // Method using the interface type as a parameter
    public void useInterface(TestInterface testInterface) {
        testInterface.abstractMethod(); // Call the abstract method
        testInterface.defaultMethod(); // Call the default method
        TestInterface.staticMethod(); // Call the static method from the interface
    }


}
