package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingCustomCarComaprator {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("Toyota", "Sedan"),
                new Car("Honda", "SUV"),
                new Car("Honda", "EV"),
                new Car("Ford", "Truck")
        ));

        Collections.sort(cars, new CarNameComparator());
        cars.forEach(car ->
            System.out.println("Car Name: " + car.getCarName() + ", Car Type: " + car.getCarType())
        );

    }
}
