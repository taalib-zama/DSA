package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HOF {
    public static void main(String[] args) {
        //example 1q :
        List<String> stringList = new ArrayList<String>();
        stringList.add("Abigail");
        stringList.add("Zachariah");
        stringList.add("Damien");
        stringList.add("Ralph");
        stringList.add("Gabriel");
        stringList.sort((str1,str2)->str1.compareTo(str2));
        System.out.println(stringList);



    //sorting based on collections.
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Abc");
        list.add("BCD");

        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });

        System.out.println(list);



        //sorting in reverse order.
        Comparator<String> comparator = (String a, String b) -> {
            return a.compareTo(b);
        };

        Comparator<String> comparatorReversed = comparator.reversed();

        Collections.sort(list, comparatorReversed);

        System.out.println(list);
    }
}
