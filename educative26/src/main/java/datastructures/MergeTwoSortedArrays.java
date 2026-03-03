package datastructures;

import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        //given two arraylists of sorted integers, merge them into a single sorted arraylist
        java.util.List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(9);
        list1.add(7);
        List<Integer> list2 = new java.util.ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(7);
        //merge two sorted arraylists using streams
        List<Integer> mergedList = java.util.stream.Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .toList();

        System.out.println("Merged and sorted list: " + mergedList);


    }
}
