package collections;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        // Creating an ArrayList object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        // First lets print the collection
        System.out.println("Printing the collection : "
                + al);// Printing new line for better output readability
        System.out.println();

        // Stream operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        System.out.println(al.stream().filter(i -> i %2 ==0).collect(Collectors.toList()));




    }
}
