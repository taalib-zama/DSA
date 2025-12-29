package backlog.leetcodeMustDo150.mergeSortedarray;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0}; //sorted in increasing order.
        int m = 3;
        int[] nums2 = {2,5,6};      //sorted in increasing order.
        int n = 3;
        Solution1.merge(nums1, m, nums2,n);
        //print the num1
        Arrays.stream(nums1).forEach(System.out::print);
        //can we do it using streams?


    }
}
