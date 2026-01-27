package officeLaptopBackUp.collections.ComparatorAndComparable.CustomObjComparator;

import java.util.Arrays;

public class Comparator<P> {
    public static void main(String[] args) {
        Integer arr[] = {5, 2, 8, 1, 3};
        Arrays.sort(arr, (Integer a, Integer b) -> a -b);
        ///(Integer a, Integer b) -> a - b is a comparator implemented using a lambda expression.
        //It compares two integers a and b:
        //If a - b is negative, a is considered smaller than b.
        //If a - b is positive, a is considered larger than b.
        //If a - b is zero, a and b are considered equal.
        System.out.println("Sorted array: " + Arrays.toString(arr));


        //sorting of object collection
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
                new Person("Ali", 20)
        };

        //Arrays.sort(people);

        //How to sort the object array
        //sort the people list based age and then based on name using comparator









    }
}
