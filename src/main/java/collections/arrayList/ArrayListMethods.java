package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        //Adding elements. (any no of elemets can be added as arraylist is dynamic size.
        food.add("Noodles");
        food.add("Pasta");
        food.add("Sandwich");
        System.out.println(food);

        //modifying element at a specified  index.
        food.set(1, "pizza");
        System.out.println("Modified list : " + food);

        //check weather element is present or not.
        System.out.println(food.contains("Sandwich"));

        //removing element.
        food.remove(2);
        System.out.println(food);

        //isEmpty
        if(food.isEmpty()){
            System.out.println("Food list is empty");
        }
        else{
            System.out.println("Not empty");
        }

        //size of arrayList.
        System.out.println("Size of food list : " + food.size());

        //Adding allElements from another list.
        ArrayList<String> foodList2 = new ArrayList<>(List.of("Buger", "sushi","Fish"));
        food.addAll(1,foodList2);
        System.out.println("After adding elements of 2nd foodlist : " +food);
        //the output is : After adding elements of 2nd foodlist : [Noodles, Buger, sushi, Fish, pizza]
        //addition start happening after 2nd element of existing arrayList Food([Noodles, pizza])
        //addAll without index will concatenate the other list to first one.

        //converting list to array.
        Object[] foodArray = food.toArray();


        //deleting all elements from Arraylist.
        //food.clear();
        System.out.println(food);

        System.out.println("current size of food list : "+food.size());

        food.add("Sandwich");
        //returning the last index occourence of sandwich.
        System.out.println(food.lastIndexOf("Sandwich"));




    }
}
