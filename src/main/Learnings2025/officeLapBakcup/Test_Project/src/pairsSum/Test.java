package pairsSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static boolean findPair(int[] arr, int k) {
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        for (int element : arr) {
            if (visited.containsKey(k - element)){
                System.out.println("the pair elements are : "+(k-element) +"," + element);
                return true;
            }
            else visited.put(element, true);
        }
        return false;

    }

    //do this using stream.
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 1, 7, 2},{8,2,9,5,10,1}};
        int[] k = {3,10};
        for(int i = 0; i < k.length ; i++)
            System.out.println("Pair sum found ? " + findPair(arr[i], k[i]));

        List<Integer> numbers = List.of(4, 5, 1, 7, 2);
        System.out.println("Pair sum found ? " + findPair1(numbers, 3));
    }



    public static boolean findPair1(List<Integer> numbers, int k) {
        Set<Integer> visited = new HashSet<>();
        return numbers.stream()
                .anyMatch(element -> {
                    if (visited.contains(k - element)) {
                        System.out.println("The pair elements are: " + (k - element) + ", " + element);
                        return true;
                    } else {
                        visited.add(element);
                        return false;
                    }
                });
    }
}
