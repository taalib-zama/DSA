package sortingAlgo.sortingusingJDK;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        Arrays.sort(arr);                       //uses dual pivot quicksort. O(log n) performance.
        Arrays.parallelSort(arr);               // for large dataset parallel sort is better.
        //printing elements :
        for(int i : arr){
            System.out.println(i);
        }
    }
}
