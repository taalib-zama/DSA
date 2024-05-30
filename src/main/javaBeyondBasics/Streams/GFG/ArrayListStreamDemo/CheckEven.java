package javaBeyondBasics.Streams.GFG.ArrayListStreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEven {
    public static void main(String[] args) {

        List<Integer> ai  = Arrays.asList(5,10,20,30,8,7);  //aslist method
        System.out.println("initial collection "+ ai);

        //printing post stream operation.
        System.out.println(ai.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList()));

        //again printing the original collection. This proves stream doesn't changes data
        System.out.println("original data : "+ai);


        //adding values
        List<Integer> updatedMarks
                = ai.stream()
                .map(i -> i + 6)
                .toList();
        System.out.println(updatedMarks);

    }
}
