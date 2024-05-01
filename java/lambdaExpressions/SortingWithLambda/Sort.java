package lambdaExpressions.SortingWithLambda;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Rachael","Ross","Monica",
                "Chandler","Joey","Phoebe");

        //Cloning the the nameList for the demo
        List<String> clonedNameList1 = new ArrayList<String>(nameList);
        List<String> clonedNameList2 = new ArrayList<String>(nameList);
        List<String> clonedNameList3 = new ArrayList<String>(nameList);
        List<String> clonedNameList4 = new ArrayList<String>(nameList);

        // 1 . Sorting using collections sort.
        System.out.println("Sorting done by Collections.sort(): ");
        Collections.sort(clonedNameList1);
        System.out.println(clonedNameList1);


        //2. Sorting using List.sort()
        // a - based on natural order
        //Lambda Expression for sorting the list in Natural Order
        Comparator<String> criteria = (str1, str2) -> str1.compareTo(str2);         //comparator
        System.out.println("Sorting done by list.sort() in Natural Order: ");
        clonedNameList2.sort(criteria);
        System.out.println(clonedNameList2);


        //b - sorting based on length of elements :
        System.out.println("Sorting done by list.sort() on the basis of Length: ");
        clonedNameList3.sort((str1, str2) -> str1.length() - str2.length());
        System.out.println(clonedNameList3);

        //c. soring based on first character of string
        System.out.println("Sorting done by list.sort() on the basis of First Character: ");
        clonedNameList3.sort((str1, str2) -> str1.charAt(0) - str2.charAt(0));
        System.out.println(clonedNameList3);

    }
}
