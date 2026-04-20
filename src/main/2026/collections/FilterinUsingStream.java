package collections;

import java.util.List;

public class FilterinUsingStream {
    public static void main(String[] args) {
    List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Alone", "Alex", "Ava");
    //filter list with names with name starting with A.
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() > 3)
                .toList();
        System.out.println(filteredNames);
    }

}
