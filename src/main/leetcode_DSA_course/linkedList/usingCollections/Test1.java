package linkedList.usingCollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll);
        List<Integer> number = Arrays.asList(2,3,4,5,6);
        System.out.println(number);


        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 1, 2, 3, 3));

        //using map method.
        List<Integer> squared = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squared);

        //filtering the numbers divisible by 2.
        List<Integer> operated = number.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(operated);


    }
}
