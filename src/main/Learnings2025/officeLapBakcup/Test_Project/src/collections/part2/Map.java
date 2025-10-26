package collections.part2;

import java.util.Iterator;

public class Map {
    // Java program to demonstrate working of Map
    // using HashMap

    public static void main(String[] args) {
        // Create a HashMap to store String values corresponding to integer keys
        java.util.Map<Integer, String> map = new java.util.HashMap<>();

        // Input the values
        map.put(1, "Geeks");
        map.put(12, "forGeeks");
        map.put(15, "A computer");
        map.put(3, "Portal");

        // Printing the Map
        System.out.println(map);


        //iterate the hashmap using iterator
        Iterator<java.util.Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
    }
}
