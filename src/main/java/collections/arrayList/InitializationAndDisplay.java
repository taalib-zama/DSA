package collections.arrayList;

import java.util.ArrayList;

public class InitializationAndDisplay {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
         //Additon of items :
        food.add("Noodles"); // Adding the elements
        food.add("Burger");
        food.add("Pasta");
        food.add("Sandwich");

        //Displaying items :
        System.out.println(food);
        System.out.println(food.get(1)); //1 is the index of element to be displayed

        //iterating over Araylist :
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        //using enhanced for loop
        for (String temp: food) {
            System.out.println(temp);
        }




    }
}
