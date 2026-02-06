package collections.part2.MapInterface.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        // Creating a TreeMap
        SortedMap<String, String> fileExtensions  = new TreeMap<>();

        // Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        // Printing the TreeMap (Output will be sorted based on keys)
        System.out.println(fileExtensions);



        // Creating a TreeMap with a Custom comparator (Descending order)
        SortedMap<String, String> fileExtensionsWithCustomComparator = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        /*
            The above TreeMap with custom Comparator can be simply written as -
            SortedMap<String, String> fileExtensions = new TreeMap<>(Comparator.reverseOrder());
        */

        // Adding new key-value pairs to a TreeMap
        fileExtensionsWithCustomComparator.put("python", ".py");
        fileExtensionsWithCustomComparator.put("c++", ".cpp");
        fileExtensionsWithCustomComparator.put("kotlin", ".kt");
        fileExtensionsWithCustomComparator.put("golang", ".go");
        fileExtensionsWithCustomComparator.put("java", ".java");

        // Printing the TreeMap (The keys will be sorted based on the supplied comparator)
        System.out.println(fileExtensionsWithCustomComparator);


        System.out.println("Size of map : " + fileExtensionsWithCustomComparator.size());

        fileExtensions.forEach((k,v) ->
        {
          if(k.startsWith("j")){
              System.out.println("Key : " + k + " Value : " + v);
          }
        });


        // Find the first and last entry
       /* System.out.println("First entry in employees map : " + fileExtensions.firstEntry());
        System.out.println("Last entry in employees map : " + fileExtensions.lastEntry());
*/
        // Find the entry whose key is just less than the given key
        /*Map.Entry<Integer, String> employeeJustBelow = fileExtensions.lowerEntry(1002);
        System.out.println("Employee just below id 1002 : " + employeeJustBelow);

        // Find the entry whose key is just higher than the given key
        Map.Entry<Integer, String> employeeJustAbove = employees.higherEntry(1002);
        System.out.println("Employee just above id 1002 : " + employeeJustAbove);*/


    }
}
