package maps.findwinners;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static List<List<Integer>> findWinners(int[][] matches) {
        //List<List<Integer>> res = new ArrayList<>();
        //Count the number of times a player loses while iterating through the matches.
        /*Map<Integer, Integer> countOfLosses= new HashMap<>();*/
        //iterate the 2nd array

        // create a stream of the array, map to the second element of each pair, collect to a map
       /* Map<Integer, Integer> counts = Arrays.stream(matches)
                .mapToInt(a -> a[1])                             // Extract second element of each pair
                .boxed()                                          // Box int to Integer
                .collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1))); // Collect in map with counts

        // print out the counts
        System.out.println(counts); ==================time complexity 0(n)*/

        //optimizing with also counting the winners in a different hashmap.with same time complexity as above.
        // create a HashMap to store the counts of each number
        Map<Integer, Integer> counts1 = new HashMap<>();    //count of winners
        Map<Integer, Integer> counts2 = new HashMap<>();    //count of loosers

        // iterate over each array[i] in the 2D array
        Arrays.stream(matches).forEach(subArray -> {
            // count the occurrence of each number at array[i][0]
            int num1 = subArray[0];
            counts1.put(num1, counts1.getOrDefault(num1, 0) + 1);
            // count the occurrence of each number at array[i][1]
            int num2 = subArray[1];
            counts2.put(num2, counts2.getOrDefault(num2, 0) + 1);
        });

        //List<Integer> List1 = new ArrayList<>();
        /*List<Integer> List2 = new ArrayList<>();*/
        //iterate the hashmap, find the keys that are in counts1 but not in counts2.
        // Use streams to find keys that are in counts1 but not in counts2
        Set<Integer> keysInCounts1ButNotCounts2 = counts1.keySet().stream()
                .filter(key -> !counts2.containsKey(key))
                .collect(Collectors.toSet());

        // print these keys
        //System.out.println("Keys in counts1 but not in counts2: " + keysInCounts1ButNotCounts2);
        List<Integer> listOfkeysInCounts1ButNotCounts2 = keysInCounts1ButNotCounts2.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> singleOccurrenceKeys = counts2.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        List<List<Integer>> combined = Arrays.asList(listOfkeysInCounts1ButNotCounts2, singleOccurrenceKeys);
        return combined;
    }
}
