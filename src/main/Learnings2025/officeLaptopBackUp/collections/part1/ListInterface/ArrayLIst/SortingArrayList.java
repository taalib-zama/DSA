package collections.part1.ListInterface.ArrayLIst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);
        List<Integer> numbersCopy = new ArrayList<>(numbers);

        System.out.println("Before : " + numbers);

        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers);

        System.out.println("After : " + numbers);       // this modifies the original list.


        //sorting numbers copy with comparator
        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        numbersCopy.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });

        // The above `sort()` method call can also be written simply using lambda expression
        numbersCopy.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        numbersCopy.sort(Comparator.naturalOrder());
        System.out.println("Sorted numbers : " + numbersCopy);







    }
}
