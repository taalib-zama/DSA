package findpairsumsuptoK.usingJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SolutionUsingStream {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(4, 5, 1, 7, 2),
                Arrays.asList(8, 2, 9, 5, 10, 1)
        );
        List<Integer> k = Arrays.asList(3, 10);

        //iterate over both lists and call rthe function.

    }



        /*public static boolean findPair(List<Integer> arr, Integer k) {
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            return Arrays.stream(arr)
                    .anyMatch(x -> set.contains(k - x) && x != k - x);
        }*/



}
