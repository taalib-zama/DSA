package FP.flatmap.findMaxOccurence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*List<Integer> arr=  Arrays.asList(1, 2, 3, 4, 1, 1, 1, 5, 6, 1, 2, 2, 2, 2, 7, 7, 7, 7);
        Map<Integer, Long> counts = arr.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        //print the elements of hashmap
        counts.forEach((Elements, Count) -> {
            System.out.println("Element " + Elements + " occurs " + Count + " times");
        });

        //max of elements occuring in list
        counts.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);


        //print the elements which are occuring more than 3 times
        counts.entrySet().stream().filter(entry -> entry.getValue() > 3).forEach(System.out::println);

        //same pseudocode
        List<Integer> maxOccurence =
        counts.entrySet().stream()
                .filter(entry -> entry.getValue() > 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(maxOccurence);


        List<Character> input = Arrays.asList('a','v', 'a', 'a', 'c', 'p', 'i');

        Map<Character, Integer> visited= new HashMap<>();

        for (Character element : input) {
            if (visited.containsKey(element)){
                visited.put(element, visited.get(element)+1);
            }
            else {
                visited.put(element, 1);
            }
        }




        System.out.println(visited);



        String test= "hello";
        //using in place traversal to reverse the sting/
*/

        //using stringbuilder
        String test= "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(test);
        sb.reverse();
        System.out.println(sb);

        //using in place traversal.
        char[] arr= test.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while (left > right) {
            char temp =  arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //move pointers.
            left++;
            right--;
        }
        System.out.println(arr.toString());


        //



    }
}
