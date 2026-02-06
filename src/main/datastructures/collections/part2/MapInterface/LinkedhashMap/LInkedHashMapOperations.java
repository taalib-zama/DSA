package collections.part2.MapInterface.LinkedhashMap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LInkedHashMapOperations {
    public static void main(String[] args) {

        List<Book> list = Stream.of(
                new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8),
                new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4),
                new Book(103, "Operating System", "Galvin", "Wiley", 6)
        ).toList();



        // LinkedHashMap in Java
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();


        list.forEach(book -> linkedHashMap.put(book.getId(), book.getName()));
        linkedHashMap.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value));

        //check if a key exists in hashmap.
        linkedHashMap.entrySet().stream().filter(e-> e.getKey()==102)
                .forEach(e-> System.out.println("Key 102 exists with value: "+ e.getValue()));

        // For straightforward checks, using the built-in Map
        // methods is more efficient and readable.

        //check if value exists in hashmap.
        linkedHashMap.entrySet().stream().filter(e-> e.getValue().equals("Operating System") )
                .forEach(e-> System.out.println("Value 'Operating System' exists with key: "+ e.getKey()));


        // Change the value associated with an existing key
        Integer id = 1004;
        linkedHashMap.put(id, "Bob");
        System.out.println("Changed the name of customer with id " + id + ", New mapping : " + linkedHashMap);










    }
}
