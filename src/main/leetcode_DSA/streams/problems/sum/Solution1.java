package streams.problems.sum;

import java.util.Arrays;


public class Solution1 {
    public static int maxUsingStreams(int []arr)
    {
        //Your code here
        //Use stream().max().getAsInt()
        return(Arrays.stream(arr).max().getAsInt());
    }


    public static double avgUsingStreams(int []arr)
    {
        //Your code here
        //Use stream().average().getAsDouble()
        //Just return and don't typecase anything.
        return(Arrays.stream(arr).average().getAsDouble());
    }


    public static int filterUsingStreams(int []arr)
    {
        //Your code here
        //Use filter() to get only odd elements then apply max().getAsInt()
        return(Arrays.stream(arr).filter(x->x%2!=0).max().getAsInt());
    }
}
