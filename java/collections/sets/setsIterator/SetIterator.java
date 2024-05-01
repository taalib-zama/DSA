package collections.sets.setsIterator;

import java.util.*;

public class SetIterator {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,9,5,6,7,8);
        //converting list to hashset.
        Set<Integer> hset = new HashSet<Integer>(numList);
        //Creating iterator over obj set.
        Iterator<Integer> setIterator = hset.iterator();
        //using hasnext method to iterate over set.
        while(setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

    }
}
