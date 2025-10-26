package FP.exercises;

import java.util.Arrays;
import java.util.List;

public class maxElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = arr.stream().reduce(0, (a,b) -> a > b ? a: b );
    }

}
