package findpairsumsuptoK.bestsolution;

import java.util.HashMap;

public class Solution {
    public static boolean findPair(int[] arr, int k) {
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        for (int element : arr) {
            if (visited.containsKey(k - element)){
                System.out.println("the pair elements are : "+(k-element) +"," + element);
                return true;
            }
            else visited.put(element, true);
        }
        return false;

    }

    public static void main(String[] args) {
            int[][] arr = {{4, 5, 1, 7, 2},{8,2,9,5,10,1}};
            int[] k = {3,10};
            for(int i = 0; i < k.length ; i++)
            System.out.println("Pair sum found ? " + findPair(arr[i], k[i]));
    }
}
