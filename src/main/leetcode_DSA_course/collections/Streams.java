package collections;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // Creating an empty Arraylist
        List<String> CompanyList = new ArrayList<>();

        // Adding elements to above ArrayList
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");
        CompanyList.add("zolo");


        // Sorting the list
        // using sorted() method and
        // printing using for-each loop
        CompanyList.stream().sorted().forEach(
                System.out::println);
    }
}
