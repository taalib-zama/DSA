package lists;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        //creating arraylist from arrays.
        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));
        //Converting Array to List
        List<String> list = new ArrayList<String>();
        for (String lang : array) {
            list.add(lang);
        }
        System.out.println("Printing List: " + list);




        //iterating through a list.
        List<String> list2=new ArrayList<String>();
        //Adding elements in the List
        list2.add("Mango");
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list2)
            System.out.println(fruit);



        //List to array.
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        //Converting ArrayList to Array
        String[] array2= fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array2));
        System.out.println("Printing List: "+fruitList);


        //accessing the element
        System.out.println("Returning element: "+fruitList.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        fruitList.set(1,"Dates");
        fruitList.add(list.size(), "NewFruit");               //new index = size (4) taken as index
        System.out.println("Updated list : " +fruitList);

        //Sorting the list
        Collections.sort(fruitList);
        System.out.println("Sorted List : "+fruitList);


        //ListIterator Interface is used to traverse the element in a backward and forward direction.
        ListIterator<String> itr=fruitList.listIterator();
        //traversing in forward direction.
        while(itr.hasNext()){
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }

        //traversing in backward direction
        while(itr.hasPrevious()){
            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }




}

