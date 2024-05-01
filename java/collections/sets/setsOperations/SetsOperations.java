package collections.sets.setsOperations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsOperations {
    public static void main(String[] args) {
        ///creating hashset.
        Set<String> food = new HashSet<>(Set.of("Pasta", "Noodles"/*"Pasta"*/ , "Sandwich", "Burger")); // can't have duplicate elements here.
        //adding element to hashset.
        food.add("Noodles");    //this element is duplicate but still doesn't result in run-time error.
        food.add("Pizza");
        //checking the set is empty or not.
        System.out.println("Is set empty? : " +food.isEmpty());
        //printing the set .
        System.out.println("The current elements in set" + food);


        //size of hashset.
        System.out.println("The number of food items in the set.. " +food.size());

        //checking if hashset contains an element :
        String foodItem = "Pizza";
        if(food.contains(foodItem)){
            System.out.println(foodItem +"is available.");
        }
        else{
            System.out.println("Food item not available");
        }

        //removing element from a set :
        food.remove("Burger");
        System.out.println("Hashset after removing burger : " +food);


        //using iterator.
        Iterator<String> item  = food.iterator();
        while(item.hasNext()){
            System.out.println(item.next());
        }

        //removing all elements.
        food.clear();
        System.out.println("List after clearing all elements :" +food);
    }
}
