package FP.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenNos {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        // Using a stream to filter even numbers
        HashMap<Integer, Boolean> evenNumbersMap = (HashMap<Integer, Boolean>) list.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .collect(Collectors.toMap(n -> n, n -> true));



        //to map default define hashmap.
        //iterate the hashmap to collect elements with true.
        List<Integer> evenNumbersList = evenNumbersMap.entrySet().stream()
                .filter(Map.Entry::getValue) // Filter entries with value true
                .map(Map.Entry::getKey) // Get the keys (even numbers)
                .toList(); // Collect to a List

        System.out.println("Even numbers: " + evenNumbersList);
    }
}
