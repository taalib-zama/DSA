package Interfaces.defaultMethods;

public interface Vehicle {
    void cleanVehicle();

    //one abstract and one default method
    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}
