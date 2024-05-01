package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();
        //adding element
        companyList.add("Apple");
        companyList.add("Samsung");
        companyList.add("Huawei");

        //comparator :
        // Now creating a comparator
        Comparator<String> com
                = (String o1, String o2) -> o1.compareTo(o2);

        // Sorting the list
        Collections.sort(companyList, com);

        // Iterating using for each loop
        for (String name : companyList) {

            // Printing the elements
            System.out.println(name);
        }
    }
}
