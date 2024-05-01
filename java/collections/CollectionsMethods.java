package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(50);
        list1.add(15);
        list1.add(20);
        list1.add(1);

        Collections.sort(list1);						//sorting the collection
        System.out.println(list1);

        Collections.reverse(list1);						//reversing the collection
        System.out.println(list1);

        Integer max = Collections.max(list1); 			//finding the maximum in the collection
        System.out.println(max);

        Integer min = Collections.min(list1); 			//finding minimum in a collection
        System.out.println(min);

        Integer freq = Collections.frequency(list1, 1); //finding the frequency of an element in a collection
        System.out.println(freq);

        Collections.swap(list1, 1, 3);				    //swapping two elements in a collection
        System.out.println(list1);

        Collections.shuffle(list1); 					//shuffling the elements in a collection
        System.out.println(list1);
    }
}
