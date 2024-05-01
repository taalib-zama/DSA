package findpairsumsuptoK.Solution1;

import java.util.Arrays;

public class  Solution2 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 7, 2};
        int k = 3;
        System.out.println("Pair sum found ? " + findPair(arr, k));
    }


    public static boolean findPair(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                System.out.println("Paired sum elements : " +arr[left] + "," + arr[right]);
                return true;
            }
            else if (arr[left] + arr[right] < k) {
                left++;
            }
            else right--;
        }
        return false;

    }
}
