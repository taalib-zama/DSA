package prefixSum.KradiesSubarrayAvg;


import java.sql.Array;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {8};
        int k = 11110;
        int[] result = Solution.getAverages(arr,k);
        int[] result2 = Solution.getAverages1(arr,k);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}
