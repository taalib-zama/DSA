package collections.arrayList;

import java.util.ArrayList;

public class HeterogeneousArrayList {
    public static void main(String[] args) {

        //You can have a heterogenous array, which means a mixture of data types,


        ArrayList food = new ArrayList(); //no use of Generics here.

        //adding heterogenous elemets :
        food.add("Noodles"); // Adding the elements
        food.add("Burger");
        food.add("Pasta");
        food.add("Sandwich");
        food.add(12);
        food.add(true);
        System.out.println(food);
        System.out.println(food.get(1));

        //using enhanced for loop.
        for (Object temp : food) {
            System.out.println(temp);
        }

        System.out.println(food.size());
//        findLongestString(food);
//
//        //finding the largest string among them .
//        public static void findLongestString(Object list) {
//            Object longest = "";
//            for (Object object : list) {
//                if(object.size() > longest.size()) //Line1
//                    longest = object;
//            }
//            System.out.println("The string having the maximum length is "+ longest);
//
//    }
    }
}