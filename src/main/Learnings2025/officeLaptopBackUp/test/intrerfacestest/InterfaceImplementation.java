package test.intrerfacestest;

public class InterfaceImplementation implements TestInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    // You can also override the default method if needed
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in implementation");
    }

    // The static method from the interface can be called directly using the interface name
    public static void callStaticMethod() {
        TestInterface.staticMethod();
    }
}
