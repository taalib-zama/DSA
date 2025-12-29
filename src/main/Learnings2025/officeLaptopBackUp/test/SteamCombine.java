package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamCombine {
    public static void main(String[] args) {
        // Two sorted lists
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

        // Merge and sort the lists
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()) // Combine the two streams
                .sorted() // Sort the combined stream
                .toList(); // Collect into a list

        // Print the merged and sorted list
        System.out.println("Merged and Sorted List: " + mergedList);



        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list3.stream()
                .filter(list4::contains)
                .toList();
        System.out.println("Intersection of list1 and list3: " + intersection);
    }
}
