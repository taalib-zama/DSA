package leetcode.binarySearch;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Sample {
    public static void main(String[] args) {
        //give int array and target, return index of target in array

        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        //find the index of target using binary search.
        //if target is not in the array, return -1
        int index = binarySearch(arr, target);
        System.out.println(index); // Output: 3
    }


    /*public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found*/


}
