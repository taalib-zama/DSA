package officeLapBakcup.Test_Project.src.collections.ComparatorAndComparable.UsingLambdaExperssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingCustomCarComaprator {
    public static void main(String[] args) {
        List<collections.ComparatorAndComparable.UsingLambdaExperssion.Car> cars = new ArrayList<>(List.of(
                new collections.ComparatorAndComparable.UsingLambdaExperssion.Car("Toyota", "Sedan"),
                new collections.ComparatorAndComparable.UsingLambdaExperssion.Car("Honda", "SUV"),
                new collections.ComparatorAndComparable.UsingLambdaExperssion.Car("Honda", "EV"),
                new collections.ComparatorAndComparable.UsingLambdaExperssion.Car("Ford", "Truck")
        ));

        Collections.sort(cars, new CarNameComparator());
        cars.forEach(car ->
            System.out.println("Car Name: " + car.getCarName() + ", Car Type: " + car.getCarType())
        );

    }
}
