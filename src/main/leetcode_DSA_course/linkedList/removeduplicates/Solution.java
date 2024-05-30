package leetcode_DSA_course.linkedList.removeduplicates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

    public static void removeDuplicates(LinkedList<Integer> linkedList) {
        //Yes, you can achieve removing duplicates from a LinkedList in Java with inline modification using
        // the distinct()
        //linkedList.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
        //System.out.println(linkedList);

        HashSet<Integer> uniqueElements = new HashSet<>();
        linkedList.removeIf(e -> !uniqueElements.add(e));
        //We use removeIf to remove elements from the linked list if they are not added to the
        // uniqueElements set (meaning they are duplicates).






        //In this code:
        //
        //We use Java streams with the distinct() method to remove duplicates.
        //The distinct() method ensures that only unique elements are retained.
        //We collect the stream back into a LinkedList using Collectors.toCollection(LinkedList::new)

    }
}
