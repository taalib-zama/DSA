package collections.part1.ListInterface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        //implements both deque and list interfaces
        // LinkedList is a doubly linked list implementation of the List and Deque interfaces
        // It allows for efficient insertion and removal of elements at both ends of the list
        //supports deque methods like - getFirst, getLast, addFirst, addLast, removeFirst, removeLast
        //it also supports index based operations like get(Index), set(Index, Element), add(Index, Element), remove(Index)
        List<Integer> list2 = List.of(200, 300, 400, 100, 5);
        LinkedList<Integer> LinkedListSample = new LinkedList<>(list2);

        System.out.println("FIrst element" + LinkedListSample.getFirst());

        //using list functionality.
        System.out.println("First element: " + LinkedListSample.get(0)
                + "\nLast element: " + LinkedListSample.get(LinkedListSample.size() - 1));


        //time complexity.
        //insertion at start and end : O(1)
        //insertion at middle index: O(n)
        //search : O(n)
        //maintains insertion order.
        //null and duplicate both allowed


    }
}
