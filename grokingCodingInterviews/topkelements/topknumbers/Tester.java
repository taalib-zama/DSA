package topkelements.topknumbers;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11};
        int k = 3;
        int[] arr2 = {5, 12, 11, -1, 12};
        int k2 = 3;
        System.out.println(Solution.findKLargestNumbers(arr, k));
    }
}
