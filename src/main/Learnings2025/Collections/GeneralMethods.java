package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GeneralMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        ));
        System.out.println("Original List: " + values);
        System.out.println("Size of list: " + values.size());
        System.out.println("Is list empty? " + values.isEmpty());
        System.out.println("Does list contain 5? " + values.contains(5));
        System.out.println("Index of 5: " + values.indexOf(5));
        System.out.println("Last index of 5: " + values.lastIndexOf(5));
        System.out.println("Sublist from index 2 to 5: " + values.subList(2, 5));
        System.out.println("Remove element at index 3: " + values.remove(3));
        System.out.println("Remove using object 5: " + values.remove(Integer.valueOf(5)));

        Stack<Integer> testStack = new Stack<>();
        testStack.addAll(Arrays.asList(
                1, 6, 7, 8, 9, 10
        ));

        System.out.println("List contains all elements of stack? " + values.containsAll(testStack));

    }
}
