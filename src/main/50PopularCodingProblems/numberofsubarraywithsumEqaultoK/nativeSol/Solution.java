package numberofsubarraywithsumEqaultoK.nativeSol;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {           //check all s   ubarray from this index onwards.

                // calculate required sum
                sum += arr[j];
                // check if sum is equal to required sum
                if (sum == k)
                    res++;                  //res hold the number of subarrays holding the correct sum.
            }
        }
        System.out.println(res);
    }
}
