package backlog.gfg.Strings;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] input = {"Abc" ,"Xyz" ,"fghfg" ,"adas" ,"tuTY", "dsa"};
        sortByComparator(input);
        //interate throught the array of strings 'input' and display it.
        for (String s : input) {
            System.out.println(s);
        }
    }


    public static void sortByComparator(String [] arr)
    {
        //Your code here
        //You sort it in a single line using method references 
        //You need to sort the array lexicographically while ignoring the case
        Arrays.sort(arr, String::compareToIgnoreCase);
    }
}
