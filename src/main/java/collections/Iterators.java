package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        ArrayList List2 = new ArrayList();      //heterogeneous array with multiple types of elements
        nameList.add("Harrison");
        nameList.add("Sirius");
        nameList.add("James");
        nameList.add("Lily");

        List2.add("Alex");
        List2.add("Max");
        List2.add(32);
        List2.add(false);

    //getting iterator object
        Iterator<String> itr = nameList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        //using the same for heterogeneous array.
        Iterator itr2 = List2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());   // thus iterator works for heterogeneous arrays also.
        }

        //using listIterator - Allows traversing list in both directions.(forward and backwards.)
        ListIterator<String> itr3 = nameList.listIterator();
        //iterating in forward dorection.
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        //iterating in backward direction.
        while(itr3.hasPrevious()){
            System.out.println(itr3.previous());
        }



    }
}
