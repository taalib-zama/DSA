package numberofsubarraywithsumEqaultoK.bestsol;

public class Tester {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int sum = -10;
        int n = arr.length;
        System.out.println(Solution.findSubarraySum(arr, n, sum));
    }
}
