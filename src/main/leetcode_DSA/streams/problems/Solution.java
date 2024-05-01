package streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static int sumUsingStreams(int []arr)
    {
        //Your code here
        //use stream.sum()
        // converting array to list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //applying streams.
        int res = Arrays.stream(arr)
                .sum();


        return res;
    }
}
