package arrays.binarySearch;

public class Solution {
    public static int binarysearch(int[] arr, int k) {
        int high = arr.length - 1;
        int low = 0;
        while (high - low > 1){
            int mid = (high +low ) / 2;
            if(arr[mid] < k){
                low = mid  +1;
            }
            else{
                high = mid;
            }
        }
        if(arr[low] == k){
            return low;
        }
        else
            return high;
    }
}
