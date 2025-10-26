package officeLapBakcup.Test_Project.src.collections.ComparatorAndComparable.UsingLambdaExperssion;

import java.util.Comparator;

public class CarNameComparator implements Comparator<collections.ComparatorAndComparable.UsingLambdaExperssion.Car> {

    @Override
    public int compare(collections.ComparatorAndComparable.UsingLambdaExperssion.Car car1, collections.ComparatorAndComparable.UsingLambdaExperssion.Car car2) {
        return car1.getCarName().compareTo(car2.getCarName());
    }
}
