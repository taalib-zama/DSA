package FP.flatmap.findMaxOccurence;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        //finding maximum value
        List<Integer> test = Arrays.asList(1, 2, 3, 4, 1, 1, 1, 5, 6, 1, 2, 2, 2, 2, 7, 7, 7, 7);
        int max = test.stream().reduce(0, (a,b) -> a< b ? a : b);

    }
}
