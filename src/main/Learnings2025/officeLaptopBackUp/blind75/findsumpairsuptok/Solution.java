package blind75.findsumpairsuptok;

import java.util.HashMap;



public class Solution {
    public static boolean checkIfPairExists (int[] arr, int k) {
        HashMap<Integer, Boolean> visitedMap = new HashMap<>();
        for (int element : arr) {
            if (visitedMap.containsKey(k - element)) {
                System.out.println("Pair with given sum " + k + " is (" + element + ", " + (k - element) + ")");
                return true;
            } else visitedMap.put(element, true);
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = {{4, 5, 1, 7, 2},{8,2,9,5,10,1}};
        int[] k = {3,10};
        for(int i = 0; i < k.length ; i++)
            System.out.println("Pair sum found ? " + checkIfPairExists(arr[i], k[i]));

    }
}
