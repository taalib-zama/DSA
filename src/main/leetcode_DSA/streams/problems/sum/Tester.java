package streams.problems.sum;

import streams.problems.Solution;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Solution1.maxUsingStreams(arr));
        System.out.println(Solution1.filterUsingStreams(arr));
    }
}
