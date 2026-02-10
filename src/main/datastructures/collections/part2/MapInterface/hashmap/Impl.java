package collections.part2.MapInterface.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Impl {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();

        //add sample data to hashmap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);


        //put if absent :
        numberMapping.putIfAbsent("Two", 22); // won't update as "Two" is already present
        numberMapping.putIfAbsent("Four", 4); // will add as "Four" is not present


        //check if empty :
        System.out.println("Is the hashmap empty? " + numberMapping.isEmpty());

        //check if key exisits :
        System.out.println("Does key 'Three' exist? " + numberMapping.containsKey("Three"));


        //check if value exists :
        System.out.println("Does value 5 exist? " + numberMapping.containsValue(5));

        //get value by key :
        System.out.println("Value for key 'One': " + numberMapping.get("One"));
        //returns null if key not found

        //modify value associated with a key :
        numberMapping.replace("Three", 33);


        ///Remove a key from a HashMap | remove(Object key)
        //Remove a key from a HashMap only if it is associated with a given value | remove(Object key, Object value)


        System.out.println("-----------Printing the hashmap--------");
        numberMapping.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });

    }
}
