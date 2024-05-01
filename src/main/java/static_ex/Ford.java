package static_ex;

public class Ford {
    private String modelNo;
    private String color;
    private static int noOfCars; // Creates a class variable
    public Ford(String modelNo, String color) {
        this.modelNo = modelNo;
        this.color = color;
        noOfCars++;    // For every object created, the value of the same variable gets incremented
    }
    //Placing an order to have our object created for us . tThis static method can be called w/o creating object.
    public static Ford orderCar(String model, String color) {
        Ford car = new Ford(model, color);
        return car;
    }
}
