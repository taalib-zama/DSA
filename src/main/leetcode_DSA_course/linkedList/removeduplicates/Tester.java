package leetcode_DSA_course.linkedList.removeduplicates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        /*LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 1, 2, 3, 3));
        // Print the LinkedList
        System.out.println("LinkedList before removal : "+linkedList);
        Solution.removeDuplicates(linkedList);
        System.out.println("LinkedList after removal : "+linkedList);*/

        // Initialize a LinkedList with Integer elements
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 1, 2, 3, 3));

        // Remove duplicates using Java streams
        linkedList = linkedList.stream().distinct().collect(Collectors.toCollection(LinkedList::new));

        // Print the modified LinkedList without duplicates
        System.out.println(linkedList);

    }
}
