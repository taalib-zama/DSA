package backlog.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testString {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";
        System.out.println(A.length() + B.length());
        Boolean flag = A.compareTo(B) > 0;
        System.out.println(flag ? "Yes" : "No");
        //capitalize the first letter of A and B and print in one line.
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)
        + " " + B.substring(0, 1).toUpperCase() + B.substring(1));

        //can we do this in another way?






        //create a list of strings and add these elements to it.
        List<String> list = new ArrayList<String>();
        list.add(A);
        list.add(B);
        //sort the list in lexographical order.
        list.sort(Comparator.naturalOrder());
        System.out.println(A.length() + B.length());
        //iterate over list to print the elements.
        for (String s : list) {
            System.out.println(s);
        }
    }

}
