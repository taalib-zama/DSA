package FP.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Map<Integer, Boolean> numbersStartingWith1 = myList.stream()
                .filter(n -> String.valueOf(n).startsWith("1")) // Filter numbers starting with 1
                .collect(Collectors.toMap(n -> n, n -> true)); // Collect into a Map


        Map<Integer, Boolean> numbersWith1 = myList.stream().filter(n -> String.valueOf(n).contains("1")) // Filter numbers containing 1
                .collect(Collectors.toMap(n -> n, n -> true)); // Collect into a Map
        // Iterate the map to collect elements with true.
        List<Integer> numbersStartingWith1List = numbersStartingWith1.entrySet().stream()
                .filter(Map.Entry::getValue) // Filter entries with value true
                .map(Map.Entry::getKey) // Get the keys (numbers starting with 1)
                .collect(Collectors.toList()); // Collect to a List
        System.out.println("Numbers starting with 1: " + numbersStartingWith1List);


    }
}
