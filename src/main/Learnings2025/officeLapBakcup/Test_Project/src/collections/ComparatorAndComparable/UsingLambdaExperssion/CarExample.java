package collections.ComparatorAndComparable.UsingLambdaExperssion;

import java.util.Arrays;
import java.util.Comparator;

public class CarExample {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", "Sedan"),
            new Car("Honda", "SUV"),
            new Car("Honda", "EV"),
            new Car("Ford", "Truck")
        };

        Arrays.sort(cars, Comparator.comparing(Car ::getCarName)
                .thenComparing(Car::getCarType));
        for (Car car : cars) {
            System.out.println("Car Name: " + car.getCarName() + ", Car Type: " + car.getCarType());
        }
    }
}
