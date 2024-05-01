package collections.generics;

import java.util.ArrayList;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();//Line1
        nameList.add("Harrison");
        nameList.add("Sirius");
        nameList.add("James");
        nameList.add("Lily");
        nameList.add("Cho");
        nameList.add("Hermione");
        findLongestString(nameList);
    }

    public static void findLongestString(List<String> list) {
        String longest = "";
        for (String object : list) {
            if(object.length() > longest.length())
                longest = object;
        }
        System.out.println("The string having the maximum length is "+ longest);
    }

}
