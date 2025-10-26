package test.intrerfacestest;

public interface TestInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

}
